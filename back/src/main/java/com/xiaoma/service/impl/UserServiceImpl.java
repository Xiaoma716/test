package com.xiaoma.service.impl;

import com.xiaoma.mapper.UserMapper;
import com.xiaoma.pojo.User;
import com.xiaoma.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    //添加用户
    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }


    //查询所有用户
    @Override
    public List<User> getUser() {
        List<User> users = userMapper.getUser();
        for (User user : users) {
            Integer permission = user.getPermission();
            String permissionName = userMapper.getPermissionNameByPermissionId(permission);
            user.setPermissionName(permissionName);
        }
        return users;
    }
}

package com.xiaoma.mapper;

import com.xiaoma.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    //添加用户信息
    @Insert("insert into user(username,password,permission) values(#{username},#{password},#{permission});")
    void addUser(User user);

    //查询用户信息
    @Select("select id,username,password,permission from user;")
    List<User> getUser ();
    @Select("select name as permissionName from user_permission where permission = #{permission};")
    String getPermissionNameByPermissionId(Integer permission);
}

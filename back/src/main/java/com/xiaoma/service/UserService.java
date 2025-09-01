package com.xiaoma.service;

import com.xiaoma.pojo.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    List<User> getUser();

}

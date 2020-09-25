package com.guli.shopping.user.service;

import com.guli.shopping.user.bean.UserInfo;

import java.util.List;

public interface UserService {

    List<UserInfo> getUserInfoListAll();
    void addUser(UserInfo userInfo);
    void updateUser(UserInfo userInfo);
    void updateUserByName(String name,UserInfo userInfo);
    void delUser(String id);
}

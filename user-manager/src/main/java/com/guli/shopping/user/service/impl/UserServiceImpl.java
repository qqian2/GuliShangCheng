package com.guli.shopping.user.service.impl;

import com.guli.shopping.user.bean.UserInfo;
import com.guli.shopping.user.mapper.UserMapper;
import com.guli.shopping.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserInfo> getUserInfoListAll() {
        List<UserInfo> userInfoList = userMapper.selectAll();
        return userInfoList;
    }

    public UserInfo getUserInfo(String id){
        UserInfo userInfo = userMapper.selectByPrimaryKey(id);
        return  userInfo;
    }

    @Override
    public void addUser(UserInfo userInfo) {
        userMapper.insert(userInfo);
    }

    @Override
    public void updateUser(UserInfo userInfo) {
        userMapper.updateByPrimaryKeySelective(userInfo);
    }

    @Override
    public void updateUserByName(String name, UserInfo userInfo) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andEqualTo("name",name);
        userMapper.updateByExample(userInfo,example);
    }

    @Override
    public void delUser(String id) {
        userMapper.deleteByPrimaryKey(id);
    }
}

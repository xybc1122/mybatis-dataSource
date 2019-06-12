package com.example.demo1.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo1.mapper.UserMapper;
import com.example.demo1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName impl
 * Description TODO
 * @Author 陈恩惠
 * @Date 2019/6/12 15:46
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper uMapper;

    @Override
    public User getUser() {
        return uMapper.getUser();
    }
}

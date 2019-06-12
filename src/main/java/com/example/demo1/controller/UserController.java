package com.example.demo1.controller;

;
import com.example.demo1.dds.DynamicDataSourceContextHolder;
import com.example.demo1.model.User;
import com.example.demo1.service.UserServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserController
 * Description TODO
 * @Author 陈恩惠
 * @Date 2019/6/12 14:53
 **/
@RestController
public class UserController {
    @Autowired
    private UserServiceImpl impl;

    @GetMapping("/get")
    public void s() {
        List<String> s = new ArrayList<>();
        s.add("slave");
        s.add("master");
        s.add("t2");
        for (String str : s) {
            DynamicDataSourceContextHolder.setDataSourceKey(str);
            List<User> users = impl.list();
            System.out.println(users);
        }


    }
}

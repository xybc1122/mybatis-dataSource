package com.example.demo1.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo1.model.User;
import org.apache.ibatis.annotations.Select;


/**
 * @ClassName UserMapper
 * Description TODO
 * @Author 陈恩惠
 * @Date 2019/6/12 14:52
 **/
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from user")
    User getUser();
}

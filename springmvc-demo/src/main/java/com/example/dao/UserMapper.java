package com.example.dao;

import com.example.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by ldd on 2018/4/8.
 */
@Mapper
@Component
public interface UserMapper {
    User selectUserByName(String userName);
}

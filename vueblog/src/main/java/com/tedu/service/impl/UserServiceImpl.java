package com.tedu.service.impl;

import com.tedu.entity.User;
import com.tedu.mapper.UserMapper;
import com.tedu.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}

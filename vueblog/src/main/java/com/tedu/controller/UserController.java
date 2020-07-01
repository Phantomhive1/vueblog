package com.tedu.controller;


import com.tedu.common.lang.Result;
import com.tedu.entity.User;
import com.tedu.service.UserService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequiresAuthentication
    @GetMapping("/index")
    public Object index() {
        User user = userService.getById(1L);
        return Result.succ(200, "操作成功", user);
    }

    @PostMapping("/save")
    public Result save(@Validated @RequestBody User user) { // Validated注解用于校验user，失败则捕获
        //userService.save(user);
        return Result.succ(user);
    }
}

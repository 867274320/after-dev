package org.boy.web.user.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.boy.exception.ServiceException;
import org.boy.web.basic.controller.BasicController;
import org.boy.web.user.entity.User;
import org.boy.web.user.service.UserService;
import org.boy.web.user.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/user")
public class UserController extends BasicController<UserServiceImpl,User> {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public HashMap<String,Object> login(@RequestBody User user) {
        HashMap<String,Object> map = new HashMap<>(4);
        try {
//            userService.login(user);
            map.put("success", true);
            map.put("code",200);
        } catch (ServiceException e) {
            map.put("success", false);
            map.put("code",500);
            map.put("msg",e.getMessage());
        }
        return map;
    }
}

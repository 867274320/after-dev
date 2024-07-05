package org.boy.web.user.service;

import org.boy.web.basic.service.BasicServiceImpl;
import org.boy.web.user.entity.User;
import org.boy.web.user.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BasicServiceImpl<UserMapper,User> implements UserService {
}

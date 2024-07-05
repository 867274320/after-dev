package org.boy.web.user.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.boy.web.basic.mapper.BasicMapper;
import org.boy.web.user.entity.User;

@Mapper
public interface UserMapper extends BasicMapper<User> {
}

package org.boy.web.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.boy.web.user.entity.Emp;

@Mapper
public interface EmpMapper extends BaseMapper<Emp> {
}

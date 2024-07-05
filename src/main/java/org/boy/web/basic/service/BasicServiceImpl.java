package org.boy.web.basic.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.boy.web.basic.mapper.BasicMapper;


public abstract class BasicServiceImpl<M extends BasicMapper<T>,T> extends ServiceImpl<M,T> implements BasicService<T> {

}

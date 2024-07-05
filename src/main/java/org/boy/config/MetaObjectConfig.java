package org.boy.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.boy.utils.DateUtils;
import org.boy.utils.IdUtils;

import java.util.Date;


public class MetaObjectConfig implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        metaObject.setValue("rowId", IdUtils.newId());
        metaObject.setValue("createTime", DateUtils.getCurrentTime());
        metaObject.setValue("createBy", 1L);
        metaObject.setValue("updateTime", DateUtils.getCurrentTime());
        metaObject.setValue("updateBy", 1L);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        metaObject.setValue("updateTime", DateUtils.getCurrentTime());
        metaObject.setValue("updateBy", 1L);
    }
}

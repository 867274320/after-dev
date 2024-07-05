package org.boy.web.basic.controller;


import com.alibaba.fastjson2.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.boy.exception.ServiceException;
import org.boy.utils.FiltersRow;
import org.boy.utils.StrUtils;
import org.boy.web.basic.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

public class BasicController<M extends BasicService,T> {

    @Autowired
    private M basicService;


    @GetMapping("/queryByExamplePage")
    public HashMap<String,Object> queryByExamplePage(HttpServletRequest request) {
        HashMap<String,Object> map = new HashMap<>(4);
        try {
            String filtersRow = request.getParameter("filtersRow");


            System.out.println("filtersRow=="+filtersRow);

            QueryWrapper<T> qw = new QueryWrapper<>();

            if (StrUtils.isNotBlank(filtersRow)) {
                List<FiltersRow> fr = JSON.parseArray(filtersRow, FiltersRow.class);
                for (FiltersRow f : fr) {
                    switch (f.getOperator()) {
                        case ">=":
                            break;
                        case "<=":
                            break;
                        default:
                            throw new ServiceException("请联系管理员，配置操作符");
                    }
                }
            }
            qw.eq("is_del", "N");

            map.put("success", true);
            map.put("code",200);
            map.put("data",basicService.list(qw));
        } catch (ServiceException e) {
            map.put("success", false);
            map.put("code",500);
            map.put("msg",e.getMessage());
        }
       return map;
    }

    @GetMapping("/queryById")
    public HashMap<String,Object> queryById(@RequestParam Long rowId) {
        HashMap<String,Object> map = new HashMap<>(4);
        try {
            QueryWrapper<T> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("row_id", rowId);
            queryWrapper.eq("is_del", "N");
            T entity = (T) basicService.getOne(queryWrapper);
            map.put("success", true);
            map.put("code",200);
            map.put("data",entity);
        } catch (ServiceException e) {
            map.put("success", false);
            map.put("code",500);
            map.put("msg",e.getMessage());
        }
        return map;
    }

    @PostMapping("/insertRow")
    public HashMap<String,Object> insertRow(@RequestBody T entity) {
        HashMap<String,Object> map = new HashMap<>(4);
        try {
            basicService.save(entity);
            map.put("success", true);
            map.put("code",200);
        } catch (ServiceException e) {
            map.put("success", false);
            map.put("code",500);
            map.put("msg",e.getMessage());
        }
        return map;
    }

    @PostMapping("/batchInsert")
    public HashMap<String,Object> batchInsert(@RequestBody List<T> entities) {
        HashMap<String,Object> map = new HashMap<>(4);
        try {
            basicService.saveBatch(entities);
            map.put("success", true);
            map.put("code",200);
        } catch (ServiceException e) {
            map.put("success", false);
            map.put("code",500);
            map.put("msg",e.getMessage());
        }
        return map;
    }

    @PostMapping("/updateById")
    public HashMap<String,Object> updateById(@RequestBody T entity) {
        HashMap<String,Object> map = new HashMap<>(4);
        try {
            basicService.updateById(entity);
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

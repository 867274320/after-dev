package org.boy;


import org.boy.web.user.entity.Emp;
import org.boy.web.user.mapper.EmpMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class DruidTest {


    @Autowired
    private EmpMapper empMapper;

    @Test
    public void test() {
        List<Emp> emps = empMapper.selectList(null);
        emps.forEach(System.out::println);
    }


    @Test
    public void insert() {
        Emp emp = new Emp();
        emp.setLastName("MP");
        emp.setGender(1);
        emp.setAge(20);
        emp.setEmail("867274320@qq.com");
        int insert = empMapper.insert(emp);
        System.out.println(emp.getId());
    }


}

package org.boy.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//
//@Aspect
//@Component
public class HelloAspect {

    @Before(value = "execution(* org.boy.web.*.controller.*.*(..))")
    public void before() {
        System.out.println("before");
    }

    @Around(value = "execution(* org.boy.web.*.controller.*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around before");
        Object proceed = joinPoint.proceed();
        System.out.println("around after");
        return proceed;
    }
}

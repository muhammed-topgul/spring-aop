package com.muhammedtopgul.aop.advices;

/*
 * created by Muhammed Topgul
 * on 05/08/2021
 * at 21:28
 */

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Before("execution(* * (..)))")
    public void logBeforeAll() {
        System.out.println("Log before all executing...");
    }

    @After("execution(* * (..)))")
    public void logAfterAll() {
        System.out.println("Log after all executing...");
    }

    @After("execution(* com.muhammedtopgul.aop.advices.CustomerService.* (..)))")
    public void logAfterCustomerService() {
        System.out.println("Log after CustomerService executing...");
    }
}

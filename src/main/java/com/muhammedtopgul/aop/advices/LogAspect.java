package com.muhammedtopgul.aop.advices;

/*
 * created by Muhammed Topgul
 * on 05/08/2021
 * at 21:28
 */

import com.muhammedtopgul.aop.advices.model.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Before("execution(* com.muhammedtopgul.aop.advices.AccountService.* (..)))")
    public void logBeforeAll(JoinPoint joinPoint) {
        System.out.println("Log before all executing..." + joinPoint.getSignature().getName());
        System.out.println("Target class name: " + joinPoint.getTarget().getClass().getName());
        System.out.println("Args: " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getThis().getClass().getName());
    }

    @After("execution(* * (..)))")
    public void logAfterAll(JoinPoint joinPoint) {
        System.out.println("Log after all executing..." + joinPoint.getSignature().getName());
    }

    @After("execution(* com.muhammedtopgul.aop.advices.CustomerService.* (..)))")
    public void logAfterCustomerService(JoinPoint joinPoint) {
        System.out.println("Log after CustomerService executing..." + joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "execution(* * (..))", returning = "myName")
    public void logAfterReturningName(String myName) {
        System.out.println("Returned value: " + myName);
    }

    @AfterReturning(pointcut = "execution(* * (..))", returning = "user")
    public void logAfterReturningUser(User user) {
        System.out.println("Returned User: " + user.toString());
    }
}

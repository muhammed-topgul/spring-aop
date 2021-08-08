package com.muhammedtopgul.aop.advices;

/*
 * created by Muhammed Topgul
 * on 05/08/2021
 * at 21:28
 */

import com.muhammedtopgul.aop.advices.exception.MyException;
import com.muhammedtopgul.aop.advices.model.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @After("execution(* * (..)))")
    public void logAfterAll(JoinPoint joinPoint) {
        System.out.println("Log after all executing..." + joinPoint.getSignature().getName());
    }

    @Before("execution(* com.muhammedtopgul.aop.advices.AccountService.* (..)))")
    public void logBeforeAll(JoinPoint joinPoint) {
        System.out.println("Log before AccountService executing..." + joinPoint.getSignature().getName());
        System.out.println("Target class name: " + joinPoint.getTarget().getClass().getName());
        System.out.println("Args: " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getThis().getClass().getName());
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

    @AfterThrowing(pointcut = "execution(* getAge(..))", throwing = "exception")
    public void logAfterThrowing(JoinPoint joinPoint, MyException exception) {
        System.out.println("Log After Throwing: " + joinPoint.getSignature().getName() + " method throws : " + exception.getMessage());
    }

    @Around("execution(* com.muhammedtopgul.aop.advices.CustomerService.calculatePayment(double , int ))")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("Args in Around Advice: " + args[0] + ", " + args[1]);

        Object result = null;

        try {
            result = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.out.println("Original actual result of calculatePayment method: " + result);

        // changes actual result
        args[0] = 50;
        args[1] = 15;

        try {
            result = joinPoint.proceed(args);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.out.println("Modified actual result of calculatePayment method: " + result);

        return 30.0;
    }
}

package com.muhammedtopgul.aop.terms;

/*
 * created by Muhammed Topgul
 * on 05/08/2021
 * at 21:28
 */

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    // to any method (first *)
    // to any return type (second *)
    // to any argument ((..))
    @Before("execution(* * (..))")
    public void logBefore() {
        System.out.println("Logging before method being executed...");
    }
}

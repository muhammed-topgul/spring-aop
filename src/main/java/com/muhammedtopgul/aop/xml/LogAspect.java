package com.muhammedtopgul.aop.xml;

/*
 * created by Muhammed Topgul
 * on 05/08/2021
 * at 21:28
 */

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    // to any return type (second *)
    // to any method (first *)
    // to any argument ((..))
    @After("execution(* * (..))")
    public void logAfter() {
        System.out.println("Logging after method being executed...");
    }
}

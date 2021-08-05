package com.muhammedtopgul.aop.proxy;

/*
 * created by Muhammed Topgul
 * on 05/08/2021
 * at 20:57
 */

public class LoggerAspect {

    public void logBefore() {
        System.out.println("Logging before method executed...");
    }

    public void logAfter() {
        System.out.println("Logging after method executed...");
    }
}

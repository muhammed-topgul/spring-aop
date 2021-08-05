package com.muhammedtopgul.aop.proxy;

/*
 * created by Muhammed Topgul
 * on 05/08/2021
 * at 20:53
 */


public class CustomerServiceProxy extends CustomerService {

    LoggerAspect loggerAspect = new LoggerAspect();

    @Override
    public void doSomething() {
        loggerAspect.logAfter();
        super.doSomething();
        loggerAspect.logAfter();
    }
}

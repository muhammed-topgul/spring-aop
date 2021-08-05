package com.muhammedtopgul.aop.proxy;

/*
 * created by Muhammed Topgul
 * on 05/08/2021
 * at 20:49
 */

public class Application {

    public static void main(String[] args) {
        FancyBeanFactory beanFactory = new FancyBeanFactory();
        CustomerService customerService = (CustomerService) beanFactory.getBean("customerService");

        customerService.doSomething();
    }
}

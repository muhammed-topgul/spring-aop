package com.muhammedtopgul.aop.xml;

/*
 * created by Muhammed Topgul
 * on 05/08/2021
 * at 21:20
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        CustomerService customerService = context.getBean(CustomerService.class);

        customerService.doSomething();
    }
}

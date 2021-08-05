package com.muhammedtopgul.aop.advices;

/*
 * created by Muhammed Topgul
 * on 05/08/2021
 * at 21:20
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        CustomerService customerService = context.getBean(CustomerService.class);
        AccountService accountService = context.getBean(AccountService.class);

        customerService.doSomething();
        System.out.println("\n");
        accountService.deposit(100.0);
    }
}

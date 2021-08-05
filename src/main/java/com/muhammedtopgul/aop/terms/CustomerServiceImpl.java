package com.muhammedtopgul.aop.terms;

/*
 * created by Muhammed Topgul
 * on 05/08/2021
 * at 21:21
 */

import org.springframework.stereotype.Component;

@Component
public class CustomerServiceImpl implements CustomerService {

    @Override
    public void doSomething() {
        System.out.println("So Something in CustomerServiceImpl...");
    }
}

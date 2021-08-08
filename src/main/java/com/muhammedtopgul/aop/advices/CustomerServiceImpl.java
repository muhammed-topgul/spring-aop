package com.muhammedtopgul.aop.advices;

/*
 * created by Muhammed Topgul
 * on 05/08/2021
 * at 21:21
 */

import com.muhammedtopgul.aop.advices.model.User;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public void doSomething() {
        System.out.println("So Something in CustomerServiceImpl...");
    }

    public String getName() {
        return "Muhammed Topgül";
    }

    @Override
    public User getUser() {
        return new User("Muhammed", "Topgül");
    }
}

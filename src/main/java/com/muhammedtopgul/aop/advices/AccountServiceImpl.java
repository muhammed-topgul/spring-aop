package com.muhammedtopgul.aop.advices;

/*
 * created by Muhammed Topgul
 * on 05/08/2021
 * at 22:58
 */

import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Override
    public void deposit(double amount) {
        System.out.println("Deposit successfully: " + amount);
    }
}

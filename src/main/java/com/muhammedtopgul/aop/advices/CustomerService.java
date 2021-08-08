package com.muhammedtopgul.aop.advices;

/*
 * created by Muhammed Topgul
 * on 05/08/2021
 * at 21:20
 */

import com.muhammedtopgul.aop.advices.model.User;

public interface CustomerService {

    void doSomething();

    String getName();

    User getUser();

    String getAge();

    double calculatePayment(double rate, int hours);
}

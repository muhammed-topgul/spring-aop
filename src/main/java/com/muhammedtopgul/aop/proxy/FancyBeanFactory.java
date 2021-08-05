package com.muhammedtopgul.aop.proxy;

/*
 * created by Muhammed Topgul
 * on 05/08/2021
 * at 20:47
 */

public class FancyBeanFactory {

    public Object getBean(String beanName) {
        if ("customerService".equals(beanName)) return new CustomerServiceProxy();

        return null;
    }
}

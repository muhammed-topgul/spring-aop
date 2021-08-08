package com.muhammedtopgul.aop.sequence;

/*
 * created by Muhammed Topgul
 * on 05/08/2021
 * at 21:21
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.muhammedtopgul.aop.sequence")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Config {
}

package com.aiguigu.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    //后置处理器 Bean初始前的方法
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("初始前的方法"+o+"对象");
        System.out.println("初始前的方法名字"+s);
        return o;
    }

    @Override
    //后置处理器 Bean 初始后的方法
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("初始后的方法"+o+"对象");
        System.out.println("初始后的方法名字"+s);
        return o;
    }
}

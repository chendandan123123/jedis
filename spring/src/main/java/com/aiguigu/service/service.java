package com.aiguigu.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;


@Service
public class service {


    String name;
    String sex;

    public service(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public service() {
    }

    @Override
    public String toString() {
        return "service{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

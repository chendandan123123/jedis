package com.aiguigu.service;

import com.aiguigu.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class Service02 {
    private  String name;
    private  String sex;
    @Autowired
    private Dao dao;
    public Service02(){
        System.out.println("Service02的构造方法执行了");
    }

    public void aa(){
        System.out.println("调用了dao中的方法");
        dao.aa();
        System.out.println("service中的aa方法执行了");
    }

}

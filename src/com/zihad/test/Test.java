/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zihad.test;

import com.zihad.service.Empservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author IceCReam
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/zihad/test/spring-aop.xml");
        Empservice service=context.getBean("empservice",Empservice.class);
//        System.out.println(service.getManager().getName());
//        System.out.println(service.getAccountant().getName());
        
        service.getManager().setName("Setting new Manager");
        
        
    }
}

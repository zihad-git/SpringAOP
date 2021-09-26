/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zihad.aspect;

import com.zihad.model.Manager;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 *
 * @author IceCReam
 */

@Aspect
@Component
public class Empaspect {
    @Before("allManager()")
    public void beforeAspect(JoinPoint joinPoint){
        System.out.println("Aspect run  "+joinPoint.getTarget());
        Manager manager=(Manager)joinPoint.getTarget();
    }
    
    
//     @Before("allgatters() && allManager()")
//    public void secondAspect(){
//        System.out.println("Second Advice run");
//    }
    
    @After("args(name)")
    public void  stringargsmethod(String name){
        System.out.println("Method run with String");
    }
    
    @Pointcut("execution( * get*(..))")
    public void allgatters(){
        
    }
    
    @Pointcut("within(com.zihad.model.Manager)")
    public void allManager(){
        
    }
    
    @Around("allgatters()")
    public void aroundadvice(ProceedingJoinPoint joinpoint){
        try {
            System.out.println("Before advice");
            joinpoint.proceed();
            System.out.println("After running");
        } catch (Throwable ex) {
            Logger.getLogger(Empaspect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

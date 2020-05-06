package hellowithspringusingxml;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author DELL
 */
public class HelloWorld {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext=new AnnotationConfigApplicationContext();
        configApplicationContext.register(HelloConfigurationFile.class);
        configApplicationContext.refresh();
        MsgRender msgRender=configApplicationContext.getBean(MsgRender.class);
        msgRender.render();
        
    }
    
}

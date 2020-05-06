package hellowithspringusingxml;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author DELL
 */
public class HelloWorld {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        MsgRender myBean= (MsgRender) context.getBean("render");
        myBean.render();
       /* hellowithspringusingxml.MessageSupportFactory messageSupportFactory=hellowithspringusingxml.MessageSupportFactory.getInstance();
        hellowithspringusingxml.MsgRender render=messageSupportFactory.getMsgRender();
        hellowithspringusingxml.MsgProvider provider=messageSupportFactory.getMsgProvider();
        render.setMsgProvider(provider);
        render.render();
*/
        
    }
    
}

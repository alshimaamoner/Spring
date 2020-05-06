package hellowithspringusingxml;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class MessageSupportFactory {
    private static MessageSupportFactory instance=null;
    private Properties props=null;
    private MsgRender render=null;
    private MsgProvider provider=null;
    private MessageSupportFactory(){
        props=new Properties();
        try {
            props.load(MessageSupportFactory.class.getResourceAsStream("/msf.properties"));
            String renderClass=props.getProperty("render.class");
            String providerClass=props.getProperty("provider.class");
            render=(MsgRender) Class.forName(renderClass).newInstance();
            provider=(MsgProvider) Class.forName(providerClass).newInstance();

        } catch (IOException ex) {
            Logger.getLogger(MessageSupportFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MessageSupportFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(MessageSupportFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MessageSupportFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
     static{
            instance=new MessageSupportFactory();
        }
     public static MessageSupportFactory getInstance(){
         return instance;
     }
     public MsgRender getMsgRender(){
         return render;
         
     }
      public MsgProvider getMsgProvider(){
         return provider;
         
     }
    
}

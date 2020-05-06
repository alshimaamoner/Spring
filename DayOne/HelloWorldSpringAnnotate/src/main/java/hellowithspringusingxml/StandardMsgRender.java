package hellowithspringusingxml;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author DELL
 */
public class StandardMsgRender implements MsgRender{
    @Autowired
    private MsgProvider provider;


    public void setMsgProvider(MsgProvider provider) {
        this.provider=provider;
    }


    public void render() {
        System.out.println(provider.getMsg());
    }

}

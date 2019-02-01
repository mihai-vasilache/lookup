/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.util.Map;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.config.BeanDefinition;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class Delegate {
    private Map state;

    public Delegate(Map state) {
        this.state = state;
    }

    public Map getState() {
        return state;
    }
    
    
    
}

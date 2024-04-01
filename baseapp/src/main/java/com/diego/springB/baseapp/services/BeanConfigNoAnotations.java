package com.diego.springB.baseapp.services;

import org.springframework.stereotype.Component;


public class BeanConfigNoAnotations implements PersonasService{

    public BeanConfigNoAnotations(){
        System.out.println("contructo from: " + getClass().getName());
    }
    @Override
    public String getcompany() {
        return "this is a Bean congif in Config document. Is not using @ anotations";
    }
}

package com.diego.springB.baseapp.services;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy // only initialized if it is injected // can be globalized in .properties doc
public class Maestros implements PersonasService{

    public Maestros(){
        System.out.println("Constructor in:" + getClass().getName());
    }
    @Override
    public String getcompany() {
        return "Google";
    }
}

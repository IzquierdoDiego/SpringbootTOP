package com.diego.springB.baseapp.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Matematico implements QualifierService {

    public Matematico(){
        System.out.println("Constructor in: " + getClass().getName());
    }
    @Override
    public String profesion() {
        return "matematico";
    }

    @Override
    public String getGrado() {
        return null;
    }

    @Override
    public String setGrado(String titulo) {
        return null;
    }
}

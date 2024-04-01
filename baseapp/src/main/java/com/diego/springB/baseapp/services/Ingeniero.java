package com.diego.springB.baseapp.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) // by default same instance for all injections // same instance for diferent controllers
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // new object for each injection // diferent instance for diferent controllers
public class Ingeniero implements QualifierService{

    String grado = "grado alto";
    public Ingeniero(){
        System.out.println("Constructor in:" + getClass().getName());
    }

    @Override
    public String profesion() {
        return "ingeniero";
    }

    @Override
    public String getGrado() {
        return grado;
    }

    @Override
    public String setGrado(String titulo) {
        grado = titulo;
        return titulo;
    }

}

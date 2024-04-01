package com.diego.springB.baseapp.rest;

import com.diego.springB.baseapp.services.PersonasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/field")
public class FieldInjectionController {

    @Autowired // no recommended. more difficult to test
    private @Qualifier("customBeanId") PersonasService miPersona;

    public FieldInjectionController(){
        System.out.println("Constructor in:" + getClass().getName());
    }

    @GetMapping("/")
    public String init(){
        return "init page by field "  + miPersona.getcompany() ;
    }




}

package com.diego.springB.baseapp.rest;

import com.diego.springB.baseapp.services.Maestros;
import com.diego.springB.baseapp.services.PersonasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/setter")
public class SetterInjectionController {

    private PersonasService miPersona;

    public SetterInjectionController(){
        System.out.println("Constructor in:" + getClass().getName());
    }

    //Las dependencias se pueden establecer en cualquier momento después de que se haya creado la instancia de la clase.
    /*
    Este enfoque permite la flexibilidad de cambiar las dependencias en tiempo de ejecución.
    Es útil cuando una clase tiene dependencias opcionales o que pueden cambiar durante el ciclo de vida del objeto.
    */
    @Autowired // constructor injection is recommended by Spring.io
    public void setMiPersona(@Qualifier("maestros") PersonasService personasService){
        miPersona = personasService;
    }

    @GetMapping("/")
    public String init(){
        return "init page by setter"  + miPersona.getcompany() ;
    }




}

package com.diego.springB.baseapp.rest;

import com.diego.springB.baseapp.services.LifeCicleService;
import com.diego.springB.baseapp.services.Maestros;
import com.diego.springB.baseapp.services.PersonasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/init")
public class InitController {


    // ############# Spring injection types
    // Constructor inyection
    // Setter injection


    // privates fields to call the
    private PersonasService miPersona;

    private LifeCicleService lifeCicleService;

    @Value("${app,properties.name}")
    String name;

    //the next Autowired is optional if we only have one constructor
     /*
      Es útil cuando una clase requiere todas sus dependencias para funcionar correctamente desde el principio.
      Este enfoque es preferido cuando las dependencias son obligatorias y la clase no puede funcionar sin ellas.
    */
    @Autowired // constructor injection is recommended by Spring.io
    public InitController(@Qualifier("customBeanId") PersonasService personasService, LifeCicleService lifeCicleService){
        System.out.println("Constructor in:" + getClass().getName());
        miPersona =  personasService;
        this.lifeCicleService = lifeCicleService;
    }


    @GetMapping("/")
    public String init(){
        System.out.println(lifeCicleService.testPostContructorDestroy());
        return "init page by " + name + " " + miPersona.getcompany() ;
    }

    @GetMapping("/restc")
    public String sayhell(){
        return "hello";
    }


}

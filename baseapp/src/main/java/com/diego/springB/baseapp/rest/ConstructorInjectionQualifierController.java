package com.diego.springB.baseapp.rest;

import com.diego.springB.baseapp.services.PersonasService;
import com.diego.springB.baseapp.services.QualifierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/quali")
public class ConstructorInjectionQualifierController {


    // ############# Spring injection types
    // Constructor inyection
    // Setter injection


    // privates fields to call the
    private QualifierService qualifierService;

    @Value("${app,properties.name}")
    String name;

    //the next Autowired is optional if we only have one constructor
     /*
      Es útil cuando una clase requiere todas sus dependencias para funcionar correctamente desde el principio.
      Este enfoque es preferido cuando las dependencias son obligatorias y la clase no puede funcionar sin ellas.
    */
    @Autowired // constructor injection is recommended by Spring.io
    public ConstructorInjectionQualifierController(@Qualifier("ingeniero") QualifierService qualifierService){
        System.out.println("Constructor in:" + getClass().getName());
        this.qualifierService =  qualifierService;
    }

    @GetMapping("/")
    public String init(){
        System.out.println("Constructor in:" + getClass().getName());

        System.out.println(qualifierService.getGrado());
        return "init page by " + name + " " + qualifierService.profesion() ;
    }

    @GetMapping("/restc")
    public String sayhell(){
        return "hello";
    }


}

package com.diego.springB.baseapp.rest;

import com.diego.springB.baseapp.services.PersonasService;
import com.diego.springB.baseapp.services.QualifierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/primar")
public class PrimaryController {

    private QualifierService qualifierService;
    private QualifierService qualifierService2;
    @Autowired
    public PrimaryController(QualifierService qualifierService, QualifierService qualifierService2){
        System.out.println("Constructor in:" + getClass().getName());
        this.qualifierService = qualifierService;
        this.qualifierService2 = qualifierService2;
    }


    @GetMapping("/")
    public String init(){
        return "init page by field "  + qualifierService.profesion() ;
    }

    @GetMapping("/scope")
    public String scope(){
        System.out.println(qualifierService.hashCode());
        System.out.println(qualifierService2.hashCode());


        System.out.println(qualifierService.getGrado());
        qualifierService.setGrado("grado muyu alto");
        System.out.println(qualifierService.getGrado());


        return "validae if both instances ares the same " + qualifierService.profesion() + " "  + (qualifierService == qualifierService2) ;
    }




}

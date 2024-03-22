package com.diego.constructorinjection2.rest;

import com.diego.constructorinjection2.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define un campo prvado para la dependencia
    private Coach myCoach;

    // deifne un constructor para la inyaccion de dependencia
    @Autowired
    public DemoController(Coach coach){
        this.myCoach = coach;
    }

    
    @GetMapping("/daylyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}

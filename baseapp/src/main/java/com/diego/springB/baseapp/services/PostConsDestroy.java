package com.diego.springB.baseapp.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PostConsDestroy implements LifeCicleService{

    public PostConsDestroy(){
        System.out.println("Init constructor ");
    }

    @PostConstruct
    public void someNamePostContr(){
        System.out.println("----------------");
        System.out.println("-@PostConstruct-");
        System.out.println("----------------");
    }

    @PreDestroy
    public void someNameDestroy(){
        System.out.println("-------------");
        System.out.println("-@PreDestroy-");
        System.out.println("-------------");
    }

    @Override
    public String testPostContructorDestroy() {
        return "Post constructor and  destroy test";
    }
}

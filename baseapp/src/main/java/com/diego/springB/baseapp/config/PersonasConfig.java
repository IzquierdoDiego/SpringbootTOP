package com.diego.springB.baseapp.config;

import com.diego.springB.baseapp.services.BeanConfigNoAnotations;
import com.diego.springB.baseapp.services.PersonasService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonasConfig {

    //@Bean
    @Bean("customBeanId")
    public PersonasService beanConfigNoAnotations(){ // the id defaults to the method name (for the place where we inject in)
        return new BeanConfigNoAnotations(); // return an BeanConfigNoAnotations instance
    }

}

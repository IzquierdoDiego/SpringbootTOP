package com.diego.constructorinjection2.common;


import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "entrenandoo00o0o0o0";
    }
}

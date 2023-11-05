package com.alexistutorial.mi_app.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${coach.team}")
    private String coachTeam;

    @GetMapping("/")
    public String sayHello(){
        return "Hello World!!!";
    }

    @GetMapping("/workout")
    public String workout(){
        return "Doing workout";
    }

    @GetMapping("/coachData")
    public String coachData(){
        return this.coachName + " is from the " + this.coachTeam + " teams";
    }

}

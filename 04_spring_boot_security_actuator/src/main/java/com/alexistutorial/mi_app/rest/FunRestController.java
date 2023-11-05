package com.alexistutorial.mi_app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello World!!!";
    }

    @GetMapping("/workout")
    public String workout(){
        return "Doing workout";
    }

}
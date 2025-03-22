package com.ecristobale.apifirstdev.controller;


import com.ecristobale.apifirstdev.api.GreetingsApi;
import com.ecristobale.apifirstdev.model.Greetings;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController implements GreetingsApi {

    @Override
    public ResponseEntity<Greetings> getGreetings() {
        String hi = "Hello, world!";
        Greetings greetings = new Greetings();
        greetings.setHi(hi);
        return ResponseEntity.ok(greetings);
    }
}

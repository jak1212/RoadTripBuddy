package com.RoadTripBuddy.Microservice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.ResponseEntity;

@RestController

public class RTBRestControl {
    @PostMapping("take/charge")
    public ResponseEntity<String> postExample(@RequestParam(value = "name") String name){
        String message = name;
        return ResponseEntity.ok(name);
    }

}

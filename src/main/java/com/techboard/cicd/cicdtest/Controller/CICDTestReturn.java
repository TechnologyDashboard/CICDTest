package com.techboard.cicd.cicdtest.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CICDTestReturn {

    @GetMapping(value = "/cicdtest")
    public ResponseEntity sayHello(){
        return ResponseEntity.ok().body("hello from CICD");
    }
}

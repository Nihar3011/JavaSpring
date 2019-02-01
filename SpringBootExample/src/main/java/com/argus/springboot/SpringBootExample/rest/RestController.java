/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argus.springboot.SpringBootExample.rest;

import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author nihar
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {
    
    @GetMapping("/")
    public String starPage(){
        return "Hello   todays time is "+LocalDateTime.now()+" now";
    }
     @GetMapping("/hello")
    public String sayHello(){
        return "Hello   todays time is "+LocalDateTime.now()+" now";
    }
}

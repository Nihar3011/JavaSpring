/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rest.files;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author nihar
 */
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/test")
public class RestController {
    
        @GetMapping("/hello")
        public String sayHello(){
            return "Hello";
        }
}

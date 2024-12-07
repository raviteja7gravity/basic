package com.practice.basic.controllers;

import com.practice.basic.dto.userDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class testController {
    @GetMapping("/ok")
    public String testConnection(){
        System.out.println("Got the request");
        return "Server is running";
    }
    @GetMapping("/send")
    public String sendString ( @RequestParam String id, String name) {

        System.out.println("id is"+ id + "name"+name);
        return "got the ID "+id + " name "+name;
    }
    @PostMapping("/fulldetails")
    public  String fulluserdetails(@RequestBody userDetails newuser){

        return newuser.toString();
    }

}

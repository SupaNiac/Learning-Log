package com.test.first_spring_app.service;

import com.test.first_spring_app.controller.HelloWorldController;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

        public String helloWorld(String name){
            return "to perdido!" + name;
        }
}

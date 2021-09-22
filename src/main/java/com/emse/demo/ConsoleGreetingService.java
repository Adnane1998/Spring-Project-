package com.emse.demo;

import org.springframework.stereotype.Service;

@Service
public class ConsoleGreetingService implements GreetingService{

    @Override
    public void greet(String name) {
        System.out.println(name);
    }
}

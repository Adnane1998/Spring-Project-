package com.emse.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DummyUserService {
    @Autowired
    public GreetingService greetingService;

    public void greetAll() {
        List<String> list = new ArrayList<String>();
        //Adding elements in the List
        list.add("Hello, Elodie!");
        list.add("Hello, Charles!");
        for (int i = 0; i < 2; i++) {
            greetingService.greet(list.get(i));

        }
    }
}
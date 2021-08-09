package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class NameListController {
    @GetMapping("/nameList")
    public ArrayList<String> fun(){
        ArrayList<String> ar=new ArrayList<>();
        ar.add("Amit");
        ar.add("Ajay");
        ar.add("Akash");
        return ar;
    }

}

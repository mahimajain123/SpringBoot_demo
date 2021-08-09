package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class NameDetailsController {
    @GetMapping("/nameDetails")
    public List<NameDetails> fun(){
        return Arrays.asList(
          new NameDetails("Amit",1,"Mathura"),
          new NameDetails("Ajay",2,"Delhi"),
          new NameDetails("Akash",3,"Indore")
        );
    }
    @GetMapping("/Detail")
    public List<NameDetails> fun2(){
        return Arrays.asList(
          new NameDetails("Ravi Dahiya",2,"Wrestling"),
                new NameDetails("Neeraj Chopra",1,"Javelin Throw"),
                new NameDetails("PV Sindhu",3,"Badminton"),
                new NameDetails("Mirabai Chanu",2,"Weight Lifting")

                );
    }


}

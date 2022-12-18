package com.varun;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/")
    public GreetResponse Greet(){
        GreetResponse greetResponse = new GreetResponse("hello",
                List.of("java", "python", "c"),
                new Person("varun"));
        return greetResponse;
    }

    record Person(String name){}
    record GreetResponse(String poda,
                         List<String> favLang,
                         Person person){}
}

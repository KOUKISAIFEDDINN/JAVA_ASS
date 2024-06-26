package com.saif.human;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/")
    public String greeting(@RequestParam(name = "name", defaultValue = "human") String name,
                           @RequestParam(name = "last_name", required = false) String lastName,
                           @RequestParam(name = "times", defaultValue = "1") int times) {

        StringBuilder greeting = new StringBuilder();
        for (int i = 0; i < times; i++) {
            greeting.append("Hello ").append(name);

            if (lastName != null) {
                greeting.append(" ").append(lastName);
            }

            greeting.append("\n");
        }

        return greeting.toString();
    }
}
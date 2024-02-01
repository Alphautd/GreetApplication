package com.revature.myApplication.Controlller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/greet")
    public String greet(@RequestParam(name = "name", defaultValue = "Bazeer") String name) {
        return "Hello, " + name + "!";
    }
}
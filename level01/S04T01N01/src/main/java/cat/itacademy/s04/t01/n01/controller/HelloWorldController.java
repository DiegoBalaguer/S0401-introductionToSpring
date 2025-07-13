package cat.itacademy.s04.t01.n01.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/App")
public class HelloWorldController {

    @GetMapping("/HelloWorld01")
    public String greet(@RequestParam(value = "name", defaultValue = "UNKNOWN") String name) {
        return "Hello " + name + ". You are running a Maven project";
    }

    @GetMapping(value = {"/HelloWorld02", "HelloWorld02/{name}"})
    public String greet2(@PathVariable(required = false) String name) {
        return "Hello " + ((name != null) ? name : "UNKNOW") + ". You are running a Maven project";
    }
}
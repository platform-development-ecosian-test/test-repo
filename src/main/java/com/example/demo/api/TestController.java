package com.example.demo.api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    static Test t = new Test();
    static class Test { }

    @GetMapping("/")
    public String test() {
        return t.toString();
    }

    @GetMapping("/test")
    public String test2() { return "test"; }
}

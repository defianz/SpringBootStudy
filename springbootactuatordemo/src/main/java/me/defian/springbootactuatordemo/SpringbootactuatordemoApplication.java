package me.defian.springbootactuatordemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringbootactuatordemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootactuatordemoApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

}

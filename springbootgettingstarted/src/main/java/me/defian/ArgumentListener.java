package me.defian;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class ArgumentListener {

    public ArgumentListener(ApplicationArguments applicationArguments) {
        System.out.println(applicationArguments.containsOption("foo"));
        System.out.println(applicationArguments.containsOption("bar"));
    }
}

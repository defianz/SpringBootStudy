package me.defian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ArgumentListener implements ApplicationRunner {

    @Value("${hyungchul.name}")
    private String name;

    @Autowired
    Environment environment;

    public ArgumentListener(ApplicationArguments applicationArguments) {
        System.out.println(applicationArguments.containsOption("foo"));
        System.out.println(applicationArguments.containsOption("bar"));
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("name = " + name);
        System.out.println("environment.getProperty(\"hyungchul.name\") = " + environment.getProperty("hyungchul.name"));
        System.out.println(environment.getProperty("hyungchul.fullname"));
    }
}

package me.hyungchul.spinrgapplicationcontext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppR_NS implements ApplicationRunner {

    @Autowired
    hckService hckService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        String message = hckService.createEvent("KHC");
    }
}

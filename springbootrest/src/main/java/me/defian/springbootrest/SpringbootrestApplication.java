package me.defian.springbootrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.reactive.function.client.WebClientCustomizer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootrestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootrestApplication.class, args);
    }


    @Bean
    public WebClientCustomizer webClientCustomizer(){
        return webClientBuilder -> webClientBuilder.baseUrl("http://localhost:8080");
    }
}

package me.defian.springbootmongo;

import me.defian.springbootmongo.account.Account;
import me.defian.springbootmongo.account.AccountRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class SpringbootmongoApplication {


    @Autowired
    MongoTemplate mongoTemplate;

    @Autowired
    AccountRespository accountRespository;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmongoApplication.class, args);
    }


    @Bean
    public ApplicationRunner applicationRunner(){
        return args -> {
            Account account = new Account();
//            account.setEmail("defian@gmail.com");
//            account.setUsername("defian");
//            mongoTemplate.insert(account);



            account.setUsername("defian2");
            account.setEmail("defian2@gmail.com");
            accountRespository.insert(account);

            System.out.println("Finished");
        };
    }
}

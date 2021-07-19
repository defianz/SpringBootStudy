package me.defian.springbootredis;

import me.defian.springbootredis.account.Account;
import me.defian.springbootredis.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class RedisRunner implements ApplicationRunner {

    @Autowired
    StringRedisTemplate redisTemplate;

    @Autowired
    AccountRepository accountRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        ValueOperations<String, String> values = redisTemplate.opsForValue();
        values.set("defian","hyungchul");
        values.set("springboot","2.0");
        values.set("hello","world");

        Account account = new Account();
        account.setEmail("defian@gmail.com");
        account.setUsername("defian");

        accountRepository.save(account);

        Optional<Account> byId = accountRepository.findById(account.getId());
        System.out.println("byId.get().getUsername() = " + byId.get().getUsername());
        System.out.println("byId.get().getEmail() = " + byId.get().getEmail());
    }
}

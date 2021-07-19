package me.defian.springbootmongo.account;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataMongoTest
public class AccountRespositoryTest {

    @Autowired
    AccountRespository accountRespository;

    @Test
    public void findByEmail(){
        Account account = new Account();
        account.setUsername("kim");
        account.setEmail("111@asdasd");

        accountRespository.save(account);

        Optional<Account> byId =   accountRespository.findById(account.getId());
        assertThat(byId).isNotEmpty();

        Optional<Account> byEmail =   accountRespository.findByEmail(account.getEmail());
        assertThat(byEmail).isNotEmpty();
        assertThat(byEmail.get().getUsername()).isEqualTo("kim");
    }
}
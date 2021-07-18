package me.defian.springbootjpa.account;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest  // 슬라이싱 테스트
//@SpringBootTest
public class AccountRepositoryTest {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    AccountRepository accountRepository;

    @Test
    public void di(){
        try{
            DatabaseMetaData metadata = dataSource.getConnection().getMetaData();
            System.out.println("metadata.getURL() = " + metadata.getURL());
            System.out.println("metadata.getUserName() = " + metadata.getUserName());
            System.out.println("metadata.getDriverName() = " + metadata.getDriverName());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        Account account = new Account();
        account.setUsername("defian");
        account.setPassword("pass");
        Account newAccount = accountRepository.save(account);

        assertThat(newAccount).isNotNull();
        Account existingAccount = accountRepository.findByUsername(newAccount.getUsername());
        assertThat(existingAccount).isNotNull();

        Account nonExistingAccount = accountRepository.findByUsername("asdfkajslfdkajsdl");
        assertThat(nonExistingAccount).isNull();

    }

}
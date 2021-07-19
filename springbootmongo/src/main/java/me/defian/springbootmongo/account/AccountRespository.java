package me.defian.springbootmongo.account;

import org.springframework.data.mongodb.repository.MongoRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface AccountRespository extends MongoRepository<Account,String> {
    Optional<Account> findByEmail(String email);
}

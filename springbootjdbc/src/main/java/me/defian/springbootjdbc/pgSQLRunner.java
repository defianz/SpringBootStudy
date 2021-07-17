package me.defian.springbootjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;

@Component
//public class MySQLRunner implements ApplicationRunner {
public class pgSQLRunner implements ApplicationRunner {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        try(Connection connection = dataSource.getConnection();) {

//            connection.setAutoCommit(false);
            System.out.println("connection.getMetaData().getURL() = " + connection.getMetaData().getURL());
            System.out.println("connection.getMetaData().getUserName() = " + connection.getMetaData().getUserName());


            Statement statement = connection.createStatement();
            String sql = "CREATE TABLE account(ID INTEGER NOT NULL, name VARCHAR(255), PRIMARY KEY (id))";
            statement.executeUpdate(sql);
//            connection.setAutoCommit(true);

            // 에러 상황 롤백

//            connection.close();
        }
        jdbcTemplate.execute("INSERT INTO account VALUES (1,'defian')");

    }
}

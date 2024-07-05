package com.usopp.ediary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;

@Component
public class TestRunner implements ApplicationRunner {
    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Connection conn = dataSource.getConnection();
        jdbcTemplate.execute("INSERT INTO member(user_id, user_pw) VALUES('oh', '1234')");
    }
 }

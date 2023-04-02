package com.spring_boot.spring_boot_demo.Configure.Application.Properties;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

@Component
public class Ques2_ApplicationProp implements  CommandLineRunner
{
    @Value("${spring.datasource.url}")
    private String dbUrl;

    @Value("${spring.datasource.username}")
    private String dbUsename;
    @Value("${spring.datasource.password}")
    private String dbPassword;

    public Ques2_ApplicationProp()
    {

    }

    public String getDbUrl() {
        return dbUrl;
    }

    public String getDbUsename() {
        return dbUsename;
    }

    public String getDbPassword() {
        return dbPassword;
    }



    public Ques2_ApplicationProp(String dbUrl, String dbUsename, String dbPassword) {
        this.dbUrl = dbUrl;
        this.dbUsename = dbUsename;
        this.dbPassword = dbPassword;
    }



    @Override
    public void run(String... args) throws Exception {
        System.out.println("Database URL:"+dbUrl);
        System.out.println("Database Username:"+dbUsename);
        System.out.println("Database Password:"+dbPassword);


    }



}

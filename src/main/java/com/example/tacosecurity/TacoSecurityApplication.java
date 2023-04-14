package com.example.tacosecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import static java.lang.System.out;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class TacoSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(TacoSecurityApplication.class, args);
        out.println(String.format("Runing on http://localhost:9000/"));
    }
}

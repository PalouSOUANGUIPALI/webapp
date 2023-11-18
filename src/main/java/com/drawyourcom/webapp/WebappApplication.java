package com.drawyourcom.webapp;

import com.drawyourcom.webapp.configuration.api_url_properties.ApiUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebappApplication implements CommandLineRunner {
    @Autowired
    ApiUrl apiUrl;

    public static void main(String[] args) {
        SpringApplication.run(WebappApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(apiUrl.getApiUrl());

    }
}

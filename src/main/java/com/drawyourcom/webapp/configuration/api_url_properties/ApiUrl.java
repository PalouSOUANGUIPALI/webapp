package com.drawyourcom.webapp.configuration.api_url_properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "com.drawyourcom.webapp")
public class ApiUrl {
    private String apiUrl;
}

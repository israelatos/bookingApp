package com.booking.springboot.bookingApp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import lombok.Data;


//currency-service.url=
//currency-service.username=
//currency-service.key=
@ConfigurationProperties(prefix = "currency-service")
@Component
public @Data class CurrencyServiceConfiguration {

    private String url;
    private String username;
    private String key;

}



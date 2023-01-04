package com.mezameidia.pengembalianservice;

import java.text.SimpleDateFormat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PengembalianServiceApplication1 {

	public static void main(String[] args) {
		SpringApplication.run(PengembalianServiceApplication1.class, args);
	}

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    
    @Bean
    public SimpleDateFormat simpleDateFormat() {
        return new SimpleDateFormat("yyy-MM-dd");
    }

}

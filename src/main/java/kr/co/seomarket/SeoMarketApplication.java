package kr.co.seomarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SeoMarketApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeoMarketApplication.class, args);
    }

}

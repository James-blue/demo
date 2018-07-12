package com.example.demo.config;

import com.example.demo.bo.CompanyBO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = "classpath:spring.xml")
public class MainConfig {

    @Bean
    public CompanyBO companyBO() {
        CompanyBO bo = new CompanyBO();
        bo.setCompanyName("zhaopin");
        bo.setCompanyId(12001997L);
        bo.setOfficeAddress("首开广场5F");
        return bo;
    }

}

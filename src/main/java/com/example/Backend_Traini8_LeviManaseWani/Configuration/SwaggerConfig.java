package com.example.Backend_Traini8_LeviManaseWani.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;

public class SwaggerConfig {
    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI().info(new Info()
                .title("Wealth Management System API")
                .version("1.0")
                .description("API documentation for Wealth Management System"));
    }
}

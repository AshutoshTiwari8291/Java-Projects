package com.microservices.inventory_service.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class openAPIConfig {
    @Bean
    public OpenAPI inventoryServiceAPI() {
        return new OpenAPI()
                .info(new Info().title("Inventory service API")
                        .description("This is REST API for inventory")
                        .version("v0.0.1")
                        .license(new License().name("Apache 2.0"))
                )
                .externalDocs(
                        new ExternalDocumentation().description("You can refer to inventory service Wiki Documentatation")
                                .url("https://ashutosh-dummy-url.com/docs")
                );
    }
}

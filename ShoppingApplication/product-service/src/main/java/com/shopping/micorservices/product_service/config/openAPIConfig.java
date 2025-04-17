package com.shopping.micorservices.product_service.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class openAPIConfig {
    @Bean
    public OpenAPI productServiceAPI() {
        return new OpenAPI()
                .info(new Info().title("Product service API")
                        .description("This is REST API for product")
                        .version("v0.0.1")
                        .license(new License().name("Apache 2.0"))
                )
                .externalDocs(
                        new ExternalDocumentation().description("You can refer to product service Wiki Documentatation")
                                .url("https://ashutosh-dummy-url.com/docs")
                );
    }
}

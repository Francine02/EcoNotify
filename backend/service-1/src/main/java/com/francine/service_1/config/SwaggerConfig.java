package com.francine.service_1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customAPI() {
        return new OpenAPI()
                .addServersItem(new Server().url("http://localhost:8080").description("Servidor de Desenvolvimento"))
                .info(new Info()
                        .title("EcoNotify - service1")
                        .version("1.0.0")
                        .description(
                                "O service1 é responsável por coletar e processar os dados meteorológicos.")
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://github.com/Francine02/EcoNotify/blob/main/LICENSE")));
    }
}
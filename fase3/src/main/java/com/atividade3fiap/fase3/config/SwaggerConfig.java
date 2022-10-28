package com.atividade3fiap.fase3.config;


import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import org.springframework.web.reactive.config.ResourceHandlerRegistry;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


//@EnableWebMvc
@Configuration
@EnableSwagger2
//@Component
public class SwaggerConfig {
   private static final String PACOTE_BASE = "com.atividade3fiap.fase3.api";

    @Bean
    public Docket api() {
        return (new Docket(DocumentationType.SWAGGER_2))
                .useDefaultResponseMessages(false)
                .select()
                .apis(RequestHandlerSelectors.basePackage(PACOTE_BASE))
                .paths(PathSelectors.any())
                .build().apiInfo(apiInfo());

    }

    private ApiInfo apiInfo() {
        return (new ApiInfoBuilder())
                .title("Fase3Aplication")
                .version("1.0").description("Tutorial Item")
                .build();
    }


}
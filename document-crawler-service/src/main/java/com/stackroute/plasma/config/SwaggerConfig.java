//package com.stackroute.plasma.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import static springfox.documentation.builders.PathSelectors.regex;
//
//
//@EnableSwagger2
//@Configuration
//public class SwaggerConfig {
//
//
//    @Bean
//    public Docket productApi() {
//        return (Docket) new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.stackroute.plasma.controller"))
//                .paths(regex("/api/v1.*")).build();
//    }
//
//
//
//}
//

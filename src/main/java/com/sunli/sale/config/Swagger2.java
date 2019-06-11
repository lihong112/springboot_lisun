package com.sunli.sale.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration //该文件为java配置文件
@EnableSwagger2//开启swagger
public class Swagger2 {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //需要扫描生成swagger文档接口的包路径，注意别写错了，错了swagger页面打开就不会有接口再上面
                .apis(RequestHandlerSelectors.basePackage("com.sunli.sale.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    //api文档的一些页面基本信息
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("Spring Boot 集成Swagger2")
                //作者的相关信息
                .contact(new Contact("Vector丶", "https://blog.csdn.net/qq_34727675", ""))
                //版本号
                .version("1.0")
                //详细描述
                .description("******接口文档")
                .build();
    }


}

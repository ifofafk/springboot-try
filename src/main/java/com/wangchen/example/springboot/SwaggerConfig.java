package com.wangchen.example.springboot;

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

@Configuration
@EnableSwagger2
public class SwaggerConfig {

        @Bean
        public Docket createRestApi() {
            return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
//                    .groupName("test for swagger-springboot-ui")
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("com.wangchen.example.springboot"))
                    .paths(PathSelectors.any()).build();
        }


        private ApiInfo apiInfo() {
            return new ApiInfoBuilder()
                    .version("0.0.1")
                    .title("Spring Boot中使用Swagger2构建RESTful APIs")
                    .description("case of springboot+swagger")
                    .termsOfServiceUrl("http://localhost:8080/doc")
                    .contact(new Contact("王 晨","","wangchen1@feiniu.com")).build();
        }

}

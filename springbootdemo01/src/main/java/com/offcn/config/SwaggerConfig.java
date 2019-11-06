package com.offcn.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration//表示该类为一个配置类，相当于spring中的xml配置文件
@EnableSwagger2 //开启在线文档
public class SwaggerConfig {

    //1.声明 api 文档的属性
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTful APIs")
                .description("优就业")
                .termsOfServiceUrl("http://www.ujiuye.com/")
                .contact("小刘同学")
                .version("1.0")
                .build();
    }

    //配置核心配置信息
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.offcn.controller"))
                .paths(PathSelectors.any())
                .build();
    }


}

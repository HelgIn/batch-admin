package com.javainuse;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.hateoas.HypermediaAutoConfiguration;
import org.springframework.boot.autoconfigure.web.MultipartAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@EnableBatchProcessing
@ImportResource({"classpath*:/META-INF/spring/batch/bootstrap/**/*.xml",
        "classpath*:/META-INF/spring/batch/override/**/*.xml"})
public class SpringBatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBatchApplication.class, args);
    }
}
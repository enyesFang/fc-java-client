package org.enyes.sentinel.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "org.enyes.sentinel.client")
@ServletComponentScan(basePackages = "org.enyes.sentinel.client")
@RestController
public class WebApplicationBootstrap extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(WebApplicationBootstrap.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WebApplicationBootstrap.class);
    }

    @RequestMapping(value = "/")
    public String hello() {
        return "Hello World, Run Success";
    }

    @RequestMapping(value = "/hello")
    public String hello2() {
        return "Hello World, Run Success2";
    }
}

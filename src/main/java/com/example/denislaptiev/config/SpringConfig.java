package com.example.denislaptiev.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
class MvsConfig implements WebMvcConfigurer {
    final String TEMPLATE_PREFIX = "WEB-INF/views/" ;
    public void  addVievController(ViewControllerRegistry registry){
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(
                "/image/**",
                "/css/**",
                "/js/**"

        ).addResourceLocations(  ///todo
                TEMPLATE_PREFIX+"images/",
                TEMPLATE_PREFIX+"css/",
                TEMPLATE_PREFIX+"js/"
        );
    }
}

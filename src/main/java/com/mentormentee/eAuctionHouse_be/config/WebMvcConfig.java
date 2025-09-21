package com.mentormentee.eAuctionHouse_be.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        // Ensure Thymeleaf takes precedence over JSP resolver
        // Spring Boot will auto-configure Thymeleaf resolver with highest priority
    }
}

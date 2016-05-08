package com.ecosio.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Spring configuration
 */
@Configuration
@Import(DatabaseConfig.class)
public class ApplicationConfig {




}

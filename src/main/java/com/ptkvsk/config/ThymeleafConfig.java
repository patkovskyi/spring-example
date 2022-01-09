package com.ptkvsk.config;

import org.springframework.context.annotation.Bean;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

public class ThymeleafConfig {

    /**
     * Redundant declaration since 'org.springframework.boot:spring-boot-starter-thymeleaf:2.6.1' in build.gradle
     * already autoconfigures it.
     * @return view resolver bean
     */
    @Bean
    public ThymeleafViewResolver viewResolver() {
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();

        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setPrefix("classpath:/templates");
        templateResolver.setSuffix(".html");
        // some other lines neglected...

        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);
        // some other lines neglected...

        viewResolver.setTemplateEngine(templateEngine);
        return viewResolver;
    }


}

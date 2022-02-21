package com.example.application;

import com.vaadin.flow.component.page.AppShellConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.vaadin.artur.helpers.LaunchUtil;

/**
 * The entry point of the Spring Boot application.
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer implements AppShellConfigurator {
      
      public static void main(String[] args) {
            LaunchUtil.launchBrowserInDevelopmentMode(SpringApplication.run(Application.class, args));
      }
      
}

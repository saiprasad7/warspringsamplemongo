package com.openshift.coursecatalogue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/*import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;*/

@SpringBootApplication
public class CourseCatalogueServerAppApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CourseCatalogueServerAppApplication.class, args);
	}
	/*@Bean
	public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>
	  webServerFactoryCustomizer() {
	    return factory -> factory.setContextPath("/baeldung");
	}*/

}

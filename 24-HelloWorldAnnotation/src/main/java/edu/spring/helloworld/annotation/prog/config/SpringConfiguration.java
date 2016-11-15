package edu.spring.helloworld.annotation.prog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import edu.spring.helloworld.annotation.prog.service.HelloWorldService;
import edu.spring.helloworld.annotation.prog.service.HelloWorldServiceExtended;

@Configuration
@ComponentScan(basePackages = "edu.spring.helloworld.annotation.prog.scan")
public class SpringConfiguration {

    @Bean(name = "helloWorldService")
    public HelloWorldService helloWorldService(){
    	return new HelloWorldService();
    }

    @Bean(name = "helloWorldServiceExtended")
    public HelloWorldServiceExtended helloWorldServiceExtended() {
    	return new HelloWorldServiceExtended();
    }
}

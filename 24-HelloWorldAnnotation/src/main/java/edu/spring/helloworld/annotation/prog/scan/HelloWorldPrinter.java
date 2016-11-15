package edu.spring.helloworld.annotation.prog.scan;




import edu.spring.helloworld.annotation.prog.service.HelloWorldService;
import edu.spring.helloworld.annotation.prog.service.HelloWorldServiceExtended;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;

@Component("helloWorldPrinter")
public class HelloWorldPrinter {

    @Inject
    HelloWorldService helloWorldService;

    @Resource(name = "helloWorldServiceExtended")
    HelloWorldServiceExtended helloWorldServiceExtended;


    public void print() {
        System.out.println(helloWorldService.getMessage());
        System.out.println(helloWorldServiceExtended.getMessage());
    }

    @PostConstruct
    public void onInit() {
        System.out.println("Hello World Printer initialized..");
    }

    @PreDestroy
    public void onDestroy() {
        System.out.println("Shutting down Hello World Printer");
    }

}

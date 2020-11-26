package edu.spring.dreieck.xml.beanspostprocessor;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.BeansException;

/**
 * Every Bean will pass the methods
 */
public class InitDreieckApp implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeforeInitialization : " + beanName);

        return bean;  // you can return any other object as well
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("AfterInitialization : " + beanName + "class name: " + bean.getClass());

        if (bean instanceof Dreieck) {
            Dreieck dreieck = (Dreieck) bean;
            dreieck.getPunkte().add(new Punkt(3, 3));
            System.out.println("AfterInitialization : access bean Dreieck " + dreieck.getPunkte());
        }
        return bean;  // you can return any other object as well
    }

}

package com.enigma;

import com.enigma.kacang.Car;
import com.enigma.kacang.DieselEngine;
import com.enigma.kacang.ElectricalEngine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //app context a/ tmpt hidup para bean
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        String [] beanNames = applicationContext.getBeanDefinitionNames();

        for (String beanName: beanNames
             ) {
            System.out.println(beanName);
        }

        Car mustang = (Car) applicationContext.getBean("terios");
        mustang.run();
    }
}

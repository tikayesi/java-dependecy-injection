package com.enigma;

import com.enigma.kacang.Car;
import com.enigma.kacang.DieselEngine;
import com.enigma.kacang.ElectricalEngine;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //app context a/ tmpt hidup para bean
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("para-beans.xml");
        ElectricalEngine engine = (ElectricalEngine) applicationContext.getBean("electricEngine");

        Car mustang = (Car) applicationContext.getBean("mustang");
        mustang.run();
    }
}

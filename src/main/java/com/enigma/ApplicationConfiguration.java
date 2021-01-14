package com.enigma;

import com.enigma.kacang.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    Engine electricEngine(){
        return new ElectricalEngine();
    }

    @Bean
    Engine dieselEngine(){
        return new DieselEngine();
    }

    @Bean
    Engine gasolineEngine(){
        return new GasolineEngine();
    }

    //constructor injection
    @Bean(name = "terios")
    Car car(){
        return new Car(gasolineEngine());
    }

}

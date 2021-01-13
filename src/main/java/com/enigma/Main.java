package com.enigma;

import com.enigma.di.*;
import org.mockito.Mockito;

public class Main {
    public static void main(String[] args) {
        ElectricalEngine electricalEngine = new ElectricalEngine();
        GasolineEngine gasolineEngine = new GasolineEngine();
        DieselEngine dieselEngine = new DieselEngine();
        //constructor
        Car mobil = new Car(electricalEngine);

        //setter
        Car newMobil = new Car();
        newMobil.setEngine(electricalEngine);

        Engine mockEngine = Mockito.mock(Engine.class);

        Car mockExample = new Car(mockEngine);

        mobil.run();
        newMobil.run();
        mockExample.run();

        Mockito.verify(mockEngine, Mockito.times(1)).startEngine();
    }

}

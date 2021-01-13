package com.enigma.kacang;

public class Car {

    public Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Car() {
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void run(){
        engine.startEngine();
    }
}

package com.glasiem.ex1.factory;

import com.glasiem.ex1.cars.Car;
import com.glasiem.ex1.cars.Toyota;
import com.glasiem.ex1.engines.Engine;
import com.glasiem.ex1.engines.ToyotaEngine;
import com.glasiem.ex1.interfaces.ICarFactory;

public class ToyotaFactory implements ICarFactory {
    @Override
    public Car createCar() {
        return new Toyota();
    }

    @Override
    public Engine createEngine() {
        return new ToyotaEngine();
    }
}

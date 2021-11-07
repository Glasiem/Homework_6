package com.glasiem.ex1.factory;

import com.glasiem.ex1.cars.Car;
import com.glasiem.ex1.cars.Ford;
import com.glasiem.ex1.engines.Engine;
import com.glasiem.ex1.engines.FordEngine;
import com.glasiem.ex1.interfaces.ICarFactory;

public class FordFactory  implements ICarFactory {
    @Override
    public Car createCar() {
        return new Ford();
    }

    @Override
    public Engine createEngine() {
        return new FordEngine();
    }
}
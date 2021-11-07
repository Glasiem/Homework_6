package com.glasiem.ex1.factory;

import com.glasiem.ex1.cars.Car;
import com.glasiem.ex1.cars.Mersedes;
import com.glasiem.ex1.engines.Engine;
import com.glasiem.ex1.engines.MersedesEngine;
import com.glasiem.ex1.interfaces.ICarFactory;

public class MersedesFatory implements ICarFactory {
    @Override
    public Car createCar() {
        return new Mersedes();
    }

    @Override
    public Engine createEngine() {
        return new MersedesEngine();
    }
}

package com.glasiem.ex1.interfaces;

import com.glasiem.ex1.cars.Car;
import com.glasiem.ex1.engines.Engine;

public interface ICarFactory {
    Car createCar();
    Engine createEngine();
}

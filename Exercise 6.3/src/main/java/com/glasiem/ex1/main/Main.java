package com.glasiem.ex1.main;

import com.glasiem.ex1.cars.Car;
import com.glasiem.ex1.engines.Engine;
import com.glasiem.ex1.factory.FordFactory;
import com.glasiem.ex1.factory.MersedesFatory;
import com.glasiem.ex1.factory.ToyotaFactory;
import com.glasiem.ex1.interfaces.ICarFactory;

public class Main {

    public static void main(String[] args) {
        ICarFactory carFactory = new ToyotaFactory();
        Car mycar = carFactory.createCar();
        mycar.getInfo();
        Engine myengine = carFactory.createEngine();
        myengine.getPower();

        ICarFactory carFactory2 = new MersedesFatory();
        Car mycar2 = carFactory2.createCar();
        mycar2.getInfo();
        Engine myengine2 = carFactory2.createEngine();
        myengine2.getPower();

        ICarFactory carFactory3 = new FordFactory();
        Car mycar3 = carFactory3.createCar();
        mycar3.getInfo();
        Engine myengine3 = carFactory3.createEngine();
        myengine3.getPower();
    }
}

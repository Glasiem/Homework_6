package com.glasiem.prototype;

public class Triangle implements IFigure {

    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public IFigure clone() {
        return new Triangle(this.a, this.b, this.c);
    }

    @Override
    public void getInfo() {
        System.out.println("Трикутник зі сторонами: " + this.a + " " + this.b + " " + this.c);
    }
}

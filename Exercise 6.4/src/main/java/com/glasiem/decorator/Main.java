package com.glasiem.decorator;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
    {
        // Create ConcreteComponent and two Decorators
        Toys c = new Toys();
        ChristmasTree d1 = new ChristmasTree();

        // Link decorators
        d1.SetComponent(c);

        d1.Operation();

        d1.Operation();
    }
}}
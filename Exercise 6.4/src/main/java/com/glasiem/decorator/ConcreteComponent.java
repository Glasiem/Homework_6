package com.glasiem.decorator;

import java.awt.*;

public class ConcreteComponent extends Component
{
        @Override
        public void Operation()
        {
                System.out.println("ConcreteComponent.Operation()");
        }
}
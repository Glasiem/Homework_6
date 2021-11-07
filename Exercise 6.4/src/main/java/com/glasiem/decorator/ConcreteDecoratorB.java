package com.glasiem.decorator;

class ConcreteDecoratorB extends Decorator
{
        @Override
        public void Operation()
        {
                super.Operation();
                AddedBehavior();
                System.out.println("ConcreteDecoratorB.Operation()");
        }
        void AddedBehavior() {

        }
}

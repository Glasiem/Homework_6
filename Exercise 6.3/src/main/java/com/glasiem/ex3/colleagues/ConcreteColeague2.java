package com.glasiem.ex3.colleagues;

import com.glasiem.ex3.mediators.Mediator;

public class ConcreteColeague2 extends Colleague{

    public ConcreteColeague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.Send("Hello!", this);
    }

    public void notify(String message) {
        System.out.println("Colleague2 gets message: " + message);
    }

}

package com.glasiem.ex3.colleagues;

import com.glasiem.ex3.mediators.Mediator;

public class ConcreteColeague1 extends Colleague {

    public ConcreteColeague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.Send(message, this);
    }

    public void notify(String message) {
        System.out.println("Colleague1 gets message: " + message);
    }

}

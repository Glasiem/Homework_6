package com.glasiem.ex3.colleagues;

import com.glasiem.ex3.mediators.Mediator;

public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator)
    {
        this.mediator = mediator;
    }

}

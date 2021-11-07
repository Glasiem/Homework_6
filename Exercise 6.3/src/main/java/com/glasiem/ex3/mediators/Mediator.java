package com.glasiem.ex3.mediators;

import com.glasiem.ex3.colleagues.Colleague;

public abstract class Mediator {
    public abstract void Send(String message, Colleague colleague);
}

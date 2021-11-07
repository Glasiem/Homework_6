package com.glasiem.ex3.main;

import com.glasiem.ex3.colleagues.ConcreteColeague1;
import com.glasiem.ex3.colleagues.ConcreteColeague2;
import com.glasiem.ex3.mediators.ConcreteMediator;

public class Main {
    public static void main(String[] args) {
        ConcreteMediator m = new ConcreteMediator();
        ConcreteColeague1 c1 = new ConcreteColeague1(m);
        ConcreteColeague2 c2 = new ConcreteColeague2(m);
        m.setColleague1(c1);
        m.setColleague2(c2);
        m.Send("How are you?", c1);
        m.Send("Fine, thanks", c2);
        c1.send("123");
        c2.send("123");
    }
}

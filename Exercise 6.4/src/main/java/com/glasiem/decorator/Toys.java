package com.glasiem.decorator;

import java.util.ArrayList;

public class Toys extends Component{

    private String toys;

    public Toys() {
        this.toys = "NO";
    }

    @Override
    public void Operation() {
        if (toys.equals("YES"))
            toys = "NO";
        else
            toys = "YES";
        System.out.println("TOYS: " + toys);
    }
}

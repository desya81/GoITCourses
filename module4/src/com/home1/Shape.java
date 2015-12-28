package com.home1;

/**
 * Created by denys on 28.12.15.
 */
public abstract class Shape {

    public double S;

    public double calculateArea(){
        this.doCalculateArea();
        return this.S;
    }

    abstract protected void doCalculateArea();
}

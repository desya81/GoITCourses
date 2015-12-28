package com.home1;

/**
 * Created by denys on 28.12.15.
 */
public class Triangle extends Shape {

    public Triangle(int a, int b, int c){
        this.setA(a);
        this.setB(b);
        this.setB(c);
    }

    public Triangle(int a, int h){
        this.setA(a);
        this.setH(h);
    }

    public Triangle() {

    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    protected int c;
    protected int a;
    protected int b;
    protected int h;

    public void setH(int h) {
        this.h = h;
    }


    @Override
    protected void doCalculateArea() {
        if(this.a > 0 && this.b > 0 && this.c > 0 ){
            this.S = (a + b + c) / 2;
        }else if(this.a > 0 && this.h > 0){
            this.S = (1/2)*(this.a*this.h);
        }
    }
}

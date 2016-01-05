package module4.home1;

/**
 * Created by denys on 28.12.15.
 */
public class Rectangle extends Shape {

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    protected int a;
    protected int b;


    public Rectangle(int a, int b) {
        this.setA(a);
        this.setB(b);
    }


    public Rectangle() {
    }

    @Override
    protected void doCalculateArea() {
        if(this.a > 0 && this.b > 0){
            this.S = this.a*this.b;
        }
    }
}

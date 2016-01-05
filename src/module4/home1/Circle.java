package module4.home1;

/**
 * Created by denys on 28.12.15.
 */
public class Circle extends Shape {

    protected int d;
    protected int r;

    public void setD(int d) {
        this.d = d;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    protected void doCalculateArea() {
        if(this.r > 0){
            this.S = Math.PI * Math.pow(this.r, 2);
        }else if(this.d > 0){
            this.S = (1/4) * Math.PI * Math.pow(this.d, 2);
        }
    }
}

package module6;

/**
 * Created by denys on 28.12.15.
 */
public class Formula {

    protected Point A1;
    protected Point A2;

    public Formula(Point a1, Point a2) {
        this.A1 = a1;
        this.A2 = a2;
    }

    public double calculateDistance(){
        double n1 =  Math.pow((this.A2.getX() - this.A1.getX()), 2);
        double n2 =  Math.pow((this.A2.getY() - this.A1.getY()), 2);
        return Math.sqrt((n1+n2));
    }
}

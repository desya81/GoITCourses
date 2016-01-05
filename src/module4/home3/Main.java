package module4.home3;

/**
 * Created by denys on 28.12.15.
 */
public class Main {

    public static void main(String[] args){
        Formula formula = new Formula(new Point(1, 1), new Point(2, 2));
        double res = formula.calculateDistance();
        System.out.println("Distance is " + res);
    }
}

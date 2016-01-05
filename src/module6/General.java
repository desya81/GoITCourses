package module6;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by denys on 28.12.15.
 */
public class General {

    public static void main(String[] args){

        final Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter value x for Point A");
        final String xAStr = scanner.next();
        System.out.println("Please Enter value y for Point A");
        final String yAStr = scanner.next();
        System.out.println("Please Enter value x for Point B");
        final String xBStr = scanner.next();
        System.out.println("Please Enter value y for Point B");
        final String yBStr = scanner.next();

        try{
            final int x1 = Integer.parseInt(xAStr);
            final int y1 = Integer.parseInt(yAStr);
            final int x2 = Integer.parseInt(xBStr);
            final int y2 = Integer.parseInt(yBStr);

            if(x1 > 100){
                throw new BigNumberFormat(x1);
            }

            if(y1 > 100){
                throw new BigNumberFormat(x1);
            }

            if(x2 > 100){
                throw new BigNumberFormat(x1);
            }

            if(y2 > 100){
                throw new BigNumberFormat(x1);
            }

            Formula formula = new Formula(new Point(x1, y1), new Point(x2, y2));
            double res = formula.calculateDistance();
            System.out.println("Distance is " + res);
        }catch (NumberFormatException ex) {
            System.out.println("[Error]: value should be an integer number " + ex.getMessage());
        }catch (BigNumberFormat exc){
            System.out.println("[Error]: value should be less then 100");
        }catch (Exception e){
            System.out.println("[Error]: some error" + e.getMessage());
        }
    }
}

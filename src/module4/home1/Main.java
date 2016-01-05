package module4.home1;

/**
 * Created by denys on 28.12.15.
 */
public class Main {

    public static void main(String[] args){
        Triangle triangle = new Triangle();
        triangle.setA(10);
        triangle.setB(10);
        triangle.setC(10);
        double S = triangle.calculateArea();
        System.out.println("area of a triangle is " + S);

        Rectangle rectangle = new Rectangle(10, 10);
        S = rectangle.calculateArea();
        System.out.println("area of rectangle is " + S);

        Circle circle = new Circle();
        circle.setR(20);
        S = circle.calculateArea();
        System.out.println("area of circle is " + S);

    }
}

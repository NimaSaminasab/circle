/*Write a Java program to print the area and perimeter of a circle
* */
import java.util.Scanner ;
public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        System.out.println("Radius of the circle ?");
        double radius = in.nextDouble() ;

        System.out.println("The Area of the circle is " + Math.PI*(Math.pow(radius,2)));
        System.out.println("The Perimeter of the circle is " +Math.PI*(radius*2));
    }
}

import java.util.*;

public class AreaOfCircle{
    public static void main(String[] args) {
        System.out.print("Enter the radius of circle: ");

        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();

        sc.close();

        double area = 3.14 * (radius) * (radius);
// Here "double" datatype is used because the are will be in decimal.


        System.out.print("Area is: ");
        System.out.print(area);
    }
}
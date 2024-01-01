import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First number:");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        sc.close();
        int sum = a + b;

        System.out.print("The Sum is: ");
        System.out.print(sum);

    }
}

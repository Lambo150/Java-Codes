import java.util.Scanner;

public class dprecision {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        double a, b, c;

        System.out.println("Enter the first number");
        a=con.nextDouble();

        System.out.println("Enter the second number");
        b=con.nextDouble();

        c=(a+b)/2;
        System.out.println("The average of the two numbers is "+c);
    }
}

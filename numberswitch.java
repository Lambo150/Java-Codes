import java.util.Scanner;

public class numberswitch {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int a, b;

        System.out.println("Enter the first number");
        a = con.nextInt();
        System.out.println("Enter the second number");
        b = con.nextInt();
        System.out.println("Before swapping  a="+a+"and b="+b);
        a= a+b;
        b = a-b;
        a=a-b;
        System.out.println("The new value of a =" + a+"and b="+b);
    }
}

import java.util.Scanner;

public class numchecker {
    public static void main(String[] args) {
        Scanner ne = new Scanner(System.in);
        int a, b = 2;
        System.out.println("Enter the number ");
        a = ne.nextInt();

        if (a % b == 0) {
            System.out.println("The number is even");
        }else {
            System.out.println("The number is odd");
        }
    }
}
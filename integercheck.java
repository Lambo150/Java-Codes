import java.util.Scanner;

public class integercheck {
    public static void main(String[] args) {
        Scanner ne = new Scanner(System.in);
        double a;
        System.out.println("Enter the number");
        a=ne.nextDouble();

        if (a<0){
            System.out.println("The number is negative");
        }else if (a>0){
            System.out.println("The number is positive");
        }
    }
}

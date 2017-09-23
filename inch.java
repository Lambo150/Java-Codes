import java.util.Scanner;

public class inch {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double inch, centimeter;

        System.out.println("Enter the value in inches");
        inch = a.nextDouble();
        centimeter=inch*2.54;
        System.out.println("Your value in centimeters is "+centimeter);
    }
}

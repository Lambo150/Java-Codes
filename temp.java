import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double celsius, faren;

        System.out.println("Enter your temperature in Celsius");
        celsius=a.nextDouble();
        faren=celsius*33.8;
        System.out.println("The temperature in Celsius is"+faren);
    }
}

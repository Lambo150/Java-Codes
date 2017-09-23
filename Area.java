import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double area, r, pi =3.142;
        System.out.println("Enter  the radius of the circle");
        r = a.nextDouble();
        area = pi *(r*r);
        System.out.println("The area of the circle is " + area);
    }
}
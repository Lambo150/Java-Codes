import java.util.Scanner;

public class multiplier {
    public static void main(String[] args) {
        int a, i, re = 0;
        Scanner nww = new Scanner(System.in);
        System.out.println("Enter the number you want to multiply");
        a = nww.nextInt();

        for (i = 1; i < 11; i++) {
            re = a * i;
            System.out.println(a + "X " + i + "=" + re);
        }
    }
}

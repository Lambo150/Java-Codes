import java.util.Scanner;

public class account {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        double accbal, interest, yrbal=1;

        System.out.println("Enter your account balance");
        accbal = con.nextDouble();
        System.out.println("Enter your interest rate in decimals");
        interest = con.nextDouble();
        interest = interest/100;

        int i, a;
        System.out.println("How many years do you want to calculate for");
        a = con.nextInt();

        for (i=0;i<a; i ++) {
            yrbal=accbal + ( accbal * interest);
            accbal=yrbal;
            System.out.println("Your balance after " +i+ " year is " + accbal);
        }
    }
}
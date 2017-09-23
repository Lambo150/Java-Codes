import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args)
    {
        Scanner ana = new Scanner(System.in);
        int n,sum = 0,sentinel = 3,add;
        System.out.println("How many numbers do you want to add");
        n = ana.nextInt();
                int i = 0;
                while (i < n) {
                    System.out.println("Enter number");
                    add = ana.nextInt();
                    if (add == sentinel) {
                        System.out.println("This number is not allowed");
                        sum +=add-sentinel ;
                        i = n;
                    } else {
                        sum += add;
                        i++;
                    }
                }
                System.out.println("The sum of the numbers is " + sum);
        }
    }
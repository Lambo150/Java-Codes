import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner ne = new Scanner(System.in);
        int n1,n2,n3,i,count;

        System.out.println("Enter the first number");
        n1=ne.nextInt();
        System.out.println("Enter the second number");
        n2=ne.nextInt();
        System.out.println("How many numbers do you want");
        count=ne.nextInt();
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}

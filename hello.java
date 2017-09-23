import java.util.Scanner;

public class hello {

    public static void main(String[]args){
        int a,b,c,d,e,f;
       //class to receive input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter the first integer");
        a = keyboard.nextInt();
        System.out.println("enter the second integer");
        b = keyboard.nextInt();
        //add
        c = a+b;
        //subtract
        d = a-b;
        //multiply
        e = a*b;
        //divide
        f = a/b;

        System.out.println("Welcome to Java");
        System.out.println("The sum of the numbers is" + " "+c);
        System.out.println("The difference of the numbers is" + " "+d);
        System.out.println("The product of the numbers is" + " "+e);
        System.out.println("The dividend of the numbers is" + " "+f);
    }
}
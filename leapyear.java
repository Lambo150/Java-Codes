import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        int yr;
        //Has to be divisible by 4and not 100 or just 400
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the year that you want to check");
        yr = n.nextInt();

        if (yr%4==0  && yr%100!=0){
            System.out.println("The year "+""+yr+""+"is a leap year");
        }
        else if (yr%400==0){
            System.out.println("The year "+""+yr+""+"is a leap year");
        }
        else{
            System.out.println("The year "+""+yr+""+"is not a leap year");
        }
    }
}

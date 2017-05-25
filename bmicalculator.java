import java.util.Scanner;

public class bmicalculator {
    public static void main(String[] args) {
        double height,weight,bmi;

        Scanner ne = new Scanner(System.in);
        System.out.println("Enter your height in inches");
        //getting the height
        height=ne.nextDouble();
        height=height*0.3048;
        //getting the weight
        System.out.println("Enter your weight in kilos");
        weight=ne.nextDouble();
        //calculating the BMI
        bmi=weight/height;
        bmi=bmi/height;

        if (bmi<18.5){
            System.out.println("Your BMI is "+" "+bmi+" "+"You are underweight");
        }
        else if (bmi<=24.9 || bmi>= 18.5){
            System.out.println("Your BMI is "+" "+bmi+" "+"You are normal weight");
        }
        else if (bmi<=29.9 || bmi>= 25){
            System.out.println("Your BMI is "+" "+bmi+" "+"You are overweight");
        }
        else if (bmi<=30){
            System.out.println("Your BMI is "+" "+bmi+" "+"You are Obese");
        }
    }
}

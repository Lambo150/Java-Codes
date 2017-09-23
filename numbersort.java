import java.util.Scanner;

public class numbersort {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);


        int[] numarray;
        numarray = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("Enter the" + i + "number");
            numarray[i] = n.nextInt();
        }
        int max = numarray[0];
        int min = numarray[0];

        for (int k = 1; k < 6; k++) {
            if (numarray[1] > max) {
                max = numarray[k];
            }
            if (numarray[k] < min) {
                min = numarray[k];
            }
            System.out.println("The max value is" + max + "The min value is" + min);
        }
    }
}
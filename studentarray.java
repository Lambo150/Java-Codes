import java.util.Scanner;

public class studentarray {
    public static void main(String[] args) {
        Scanner ne = new Scanner(System.in);

        int []stuArray;
        stuArray = new int[10];

        for (int i=1;i<11;i++){
            System.out.println("Enter the"+i+"score");
            stuArray[i]= ne.nextInt();
        }

        for (int e=1;e<11;e++){
            System.out.print( stuArray[e]);

        }
    }
}

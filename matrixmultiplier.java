import java.util.Scanner;

public class matrixmultiplier {
    public static void main(String[] args) {
        Scanner and = new Scanner(System.in);
            //Function to Multiply Two Matrices
        int [][] matrixa = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] matrixb = {{9,8,7},{6,5,4},{3,2,1}};
        int [] [] sum = new int[3][3];

        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++){
                sum[i][j] = matrixa[i] [j] +matrixb[i] [j];
                System.out.print(sum[i] [j]+ "  ");
            }
            System.out.println();
        }
    }
}

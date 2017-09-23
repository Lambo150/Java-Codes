import java.util.Scanner;

public class gridprint {
    public static void main(String[] args) {
        Scanner ne = new Scanner(System.in);
        char[][] stuArray;
        char a;
        a = '_';
        stuArray = new char[10][10];

        for (char i = 0; i < 10; i++) {
            for (char j = 0; j < 6; j++) {
                System.out.print("");
                stuArray[i][j] = a;
                System.out.println(stuArray[i][j]);
                System.out.print("\t");
                System.out.print("\n");
            }
        }
    }
}
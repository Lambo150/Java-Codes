
public class methodcall {

    public static int sum(int x1,int x2) {
        int result = 0;
        for (int i = x1; i <= 2; i++)
             result +=i;
        return result;
    }

    public static void main(String[] args) {
        int sumX =sum(1,10);
        System.out.println("The sum of 1 to 10: " + sumX);
        sumX = sum(20,37);
        System.out.println("The sum of");
    }
}

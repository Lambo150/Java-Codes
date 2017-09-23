
public class multiplearray {
    public static void main(String[] args) {
        int[][] numbers={{1,2,3,4,5},{6,7,8,9,10}};

        for (int i=0; i<2; i++)
        {
            for (int j=0; j<5; j++){
                System.out.println(numbers[i][j]);
                System.out.println("\t");
            }
            System.out.println("The array is"+" "+numbers.length+" "+" columns long");
        }
    }
}

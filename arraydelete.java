import java.util.*;

public class arraydelete {
    public static void main(String[] args) {
        int [] number = {15,17,27,30,17,24,35,50,60,19};

        int removeindex = 2;

        for (int i=0;i<10;i++) {
            System.out.println(number[i + 1]);
        }

        for (int i =removeindex; i<number.length-1;i++){
            number[i] = number[i+1];
        }

        System.out.println("After removing it" + Arrays.toString(number));
    }
}

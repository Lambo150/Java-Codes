
public class nummethod {

    public static int even(){
        int i=0;
        int sum = i+2;
        for (i=0;i<=100;i++){
            sum+=i;

        }
        System.out.println(sum);
        return sum;
    }

    public static int odd(){
        int i=0;
        int sum = i+1;
        for (i=0;i<=100;i++){
            sum+=i;

        }
        System.out.println(sum);
        return sum;
    }

    public static int all(){
        int i=0;
        int sum = i;
        for (i=0;i<=100;i++){
            sum+=i;
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {

        even();
        odd();
        all();

    }
}

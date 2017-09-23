public class comparator {
    public static void main(String[] args) {
        int a = 10, b = 11, c = 6;

         if (!(c <= b) || c < a) {
            System.out.println("c is greatest");
        }
        else if (c < a || a < b) {
            System.out.println("b is greatest");
        }
    }
}
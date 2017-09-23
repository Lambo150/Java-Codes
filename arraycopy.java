
public class arraycopy {
    public static void main(String[] args) {

         char[] copyfrom= {'R','e','s','u','r','r','e','c','t','i','o','n'};
         char[] copyTo= new char[7];
         System.arraycopy(copyfrom,2,copyTo,0,7);
        System.out.println(new String(copyTo));

    }
}

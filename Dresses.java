
public class Dresses {

    Dresses(){ System.out.println("This is the blueprint for dresses");
    }

    public class designer1 extends Dresses {
        designer1() {
            System.out.println("Customized version one");
        }
    }

    public static class designer2 extends Dresses {
        designer2() {
            System.out.println("Customized version two");
        }
    }

    public static void main(String[] args) {
        designer2 st = new designer2();
    }
}

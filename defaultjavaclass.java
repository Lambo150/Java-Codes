
public class defaultjavaclass {

    public static void main(String[] args) {
        Bank objBank = new Bank("Steve" , "sv123113", 1000000);
        objBank.display();
        System.out.println();
        objBank.deposit(250000);
        objBank.withdraw(750000);
        System.out.println();
        objBank.display();
    }
}

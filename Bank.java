public class Bank {
    String depname;
    String accnumber;
    double accbal;

    public Bank(String theName, String accNo, double bal)
    {
            depname = theName;
            accnumber = accNo;
            accbal = bal;
    }

    public void display(){
        System.out.println("Customer's name :" + depname);
        System.out.println("Customer's account number :" + accnumber);
        System.out.println("Customer's account balance :" + accbal);
    }

    public void  deposit(double amount)
    {
        accbal = accbal + amount;//balance +=amount;
    }

    public void  withdraw(double amount)
    {
        accbal = accbal - amount;//balance +=amount;
    }
}

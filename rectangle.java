import javax.swing.*;

public class rect {
    public static void main(String[] args) {
        String FirstNumber = JOptionPane.showInputDialog("Enter the length");
        String SecondNumber = JOptionPane.showInputDialog("Enter the height");

        int num1 = Integer.parseInt(FirstNumber);
        int num2 = Integer.parseInt(SecondNumber);
        int area  = num1*num2;
        JOptionPane.showMessageDialog(null, "The area is "+area,"Area of a rectangle", JOptionPane.INFORMATION_MESSAGE);
    }
}

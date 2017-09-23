package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String FirstNumber = JOptionPane.showInputDialog("Enter first integer");
        String SecondNumber = JOptionPane.showInputDialog("Enter second integer");

        int num1 = Integer.parseInt(FirstNumber);
        int num2 = Integer.parseInt(SecondNumber);
        int sum  = num1+num2;
        JOptionPane.showMessageDialog(null, "The sum is "+sum,"Sum of Two Integers", JOptionPane.INFORMATION_MESSAGE);
    }
}

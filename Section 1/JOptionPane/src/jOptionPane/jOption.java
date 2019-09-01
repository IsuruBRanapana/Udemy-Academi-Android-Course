package jOptionPane;

import javax.swing.*;

public class jOption {
    public static void main(String[] args) {
        String name;
        String surname;
        name= JOptionPane.showInputDialog("Please enter you name: ");
        surname=JOptionPane.showInputDialog("Please enter your surname");
        JOptionPane.showMessageDialog(null,name+" "+surname);

        int firstNumber;
        int secondNumber;
        String input;
        input=JOptionPane.showInputDialog("Please enter first number");
        firstNumber=Integer.parseInt(input);
        input=JOptionPane.showInputDialog("please enter second number");
        secondNumber=Integer.parseInt(input);

        double average;
        average=(firstNumber+secondNumber)/2.0;
        JOptionPane.showMessageDialog(null,"Average" +" = "+average);
        System.out.println(average);
    }
}

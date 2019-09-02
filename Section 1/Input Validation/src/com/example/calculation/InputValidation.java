package com.example.calculation;

import javax.swing.*;

public class InputValidation {
    public static void main(String[] args) {
        String input= JOptionPane.showInputDialog("" +
                "Please enter the number on the range of 1 throgh 100");
        int number=Integer.parseInt(input);
        while (number<1||number>100){
            JOptionPane.showMessageDialog(null,"Thet number is invalid!");
            input=JOptionPane.showInputDialog("Please enter number in the range of 1 through 100");
            number=Integer.parseInt(input);
        }
        JOptionPane.showMessageDialog(null,"correct");
    }
}

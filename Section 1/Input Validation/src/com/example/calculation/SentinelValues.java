package com.example.calculation;

import javax.swing.*;

public class SentinelValues {
    public static void main(String[] args) {
        int value;
        int doubleValue;

        String input= JOptionPane.showInputDialog("Please enter a value to double"+"(0 To Stop)");
        value=Integer.parseInt(input);
        while (value!=0){
            doubleValue=value*2;
            JOptionPane.showMessageDialog(null," "+value+" doubled is"+doubleValue);
            input= JOptionPane.showInputDialog("Please enter a value to double"+"(0 To Stop)");
            value=Integer.parseInt(input);
        }
    }
}

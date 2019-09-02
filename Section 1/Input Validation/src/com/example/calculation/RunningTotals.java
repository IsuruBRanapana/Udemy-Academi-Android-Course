package com.example.calculation;

import javax.swing.*;

public class RunningTotals {
    public static void main(String[] args) {
        int days;
        double sales;
        double totalSales=0.0; //running total

        String input = JOptionPane.showInputDialog("For how many days do you have sales"+"Figures?");
        days=Integer.parseInt(input);
        for (int count=1;count<=days;count++){
            input=JOptionPane.showInputDialog("Enter the sales for day "+count);
            sales=Double.parseDouble(input);
            totalSales += sales;
        }
        JOptionPane.showMessageDialog(null,"The total sales are $"+totalSales);
        System.exit(0);

    }
}

package com.example.calculation;

import javax.swing.*;
import java.text.DecimalFormat;

public class RunningTotals {
    public static void main(String[] args) {
        int days;
        double sales;
        double totalSales=0.0; //running total
        DecimalFormat dollar=new DecimalFormat("#,##0.00");//# are represent non-required once.
        /**
         * # means non-required once. it means there can be value or not.
         * in 0 positions if there are nothing, programme automatically put 0
         * in # positions if there are nothing, programme don't put anything
         */

        String input = JOptionPane.showInputDialog("For how many days do you have sales"+"Figures?");
        days=Integer.parseInt(input);
        for (int count=1;count<=days;count++){
            input=JOptionPane.showInputDialog("Enter the sales for day "+count);
            sales=Double.parseDouble(input);
            totalSales += sales;
        }
        JOptionPane.showMessageDialog(null,"The total sales are $"+dollar.format(totalSales));
        System.exit(0);

    }
}

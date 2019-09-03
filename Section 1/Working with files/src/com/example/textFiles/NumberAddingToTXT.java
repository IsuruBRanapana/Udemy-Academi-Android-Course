package com.example.textFiles;

import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;

public class NumberAddingToTXT {
    public static void main(String[] args) throws IOException {
        int count;
        String input;
        PrintWriter numWriter=new PrintWriter("Calc.txt");
        input= JOptionPane.showInputDialog("Enter How much Numbers That You want to get average");
        count=Integer.parseInt(input);
        for (int i=1;i<=count;i++){
            input=JOptionPane.showInputDialog("Enter the number "+i);
            int num=Integer.parseInt(input);
            numWriter.println("num");
        }
    }
}

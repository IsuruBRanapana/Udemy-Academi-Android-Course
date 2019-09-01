package com.switchStatement;

import javax.swing.*;

public class TheSwitchCase {
    public static void main(String[] args) {
        int x;
        String y;
        y= JOptionPane.showInputDialog("Enter the number ");
        x=Integer.parseInt(y);
        switch (x){
            case 1:
                JOptionPane.showMessageDialog(null,"Number 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Number two");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Number three");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Not ONe , Two or Three");
        }
        System.exit(0);
    }
}

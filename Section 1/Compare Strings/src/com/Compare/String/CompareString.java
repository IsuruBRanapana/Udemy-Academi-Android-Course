package com.Compare.String;

import javax.swing.*;

public class CompareString {
    public static void main(String[] args) {
        String name1;
        String name2;
        name1= JOptionPane.showInputDialog("Enter the name One ");
        name2=JOptionPane.showInputDialog("Enter the second name");
        if (name1.equals(name2)){
            JOptionPane.showMessageDialog(null,"Same Names");
        }else {
            JOptionPane.showMessageDialog(null,"Not same");
        }
        if (name1.compareTo(name2)==0){
            JOptionPane.showMessageDialog(null,"Same Names");
        }else if (name1.compareTo(name2)<0){
            JOptionPane.showMessageDialog(null,"Name one is first and 2 is second");
        }else if (name1.compareTo(name2)>0){
            JOptionPane.showMessageDialog(null,"Name 2 is first and Name 1 is second");
        }
        System.exit(0);
    }
}

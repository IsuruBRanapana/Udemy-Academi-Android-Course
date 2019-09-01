package jOptionPane;

import javax.swing.*;

public class jOption {
    public static void main(String[] args) {
        String name;
        String surname;
        name= JOptionPane.showInputDialog("Please enter you name: ");
        surname=JOptionPane.showInputDialog("Please enter your surname");
        JOptionPane.showMessageDialog(null,name+" "+surname);
    }
}

package decisionStructure;

import javax.swing.*;

public class decisionStructure {
    public static void main(String[] args) {
        int number;
        String input;
        input=JOptionPane.showInputDialog("Enter the number : ");
        number=Integer.parseInt(input);

        if (number==5){
            JOptionPane.showMessageDialog(null,"The number is 5");
            System.out.println("The Number is 5");
        }else if (number<5){
            JOptionPane.showMessageDialog(null,"Less than 5");
            System.out.println("less than 5");
        }else {
            JOptionPane.showMessageDialog(null,"Greater than 5");
            System.out.println("Greater than 5");
        }
        System.exit(0);
    }

}

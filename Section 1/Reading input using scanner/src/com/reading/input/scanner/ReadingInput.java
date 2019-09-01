package com.reading.input.scanner;
import java.util.Scanner;
public class ReadingInput {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;

        Scanner keyBoard = new Scanner(System.in);

        System.out.println("Please enter the first Number");
        firstNumber=keyBoard.nextInt();
        System.out.println("Please enter the second number");
        secondNumber=keyBoard.nextInt();

        double average;
        average=(firstNumber+secondNumber)/2.0;
        System.out.println(average);

        String name;
        String surname;
        keyBoard.nextLine();
        System.out.println("Please enter your name : " );
        name=keyBoard.nextLine();

        System.out.println("enter your sur name");
        surname=keyBoard.nextLine();
        System.out.println("name is "+ name +" and surname is "+ surname);
    }
}

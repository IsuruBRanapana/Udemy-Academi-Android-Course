package com.example;

public class Variables_Literals_Constants {
    public static void main(String[] args) {
        final int firstNumber;
        int secondNumber;

        firstNumber=11;
        secondNumber=20;

        double average;
        average=(firstNumber+secondNumber)/2.0;

        System.out.println("Average : " + average);

        String name;
        name="Isuru";
        String surName;
        surName = "Ranapana";

        System.out.println(name+" "+surName);

        boolean value;
        value=true;

        System.out.println(value);

        char letter;
        letter='C';

        System.out.println(letter);
    }
}

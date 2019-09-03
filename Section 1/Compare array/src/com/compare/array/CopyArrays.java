package com.compare.array;

public class CopyArrays {
    public static void main(String[] args) {
        int [] array1={2,4,6,8,10}; //size5
        int [] array2=new int[array1.length];

        for (int i=0;i<array1.length;i++){
            array2[i]=array1[i];
        }

        System.out.println("This is array 1");
        printArray(array1);
        System.out.println("This is array 2");
        printArray(array2);

        array2[2]=45;
        System.out.println("second array 2");
        printArray(array2);
    }

    public static void printArray(int [] array) {
        for (int value:array){
            System.out.println(value);
        }
    }
}

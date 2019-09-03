package com.example.textFiles;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CalcAverageFile {
    public static void main(String[] args) throws IOException {
        int sum=0;
        int count=0;
        double average;
        File file1=new File("Calc.txt");
        if (file1.exists()){
            Scanner inp=new Scanner(file1);
            while (inp.hasNext()){
                sum+=inp.nextInt();
                count++;
            }
            inp.close();
            average=sum/(double) count;
            System.out.println(average);
        }
    }
}

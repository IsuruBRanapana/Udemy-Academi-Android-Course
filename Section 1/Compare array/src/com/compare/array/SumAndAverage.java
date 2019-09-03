package com.compare.array;

public class SumAndAverage {
    public static void main(String[] args) {
        int [] values={1,2,4,6,8,19,12,75};
        int sum=Sum(values);

        double average=sum/(double) values.length;
        System.out.println("the sum is "+sum);
        System.out.println("the average is "+average);
    }

    public static int Sum(int [] array){
        int sum=0;
        for (int i=0;i<array.length;i++){
            sum += array[i];
        }
        return sum;
    }
}

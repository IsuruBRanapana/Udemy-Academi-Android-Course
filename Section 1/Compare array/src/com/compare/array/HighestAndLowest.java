package com.compare.array;

public class HighestAndLowest {
    public static void main(String[] args) {
        int [] numbers={2,4,6,8,10,15,23,761,12,1};
        int highest=HighestValue(numbers);
        System.out.println("The Highest value is "+highest);
        int lowest = LowestValue(numbers);
        System.out.println("The lowest value is "+lowest);
    }

    public static int HighestValue(int [] array){
        int highest=array[0];
        for (int i=1;i<array.length;i++){
            if (array[i]>highest){
                highest=array[i];
            }
        }
        return highest;
    }
    public static int LowestValue(int [] array){
        int lowest=array[0];
        for (int i=1;i<array.length;i++){
            if (array[i]<lowest){
                lowest=array[i];
            }
        }
        return lowest;
    }
}

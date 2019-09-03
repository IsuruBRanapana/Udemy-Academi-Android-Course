package com.compare.array;

public class StringArrays {
    public static void main(String[] args) {
        String [] names=getNames();
        for (int i=0;i<names.length;i++){
            if (names[i]!=null){
                System.out.println(names[i]);
            }
        }
    }
    public static String [] getNames(){
        String [] names=new String[6];
        names[0]="John";
        names[1]="John1";
        names[2]="John2";
        names[3]="John3";
        names[4]="John4";

        return names;
    }

}

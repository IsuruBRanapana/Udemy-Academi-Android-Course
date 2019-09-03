package com.compare.array;

public class CompareArrays {
    public static void main(String[] args) {
        int [] numbers1={2,4,6,8,10};
        int [] numbers2={2,4,6,8,10};

        boolean arrayEqual= true;
        int i=0;

        if (numbers1.length!=numbers2.length){
            arrayEqual=false;
        }

        while (arrayEqual && i<numbers1.length){
            if (numbers1[i]!=numbers2[i]){
                arrayEqual=false;
            }
            i++;
        }
        if (arrayEqual){
            System.out.println("arrays are Equal");
        }else {
            System.out.println("array isn't equal");
        }
    }
}

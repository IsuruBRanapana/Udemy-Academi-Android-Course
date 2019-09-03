package com.compare.array;

import java.util.ArrayList;

public class TheArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("james");//0
        names.add("peter");//1
        names.add("john");//2
        names.add("jake");//3
        names.add("john1");//4
        names.add(5,"Paul");
        names.add(2,"Isuru");

        names.set(1,"peters");

        names.remove(0);

        for (int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }
    }

}

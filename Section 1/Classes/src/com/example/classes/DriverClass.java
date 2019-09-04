package com.example.classes;

public class DriverClass {
    public static void main(String[] args) {
        House h1=new House();
        h1.setNrOfDoors(4);
        System.out.println(h1.getNrOfDoors());

        House h2=new House(10,2,"Tiles","Bricks");
        h2.setNrOfDoors(3);
        h2.setTypeOfWall("plaster");
        System.out.println("House :");
        System.out.println("nr of doors"+h2.getNrOfDoors());
        System.out.println("nr of windows"+h2.getNrOfWindows());
        System.out.println(h2.getTypeOfRoof());
        System.out.println(h2.getTypeOfWall());
    }
}

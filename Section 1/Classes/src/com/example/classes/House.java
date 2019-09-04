package com.example.classes;

public class House {
    private int nrOfDoors;
    private int nrOfWindows;
    private String typeOfRoof;
    private String typeOfWall;

    /**
     * This is default constructor
     */
    public House(){
        nrOfDoors=0;
        nrOfWindows=0;
        typeOfRoof=null;
        typeOfWall=null;
    }

    //parameterize constructor
    public House(int nrOfDoors, int nrOfWindows, String typeOfRoof, String typeOfWall){
        this.nrOfDoors=nrOfDoors;
        this.typeOfWall=typeOfWall;
        this.typeOfRoof=typeOfRoof;
        this.nrOfWindows=nrOfWindows;
    }

    //getter and setter
    //getter
    public int getNrOfDoors(){
        return nrOfDoors;
    }

    public int getNrOfWindows() {
        return nrOfWindows;
    }

    public String getTypeOfRoof() {
        return typeOfRoof;
    }

    public String getTypeOfWall() {
        return typeOfWall;
    }

    //setter

    public void setNrOfDoors(int nrOfDoors) {
        this.nrOfDoors = nrOfDoors;
    }

    public void setNrOfWindows(int nrOfWindows) {
        this.nrOfWindows = nrOfWindows;
    }

    public void setTypeOfRoof(String typeOfRoof) {
        this.typeOfRoof = typeOfRoof;
    }

    public void setTypeOfWall(String typeOfWall) {
        this.typeOfWall = typeOfWall;
    }
}

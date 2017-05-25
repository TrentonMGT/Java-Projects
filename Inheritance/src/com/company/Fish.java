package com.company;

/**
 * Created by Boanerges on 5/25/17.
 */
public class Fish extends Animal{
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {//Starts with the basic characteristics of an Animal

        super(name, 1, 1, size, weight);//extends from the Animal class
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    //Methods of the fish class
    private void rest() {

    }

    private void moveMuscles() {

    }

    private void moveBackFin() {

    }

    private void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);


    }

}

package com.company;

/**
 * Created by Boanerges on 5/25/17.
 */
public class Dog extends Animal {
    // Fields
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //call the other construct class to initialize it
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {//Starts with the basic characteristics of an Animal
        super(name, 1, 1, size, weight);//extends from the Animal class
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    //Overide the method in the super class
    @Override
    public void eat() {
        System.out.println("Dog.dogChew() is called");
        dogChew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.dogChew() is called");
    }

    public void run() {
        System.out.println("Dog.run() is called");
        move(5);
    }

    public void speed() {
        System.out.println("dog.run() is called");
        move(10);
    }


    private void dogChew(){
        System.out.println("Dog.dogChew() is called");
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        //Created two car objects
        Car chevy = new Car();
        Car porshe = new Car();

        //Give the chevy a model and display it
        chevy.setModel("nova");
        System.out.println("Model is "+ chevy.getModel());
    }
}

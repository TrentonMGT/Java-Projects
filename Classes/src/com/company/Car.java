package com.company;

/**
 * Created by Boanerges on 5/25/17.
 */
public class Car {
    //Fields or characteristics
    private int door;
    private int wheel;
    private String  model;
    private String  engine;
    private String  color;

    public void setModel(String model) {

        String validModel = model.toLowerCase();

        //simple validation or rules
        if (validModel.equals("nova") || validModel.equals("volt")) {
            this.model = model;//Update the model with a method without accessing it directly

        } else {
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return model; //Returns the current model
    }
}


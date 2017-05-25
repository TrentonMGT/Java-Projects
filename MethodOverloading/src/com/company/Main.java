/*
Measurement conversion calculations and Team scores simple solution with MethodOverloading
http://www.metric-conversions.org/
*/
package com.company;

public class Main {

    public static void main(String[] args) {
        //Invoke a 3 method
        calculateScore("GA Tech", 400);
        calculateScore(1000);
        calculateScore();

        double centimeters = calcFeetAndInchesToCentimeters(6,0);
        if(centimeters <0.0) {
            System.out.println("Invalid parameters");
        }
        //invoke a method called calcFeetAndInchesToCentimeters and pass a inches param
        calcFeetAndInchesToCentimeters(157);

    }

    //Metric Conversions Methods with simple validations
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if((feet <0) || ((inches <0) || (inches >12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if(inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

///End of Metric Conversions Methods with simple validations










    //Calculate score method and get player name
    public static int calculateScore(String teamName, int scored){
        System.out.println("Team " +teamName +" "+ scored);
        return scored * 500;
    }

    //Calculate score method
    public static int calculateScore(int scored){
        System.out.println(scored);
        return scored * 500;
    }

    //Calculate score method
    public static int calculateScore(){
        System.out.println("No player has a score");
        return 0;
    }
}

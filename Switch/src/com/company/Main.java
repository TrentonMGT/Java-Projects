package com.company;

public class Main {

    public static void main(String[] args) {
        //Variable
        int switchCase = 4;
        //Control Statement
        switch (switchCase){
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
                System.out.println("Value is 3");
                break;
            case 4: case 5: case 6: case 7:
                System.out.println("was a 4 , 5, 6, 7");
                System.out.println("The test answer was a "+ switchCase);
                break;
            default:
                System.out.println("None of the values are correct");
                break;
        }
    }
}

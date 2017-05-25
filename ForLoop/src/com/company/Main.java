package com.company;

public class Main {

    public static void main(String[] args) {
    //iterating through and printing message 5 time
        for (int i = 2; i < 7; i++){
            double calculate = calculateInterest(10000,i);
            System.out.println("$10,000 at " + i + "% interst = "+ calculate );
        }

        int count = 0;
        for(int i=1; i<100; i++)
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
    }
    //Calculating interest calculator
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }

    //Prime number boolean Method Determins if the number is prime
    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        for(int i=2; i <= n/2; i++) {
            System.out.println("Looping " +i);
            if(n % i == 0) {
                return false;
            }
        }

        return true;

    }


}

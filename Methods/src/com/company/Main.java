package com.company;

public class Main {

    public static void main(String[] args) {
        //Variable
        boolean gameOver = true;
        int gameScore = 800;
        int levelCompleted = 5;
        int bonus = 100;

        //invoke the method
        score(gameOver,gameScore,levelCompleted,bonus);

        int highScore = finalScore(false,50,3,20);

        //Display the results
        System.out.println(highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("GA Tech", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bull Dogs", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Alabama", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Michigan", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table");
    }

    //Method that test the Teams position
    public static int calculateHighScorePosition(int playerScore) {

        if(playerScore >= 1000) {
            return 1;
        } else if(playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if(playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }


    //calculate final score
    //Method for the score that takes in four perameters
    public static void score( boolean gameOver, int score, int levelCompleted, int bonus) {
        //calculate final score if the game is true
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score is " + finalScore);

        }
    }

    //Method that returns a value
    public static int finalScore( boolean gameOver, int score, int levelCompleted, int bonus) {
        //calculate final score
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score is " + finalScore);
            return finalScore;

        }
            return -1;//return -1 if game over is not true
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.rockpaperscissors;



import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lamarjohnson
 */
public class Game {

    public static void main(String[] args) {
        Scanner rpss = new Scanner(System.in);
        Random generator = new Random();

        int compScore = 0;
        int playerScore = 0;
        int tieScore = 0;
        int rCounter = 0;

        System.out.println("How many rounds do you want to play");
        int maxRound = rpss.nextInt();

        if (maxRound <= 1 || maxRound >= 10) {
            System.out.println("Please select a number 1 thru 10");

            return;

        }

        //while (maxRound >= 1 || maxRound <= 10 && ((playerScore + compScore) != maxRound)) {
        while (maxRound >= 1 || maxRound <= 10 && ((playerScore + compScore) != maxRound)) {

            int comChoice = (generator.nextInt(3) + 1);
            System.out.println("Player, Enter 1 for rock, 2 for scissors, and 3 for paper");
            int playerChoice = rpss.nextInt();

            if (playerChoice == comChoice) {
                System.out.println("It's a tie game");
                tieScore++;
                System.out.println("Player:" + playerScore);
                System.out.println("Computer:" + compScore);
                System.out.println("Ties:" + tieScore);

            } else if (playerChoice == 1 && comChoice == 2) {

                System.out.println("Player selected rock. Computer selected paper");
                System.out.println("Computer Won!!");
                compScore++;
                rCounter++;
                System.out.println("Player:" + playerScore);
                System.out.println("Computer:" + compScore);
                System.out.println("Ties:" + tieScore);

            } else if (playerChoice == 1 && comChoice == 3) {
                System.out.println("Player selected rock. Computer selected scissors");
                System.out.println("Player Won!!");
                playerScore++;
                rCounter++;
                System.out.println("Player:" + playerScore);
                System.out.println("Computer:" + compScore);
                System.out.println("Ties:" + tieScore);

            } else if (playerChoice == 2 && comChoice == 1) {

                System.out.println("Player selected paper. Computer selected rock");
                System.out.println("Player Won!!");
                playerScore++;
                rCounter++;
                System.out.println("Player:" + playerScore);
                System.out.println("Computer:" + compScore);
                System.out.println("Ties:" + tieScore);
            } else if (playerChoice == 2 && comChoice == 3) {
                System.out.println("Player selected paper. Computer selected scissors");
                System.out.println("Player Won!!");
                compScore++;
                rCounter++;
                System.out.println("Player:" + playerScore);
                System.out.println("Computer:" + compScore);
                System.out.println("Ties:" + tieScore);
            } else if (playerChoice == 3 && comChoice == 1) {

                System.out.println("Player selected scissors. Computer selected rock");
                System.out.println("Computer Won!!");
                compScore++;
                rCounter++;
                System.out.println("Player:" + playerScore);
                System.out.println("Computer:" + compScore);
                System.out.println("Ties:" + tieScore);
            } else if (playerChoice == 3 && comChoice == 2) {
                System.out.println("Player selected scissors. Computer selected paper");
                System.out.println("Player Won!!");
                playerScore++;
                rCounter++;
                System.out.println("Player:" + playerScore);
                System.out.println("Computer:" + compScore);
                System.out.println("Ties:" + tieScore);

            }
            if ((playerScore + compScore) == maxRound && playerScore > compScore) {
                System.out.println("The game is over");
                System.out.println("The player Won!!!");
                System.out.println("Do you want to play again??");
                rCounter++;
            }
            if ((playerScore + compScore) == maxRound && playerScore < compScore) {
                System.out.println("The game is over");
                System.out.println("The computer Won!!!");
                System.out.println("Do you want to play again??");
                rCounter++;
            }
        }

    }
}


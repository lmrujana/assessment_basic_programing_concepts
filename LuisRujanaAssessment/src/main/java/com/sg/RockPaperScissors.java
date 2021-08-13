package com.sg;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();

    public static void rockPaperScissors(int numOfRounds){
        String[] options = {"rock", "paper", "scissors"};

        //Variable declarations
        int userChoice;
        int computerChoice;

        int currentRound = 1;

        int userWins = 0;
        int computerWins = 0;
        int ties = 0;

        //First, check that number of rounds is between limits
        if(numOfRounds < 1 || numOfRounds > 10){
            System.out.println("Number of rounds must be between 1 and 10");
        } else {
            /*
            If number of rounds is within range, enter a loop to play that many rounds.
             */
            while(currentRound <= numOfRounds){
                System.out.println("Chose a number: 1 = Rock, 2 = Paper, 3 = Scissors");
                userChoice = Integer.parseInt(sc.nextLine()) - 1;
                //Check if user's choice is one of the options, else ask user to pick again.
                if(userChoice < 0 || userChoice > 2){
                    System.out.println("Wrong choice, pick again!");
                    continue;
                }

                computerChoice = rnd.nextInt(3);

                //Once the user's choice and the computer choice, increase round counter and display the choices
                currentRound++;
                System.out.println("===================================");
                System.out.println("Your choice: " + options[userChoice]);
                System.out.println("Computer choice: " + options[computerChoice] + "\n");

                //Base on the choices, determine a winner and increase winning or tie counters
                switch (userChoice){
                    case 0:
                        if(computerChoice == 0){
                            System.out.println("It's a tie!");
                            ties += 1;
                        } else if (computerChoice == 2){
                            System.out.println("User wins!");
                            userWins += 1;
                        } else {
                            System.out.println("Computer wins!");
                            computerWins += 1;
                        }
                        break;
                    case 1:
                        if(computerChoice == 1){
                            System.out.println("It's a tie!");
                            ties += 1;
                        } else if (computerChoice == 0){
                            System.out.println("User wins!");
                            userWins += 1;
                        } else {
                            System.out.println("Computer wins!");
                            computerWins += 1;
                        }
                        break;
                    case 2:
                        if(computerChoice == 2){
                            System.out.println("It's a tie!");
                            ties += 1;
                        } else if (computerChoice == 1){
                            System.out.println("User wins!");
                            userWins += 1;
                        } else {
                            System.out.println("Computer wins!");
                            computerWins += 1;
                        }
                        break;
                    default:
                        System.out.println("Wrong choice, pick again!");
                        break;
                }
            }

            //Display final score and announce winner of the game
            System.out.println("===================================");
            System.out.println("User wins: " + userWins);
            System.out.println("Computer wins: " + computerWins);
            System.out.println("Ties: " + ties);

            if(userWins == computerWins){
                System.out.println("No one won, it's a tie!");
            } else if(userWins > computerWins){
                System.out.println("User is the winner!");
            } else {
                System.out.println("Computer is the winner!");
            }
        }
    }

    public static void main(String[] args) {

        String wantToContinue;

        do{
            System.out.println("How many Rounds do you want to play?");
            int numOfRound = Integer.parseInt(sc.nextLine());

            rockPaperScissors(numOfRound);

            System.out.println("Want to play again (y/n):");
            wantToContinue = sc.nextLine();

        }while (wantToContinue.equals("y"));


    }
}

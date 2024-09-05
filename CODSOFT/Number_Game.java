//                                         1) NUMBER GAME

import java.util.Scanner;

public class Number_Game {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        int totalScore = 0;
        char playAgain;

        do {
            System.out.println("Guess My Number Between 0 and 100");
            int mynumber = (int)(Math.random() * 101);
            int usernumber;
            int attempts = 0;
            int maxAttempts = 7;  // Limit the number of attempts

            while (attempts < maxAttempts) {
                System.out.println("Attempt " + (attempts + 1) + " of " + maxAttempts);
                usernumber = Sc.nextInt();
                attempts++;

                if (usernumber == mynumber) {
                    System.out.println("Wooohhooo... Correct number!!!");
                    totalScore += (maxAttempts - attempts + 1);  // Higher score for fewer attempts
                    break;
                } else if (usernumber > mynumber) {
                    System.out.println("Your number is too high.");
                } else {
                    System.out.println("Your number is too low.");
                }

                if (attempts == maxAttempts) {
                    System.out.println("Sorry, you've used all attempts! The correct number was: " + mynumber);
                }
            }

            System.out.println("Your current score: " + totalScore);

            // Ask if the user wants to play another round
            System.out.println("Do you want to play again? (y/n)");
            playAgain = Sc.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("Thank you for playing! Your final score is: " + totalScore);
    } 
}

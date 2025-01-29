import java.util.Scanner;
import java.util.Random;
public class numberguess {
    public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                Random random = new Random();

                System.out.println("Welcome to the Number Guessing Game!");
                System.out.println("I'm thinking of a number between 1 and 100.");
                System.out.println("Can you guess it?");

                // Generate a random number between 1 and 100
                int targetNumber = random.nextInt(100) + 1;
                int attempts = 0;
                int guess = 0;

                // Game loop
                while (guess != targetNumber) {
                    System.out.print("Enter your guess: ");
                    guess = sc.nextInt();
                    attempts++;

                    if (guess > targetNumber) {
                        System.out.println("Too high! Try again.");
                    } else if (guess < targetNumber) {
                        System.out.println("Too low! Try again.");
                    } else {
                        System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    }
                }

                System.out.println("Thank you for playing!");
                sc.close();
            }
        }

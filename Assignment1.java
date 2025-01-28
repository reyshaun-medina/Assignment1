import java.security.SecureRandom;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        SecureRandom randomNumberObj = new SecureRandom();
        int number = 1 + randomNumberObj.nextInt(6);

        Scanner input = new Scanner(System.in);
        int guess;
        int guessCounter = 0;

        do {
            ++guessCounter;

            if (guessCounter > 1) {
                System.out.println("\n");
            }

            System.out.printf("%s: ", "Enter a number between 1 and 10");
            guess = input.nextInt();

            if (guess < number) {
                System.out.printf("%s, %s.", "Too low", "try again");
            }

            if (guess > number) {
                System.out.printf("%s, %s.", "Too high", "try again");
            }
        } while (guessCounter < 5 && guess != number);

        if (guessCounter == 5 && guess != number) {
            System.out.printf("%n%n%s! %s.%n%s %d.", "Sorry", "You've lost the game", "The correct number is", number);
        }

        if (guess == number) {
            System.out.printf("%s! %s.", "Congratulations", "You've guessed the correct number");
        }

        input.close();
    }
}

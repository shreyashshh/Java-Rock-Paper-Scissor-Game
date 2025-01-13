import java.util.Scanner;
import java.util.Random;

public class RPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Choices for the game
        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.println("Welcome to Rock, Paper, Scissors Game!");
        System.out.println("Rules: Rock beats Scissors, Scissors beats Paper, Paper beats Rock.");

        while (true) {
            System.out.println("\nChoose your move:");
            System.out.println("0: Rock");
            System.out.println("1: Paper");
            System.out.println("2: Scissors");
            System.out.println("3: Exit the game");

            System.out.print("Your choice: ");
            int userChoice = scanner.nextInt();

            // Exit the game
            if (userChoice == 3) {
                System.out.println("Thank you for playing! Goodbye!");
                break;
            }

            // Validate user input
            if (userChoice < 0 || userChoice > 2) {
                System.out.println("Invalid choice. Please select 0, 1, or 2.");
                continue;
            }

            // Computer randomly selects a choice
            int computerChoice = random.nextInt(3);

            System.out.println("You chose: " + choices[userChoice]);
            System.out.println("Computer chose: " + choices[computerChoice]);

            // Determine the winner
            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((userChoice == 0 && computerChoice == 2) ||  // Rock beats Scissors
                       (userChoice == 1 && computerChoice == 0) ||  // Paper beats Rock
                       (userChoice == 2 && computerChoice == 1)) {  // Scissors beats Paper
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }

        scanner.close();
    }
}

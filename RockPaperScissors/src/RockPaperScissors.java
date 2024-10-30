import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playAgain;
        do {
            String playerAChoice = getPlayerChoice(input, "Player A");
            String playerBChoice = getPlayerChoice(input, "Player B");

            displayResult(playerAChoice, playerBChoice);

            System.out.print("Play again? [Y/N]: ");
            playAgain = input.next();
        } while (playAgain.equalsIgnoreCase("Y"));
        input.close();
    }

    private static String getPlayerChoice(Scanner input, String player) {
        String choice;
        while (true) {
            System.out.print(player + ", enter your move (R, P, S): ");
            choice = input.next();
            if (choice.equalsIgnoreCase("R") || choice.equalsIgnoreCase("P") || choice.equalsIgnoreCase("S")) {
                return choice.toUpperCase();
            }
            System.out.println("Invalid choice. Please enter R, P, or S.");
        }
    }

    private static void displayResult(String choiceA, String choiceB) {
        if (choiceA.equals(choiceB)) {
            System.out.println(choiceA + " vs " + choiceB + ": It's a Tie!");
        } else if (choiceA.equals("R") && choiceB.equals("S") ||
                choiceA.equals("S") && choiceB.equals("P") ||
                choiceA.equals("P") && choiceB.equals("R")) {
            System.out.println(choiceA + " beats " + choiceB + ". Player A wins!");
        } else {
            System.out.println(choiceB + " beats " + choiceA + ". Player B wins!");
        }
    }
}

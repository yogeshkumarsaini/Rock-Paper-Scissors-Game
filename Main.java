import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RPSGame game = new RPSGame();

        System.out.println("🎮 Welcome to Rock-Paper-Scissors!");

        while (true) {
            System.out.print("\nEnter your choice (rock/paper/scissors): ");
            String userChoice = scanner.next().toLowerCase();

            if (!userChoice.equals("rock") &&
                !userChoice.equals("paper") &&
                !userChoice.equals("scissors")) {
                System.out.println("❌ Invalid input! Try again.");
                continue;
            }

            String computerChoice = game.getComputerChoice();
            System.out.println("🤖 Computer chose: " + computerChoice);

            String result = game.decideWinner(userChoice, computerChoice);

            if (result.equals("tie")) {
                System.out.println("😐 It's a tie!");
            } else if (result.equals("win")) {
                System.out.println("🎉 You win!");
            } else {
                System.out.println("💀 You lose!");
            }

            System.out.println("\n📊 Scoreboard:");
            System.out.println("You: " + game.getUserScore());
            System.out.println("Computer: " + game.getComputerScore());

            System.out.print("\nDo you want to play again? (yes/no): ");
            String choice = scanner.next().toLowerCase();
            if (!choice.equals("yes")) {
                System.out.println("\n👋 Final Score:");
                System.out.println("You: " + game.getUserScore());
                System.out.println("Computer: " + game.getComputerScore());
                System.out.println("Thanks for playing!");
                break;
            }
        }

        scanner.close();
    }
}

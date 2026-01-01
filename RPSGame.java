import java.util.Random;

public class RPSGame {
    private int userScore;
    private int computerScore;
    private final String[] choices = {"rock", "paper", "scissors"};
    private Random random;

    public RPSGame() {
        this.userScore = 0;
        this.computerScore = 0;
        this.random = new Random();
    }

    public String getComputerChoice() {
        return choices[random.nextInt(3)];
    }

    public String decideWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "tie";
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            userScore++;
            return "win";
        } else {
            computerScore++;
            return "lose";
        }
    }

    public int getUserScore() {
        return userScore;
    }

    public int getComputerScore() {
        return computerScore;
    }
}

package ca.sheridancollege.vellone.assignment1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;

@Data//auto generates setters and getters
@AllArgsConstructor
@NoArgsConstructor
public class Game {

    private int userChoice = 0;
    private int computerChoice = 0;
    private String winner = "";

    Random rn = new Random();

    public void setHand() {
        for (int i = 0; i < 1; i++) {
            this.computerChoice = rn.nextInt(3);
        }
        //System.out.println("computerChoice: " + computerChoice);
    }

    public void winner() {
        if (userChoice == computerChoice)//0=paper 1=rock 2=scissors
            winner = "It was a draw";
        else if (userChoice == 0 && computerChoice == 2)
            winner = "Scissor cuts paper. You lose!!";
        else if (userChoice == 0 && computerChoice == 1)
            winner = "Paper eats rock. You win!!";
        else if (userChoice == 1 && computerChoice == 2)
            winner = "Rock crushes scissors. You win!!";
        else if (userChoice == 1 && computerChoice == 0)
            winner = "Paper eats rock. You lose!!";
        else if (userChoice == 2 && computerChoice == 0)
            winner = "Scissor cuts paper. You win!!";
        else if (userChoice == 2 && computerChoice == 1)
            winner = "Rock breaks scissors. You lose!!";
        else
            winner = "Invalid user input.";
    }
}

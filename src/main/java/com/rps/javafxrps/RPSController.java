package com.rps.javafxrps;

import java.util.*;

public class RPSController {
    private static final Map<String, Integer> RPS_TO_INT;
    // Found a couple of interesting constructions for this, using collections.unmodifiablemap might be the "most" immutable, but this is fine.
    static {
        RPS_TO_INT = Map.of("Rock", 0, "Paper", 1, "Scissors", 2);
    }
    public RPSController(){}

    /**
     * Compares the player throw to a randomly generated throw, using ints as
     * Rock[0] Paper[1] Scissors[2]. Returns the Player's outcome.
     */
    private String rpsResult(int oppChoice) {
        Random random = new Random();
        int myChoice = random.nextInt(3);
        System.out.println("Computer plays: " + myChoice);
        System.out.println((oppChoice + 1)%3);

        // Return results are the *Player's* result
        if (oppChoice==myChoice){
            return "Tie";
        } else if ((oppChoice + 1)%3 == myChoice) {
            return "Lose";
        } else {
            return "Win";
        }
    }

    public String rpsThrow() {
        System.out.println("Choose Rock, Paper, or Scissors");

        Scanner scanner = new Scanner(System.in);
        String oppChoice = scanner.next();
        int oppInt = RPS_TO_INT.get(oppChoice);
        return this.rpsResult(oppInt);
    }

    public static void main(String[] args) {
        RPSController controller = new RPSController();
        System.out.println("You " + controller.rpsThrow());
    }
}

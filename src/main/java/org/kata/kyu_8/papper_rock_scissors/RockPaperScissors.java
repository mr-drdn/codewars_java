package org.kata.kyu_8.papper_rock_scissors;

import java.util.HashMap;
import java.util.Map;

public class RockPaperScissors {

    public static String rps(String p1, String p2) {
        Map<String, String> winner = new HashMap<>();
        winner.put("rock", "scissors");
        winner.put("scissors", "paper");
        winner.put("paper", "rock");
        System.out.println("p1 " + p1);
        System.out.println("p2 " + p2);
        System.out.println("winner.get(p1) = " + winner.get(p1));
        System.out.println("winner.get(p2) = " + winner.get(p2));
        if (p1.equals(p2)) {
            System.out.println("Ничья! 🤝");
            return "Draw\n";
        }
        if (winner.get(p1).equals(p2)) {
            System.out.println(p1 + " бъёт 👊 " + p2);
            return "Player 1 won!\n";
        }
        System.out.println(p1 + " не бъёт 🤗 " + p2);
        return "Player2 won!\n";
    }

    public static void main(String[] args) {
        // Просто вызываем функцию, чтобы увидеть вывод
        System.out.println(rps("paper", "scissors"));

        System.out.println(rps("rock", "scissors"));
        System.out.println(rps("scissors", "paper"));
        System.out.println(rps("paper", "rock"));

        System.out.println(rps("rock", "rock"));
        System.out.println(rps("scissors", "scissors"));
        System.out.println(rps("paper", "paper"));

    }
}

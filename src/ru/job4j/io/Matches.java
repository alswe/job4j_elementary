package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matches = 11;
        int attempt = 1;
        int drawn = -1;

        while(matches > 0) {
            while (drawn < 0 || drawn > 3) {
                System.out.println("Number of remained matches is " + matches + "." + System.lineSeparator() +
                        "Player " + (attempt % 2 == 1 ? 1 : 2) + ", it's your turn." + System.lineSeparator() +
                        "Draw from 1 to 3 matches:");
                drawn = Integer.valueOf(scanner.nextLine());
            }
            matches -= drawn;
            drawn = -1;
            attempt++;
        }
        System.out.println("Player " + ((attempt - 1) % 2 == 1 ? 1 : 2) + " won! Congratulations!");
    }
}

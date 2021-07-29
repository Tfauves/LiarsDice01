package com.careerDevs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    public Player player;
    public List<Player> players = new ArrayList<>();
    public Scanner scanner = new Scanner(System.in);
    public int maxPlayers = 10;
    public int minPlayers = 1;

    public Game() {
        System.out.println("Enter amount of players: ");
        int numOfPlayers;
        do {
            numOfPlayers = scanner.nextInt();
            scanner.nextLine();
        } while (numOfPlayers < minPlayers || numOfPlayers > maxPlayers);

        while (players.size() < numOfPlayers) {
            System.out.println("Enter Player Name: ");
            players.add(new Player((scanner.nextLine()).trim()));
        }
    }
}

package com.spsmb.oop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        run();
    }
    private static void run(){
        System.out.println("Vitejte ve gladiatorove doupeti ");
        String[] playerNames = userInput();
        Player playerOne = new Player(playerNames[0], 100, 15);
        Player playerTwo = new Player(playerNames[1], 50, 2);
        Arena arena = new Arena("doupe");
        arena.fight(playerOne, playerTwo);
    }

    private static String[] userInput(){
        System.out.println("Zadejte jmeno prvniho hrace: ");
        String playerOneName = sc.nextLine();
        System.out.println("Zadejte jmeno druheho hrace: ");
        String playerTwoName = sc.nextLine();
        return new String[]{playerOneName, playerTwoName};
    }
}
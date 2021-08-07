package com.game.poker;

import java.util.Arrays;
import java.util.Scanner;

public class PokerGame_Cards {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("_________Welcome to Poker Game_________");

		System.out.println(" ");

		System.out.println("_________Enter the number of players_________");

		int playerId = sc.nextInt();
		// String playerName = sc.nextLine();

		String maxName[] = new String[playerId];

		int maxId[] = new int[playerId];
		System.out.println("Total number of player is : " + maxId.length);

		System.out.println("Enter ID");
		for (int i = 0; i <= maxId.length - 1; i++) {
			maxId[i] = sc.nextInt();
		}

		System.out.println(" ");

		System.out.println("Enter Name");
		for (int i = 0; i < maxName.length; i++) {
			maxName[i] = sc.next();
		}

		System.out.println(" ");

		for (int i : maxId) {
			System.out.println("Players ID : " + i);
		}

		System.out.println("Welcome Players : " + Arrays.toString(maxName));

		System.out.println("");

		System.out.println("______________________ Cards shuffling started ______________________");

		System.out.println("");

		// sc.close();

		String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };

		String[] RANKS = { "A", "King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2" };

		// initialize deck
		int n = SUITS.length * RANKS.length;
		String[] deck = new String[n];
		for (int i = 0; i < RANKS.length; i++) {
			for (int j = 0; j < SUITS.length; j++) {
				deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];
			}
		}

		// shuffle
		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n - i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}

		// print shuffled deck
		for (int i = 0; i < n; i++) {
			System.out.println(deck[i]);
		}

		System.out.println("______________________ Cards shuffling completed ______________________");

		System.out.println("Enter how many card want to distribute to player - " + maxName[0] + " (Max 3 cards)");
		int playerNo1 = sc.nextInt();
		System.out.println(
				"Enter cards details max 3 cards in format (7,3,3) assume 7 as Jocker and bet that he has (3,3,3)........");

		int player1[] = new int[playerNo1];
		for (int i = 0; i < player1.length; i++) {
			player1[i] = sc.nextInt();
		}

		for (int i : player1) {
			System.out.println("Cards entered : " + i);
		}

		System.out.println(" ");

		System.out.println("Enter how many card want to distribute to player - " + maxName[1] + " (Max 3 cards)");
		int playerNo2 = sc.nextInt();
		System.out.println(
				"Enter cards details max 3 cards in format (7,5,3) assume 3 as Jocker and bet that he has (7,7,5)........");

		int player2[] = new int[playerNo2];
		for (int i = 0; i < player2.length; i++) {
			player2[i] = sc.nextInt();
		}

		for (int i : player2) {
			System.out.println("Cards entered : " + i);
		}

		System.out.println(" ");

		System.out.println("Enter how many card want to distribute to player - " + maxName[2] + " (Max 3 cards)");
		int playerNo3 = sc.nextInt();
		System.out.println(
				"Enter cards details max 3 cards in format (7,5,3) assume 3 as Jocker and bet that he has (5,5,3)........");

		int player3[] = new int[playerNo3];
		for (int i = 0; i < player3.length; i++) {
			player3[i] = sc.nextInt();
		}

		for (int i : player3) {
			System.out.println("Cards entered : " + i);
		}

		System.out.println(" ");
		System.out.println("______________________ Players cards input completed ______________________");
		System.out.println(" ");

		System.out.println("______________________ Result evaluation started ______________________");
//		try {
//			if (player1.length >= player2[playerNo2]) {
//				System.out.println("Player " + maxName[0] + " Wins.....");
//			} else {
//				System.out.println("Player " + maxName[1] + " runner up");
//			}
//		} catch (ArrayIndexOutOfBoundsException e) {
//			e.getClass();
//			e.getMessage();
//			e.printStackTrace();
//		}

		System.out.println(" ");

		if (player1.equals(player2)) {
			System.out.println("Player loss");
		} else {
			System.out.println(" ______________________ Player " + maxName[0] + " wins ______________________");
		}

		System.out.println(" ");

		System.out.println("______________________ Result evaluation completed ______________________");

		sc.close();

	}

}

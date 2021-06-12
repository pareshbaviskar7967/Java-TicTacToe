package com.bl.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {

	// UC-1 Create board of char size 10
	public static char[] createBoard() {
		char[] board = new char[10];
		for (int i = 1; i < board.length; i++) {
			board[i] = ' ';
		}
		return board;
	}

	// UC-2 create method for user input
	public static void inputLetterOX() {
		String computerLetter, playerLetter;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select your letter (X/O): ");
		playerLetter = scanner.nextLine().toUpperCase();

		if (playerLetter.equals("X")) {
			computerLetter = "O";
			System.out.println("Computer letter is : " + computerLetter);
		} else if (playerLetter.equals("O")) {
			computerLetter = "X";
			System.out.println("Computer letter is : " + computerLetter);
		} else {
			System.out.println("Incorrect input");
		}
	}

	public static void main(String[] args) {
		System.out.println("Heyyy.....Welcome to the TicTacToe Game");
		TicTacToeGame Tobj = new TicTacToeGame();
		char[] board = createBoard();
		Tobj.inputLetterOX();
	}
}

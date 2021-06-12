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
			System.out.println("User letter is : " + playerLetter);
		} else if (playerLetter.equals("O")) {
			computerLetter = "X";
			System.out.println("Computer letter is : " + computerLetter);
			System.out.println("User letter is : " + playerLetter);
		} else {
			System.out.println("Incorrect input");
		}
	}

	// UC-3 Show the structure of board
	public static void showBoard(char[] board) {
		System.out.println("~~~~~~~~~~~~~~~");
		System.out.println(" | " + board[1] + " | " + board[2] + " | " + board[3] + " | ");
		System.out.println("~~~~~~~~~~~~~~~");
		System.out.println(" | " + board[4] + " | " + board[5] + " | " + board[6] + " | ");
		System.out.println("~~~~~~~~~~~~~~~");
		System.out.println(" | " + board[7] + " | " + board[8] + " | " + board[9] + " | ");
		System.out.println("~~~~~~~~~~~~~~~");
	}

	public static void main(String[] args) {
		System.out.println("Heyyy.....Welcome to the TicTacToe Game");
		TicTacToeGame Tobj = new TicTacToeGame();
		char[] board = createBoard();
		Tobj.inputLetterOX();
		showBoard(board);
	}
}

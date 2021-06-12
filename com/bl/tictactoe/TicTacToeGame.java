package com.bl.tictactoe;

public class TicTacToeGame {
	public static char[] createBoard() {
		char[] board=new char[10];
		for(int i=1;i<board.length;i++) {
			board[i]=' ';
		}
		return board;
	}

	public static void main(String[] args) {
		System.out.println("Heyyy.....Welcome to the TicTacToe Game");
		
		char[] board=createBoard();
	}
}

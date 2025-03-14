package myproject;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		char [][] gameBoard = {{' ','|',' ','|',' '},
							{'-','+','-','+','-'},
							{' ','|',' ','|',' '},
							{'-','+','-','+','-'},
							{' ','|',' ','|',' '}};
		printGameBoard(gameBoard);
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NUMBER 1 TO 9");
		int pos = sc.nextInt();
		String user = null;
		placePiece(gameBoard,pos,user);
		printGameBoard(gameBoard);
	}
		public static void printGameBoard(char [][] gameBoard)
		{
			for(char[] row : gameBoard) {
				for(char c : row) {
					System.out.print(c);
				}
				System.out.println();
			}
		}
		public static void placePiece(char[][] gameBoard,int pos,String user)
		{
			switch(pos)
			{
				case 1 :gameBoard[0][0] ='X';
						break;
				case 2 :gameBoard[0][2] ='X';
						break;
				case 3 :gameBoard[0][4] ='X';
						break;
				case 4 :gameBoard[2][0] ='X';
						break;
				case 5 :gameBoard[2][2] ='X';
						break;
				case 6 :gameBoard[2][4] ='X';
						break;
				case 7 :gameBoard[4][0] ='X';
						break;
				case 8 :gameBoard[4][2] ='X';
						break;
				case 9 :gameBoard[4][4] ='X';
						break;
			}
		}
	}

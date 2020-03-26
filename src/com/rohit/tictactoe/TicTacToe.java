package com.rohit.tictactoe;

import java.util.Random;
import java.util.Scanner;

import com.rohit.tictactoe.utils.GameStatus;
import com.rohit.tictactoe.utils.TicTacToeUtils;

public class TicTacToe {

	char[][] board = { { ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' },
			{ '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' } };

	public static void main(String[] args) {
		TicTacToe game = new TicTacToe();
		CheckWinner checkWinner = new CheckWinner();

		Scanner scanner = new Scanner(System.in);

		while (true) {
			int playerPositon;

			while (true) {
				playerPositon = scanner.nextInt();
				if (!TicTacToeUtils.computerPosition.contains(playerPositon) && !TicTacToeUtils.playerPosition.contains(playerPositon) ) {
					break;
				} else {
					System.out.println("Position Already occupied, Enter other position");
				}
			}
			game.place(playerPositon, true);
			TicTacToeUtils.playerPosition.add(playerPositon);
			game.printBoard();

			GameStatus status = checkWinner.checkWinner();
			if (GameStatus.PLAYER_WON.equals(status)) {
				System.out.println("You Won");
				break;
			} else if (GameStatus.COMPUTER_WON.equals(status)) {
				System.out.println("Computer Won");
				break;
			} else if (GameStatus.MATCH_DRAWN.equals(status)) {
				System.out.println("Match Drawn");
				break;
			}
			
			
			Random random = new Random();
			int computerPosition;
			while (true) {
				computerPosition = random.nextInt(9)+1;
				if (!TicTacToeUtils.playerPosition.contains(computerPosition) && !TicTacToeUtils.computerPosition.contains(computerPosition)) {
					break;
				}
				else {
					continue;
				}
			}

			game.place(computerPosition, false);
			TicTacToeUtils.computerPosition.add(computerPosition);
			game.printBoard();

			GameStatus status1 = checkWinner.checkWinner();
			if (GameStatus.PLAYER_WON.equals(status1)) {
				System.out.println("You Won");
				break;
			} else if (GameStatus.COMPUTER_WON.equals(status1)) {
				System.out.println("Computer Won");
				break;
			} else if (GameStatus.MATCH_DRAWN.equals(status1)) {
				System.out.println("Match Drawn");
				break;
			}

		}

	}

	void place(int pos, boolean isPlayer) {

		char symbol;

		if (isPlayer)
			symbol = 'X';
		else
			symbol = 'O';

		switch (pos) {

		case 1:
			board[0][0] = symbol;
			break;
		case 2:
			board[0][2] = symbol;
			break;

		case 3:
			board[0][4] = symbol;
			break;

		case 4:
			board[2][0] = symbol;
			break;

		case 5:
			board[2][2] = symbol;
			break;

		case 6:
			board[2][4] = symbol;
			break;

		case 7:
			board[4][0] = symbol;
			break;

		case 8:
			board[4][2] = symbol;
			break;

		case 9:
			board[4][4] = symbol;
			break;

		default:
			break;

		}

	}

	void printBoard() {

		for (char[] row : board) {
			for (char c : row) {
				System.out.print(c);
			}

			System.out.println();
		}

	}
}

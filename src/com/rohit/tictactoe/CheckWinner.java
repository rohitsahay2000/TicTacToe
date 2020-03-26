package com.rohit.tictactoe;

import java.util.List;

import com.rohit.tictactoe.utils.GameStatus;
import com.rohit.tictactoe.utils.TicTacToeUtils;

public class CheckWinner {

	public GameStatus checkWinner() {

		for (List<Integer> l : TicTacToeUtils.winningList) {
			if (TicTacToeUtils.playerPosition.containsAll(l)) {
				return GameStatus.PLAYER_WON;
			} else if (TicTacToeUtils.computerPosition.containsAll(l)) {
				return GameStatus.COMPUTER_WON;
			} else if ((TicTacToeUtils.playerPosition.size() + TicTacToeUtils.computerPosition.size()) >= 9) {
				return GameStatus.MATCH_DRAWN;
			}

		}

		return GameStatus.MATCH_INCOMPLETE;

	}

}

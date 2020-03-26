package com.rohit.tictactoe.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicTacToeUtils {

	public static final List<List<Integer>> winningList = new ArrayList<List<Integer>>();
	public static final List<Integer> l1 = Arrays.asList(1, 2, 3);
	public static final List<Integer> l2 = Arrays.asList(4, 5, 6);
	public static final List<Integer> l3 = Arrays.asList(7, 8, 9);

	public static final List<Integer> l4 = Arrays.asList(1, 4, 7);
	public static final List<Integer> l5 = Arrays.asList(2, 5, 8);
	public static final List<Integer> l6 = Arrays.asList(3, 6, 9);

	public static final List<Integer> l7 = Arrays.asList(1, 5, 9);
	public static final List<Integer> l8 = Arrays.asList(3, 5, 7);
	
	public static final List<Integer> playerPosition = new ArrayList<>();
	public static final List<Integer> computerPosition = new ArrayList<>();

	static {
		winningList.add(TicTacToeUtils.l1);
		winningList.add(TicTacToeUtils.l2);
		winningList.add(TicTacToeUtils.l3);
		winningList.add(TicTacToeUtils.l4);
		winningList.add(TicTacToeUtils.l5);
		winningList.add(TicTacToeUtils.l6);
		winningList.add(TicTacToeUtils.l7);
		winningList.add(TicTacToeUtils.l8);

	}

}

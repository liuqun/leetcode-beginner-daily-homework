package com.leetcode.problem_36;

import java.util.HashSet;
import java.util.Set;

/// 题目36.有效的数独
/// 原题链接: https://leetcode-cn.com/problems/valid-sudoku/
class Solution {
	private char[] serializeSubBlockFromSudokuBoard(char[][] board, int x0, int y0) {
		// 各个9*9方块的起始坐标(x0,y0)的有效取值为:
		// (0,0), (0,3), (0,6)
		// (3,0), (3,3), (3,6)
		// (6,0), (6,3), (6,6)
		assert x0 >= 0 && x0 <= 6;
		assert y0 >= 0 && y0 <= 6;
		char[] serialized;
		int i;
		int dx;
		int dy;
		int y;
		i = 0;
		serialized = new char[9];
		for (dy = 0; dy < 3; dy++) {
			y = y0 + dy;
			for (dx = 0; dx < 3; dx++) {
				serialized[i++] = board[y][x0 + dx];
			}
		}
		return (serialized);
	}

	private boolean isValidLine(char[] line) {
		Set<Integer> s;

		s = new HashSet<Integer>(9);
		for (int ch : line) {
			if ('.' == ch) {
				continue;
			}
			if (s.contains(ch)) {
				return (false);
			}
			s.add(ch);
		}
		return (true);
	}

	public boolean isValidSudoku(char[][] board) {
		// 依次检查 9 条水平线
		for (int i = 0; i < 9; i++) {
			if (!isValidLine(board[i])) {
				return (false);
			}
		}
		// 依次检查 9 条垂直线
		char[] buf = new char[9];
		for (int j = 0; j < 9; j++) {
			for (int i = 0; i < 9; i++) {
				buf[i] = board[i][j];
			}
			if (!isValidLine(buf)) {
				return (false);
			}
		}
		// 依次检查 9 个 9*9 方块, 各个方块的起始坐标依次为:
		// (0,0), (0,3), (0,6)
		// (3,0), (3,3), (3,6)
		// (6,0), (6,3), (6,6)
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				char[] blk = serializeSubBlockFromSudokuBoard(board, x * 3, y * 3);
				if (!isValidLine(blk)) {
					return (false);
				}
			}
		}
		return (true);
	}
}

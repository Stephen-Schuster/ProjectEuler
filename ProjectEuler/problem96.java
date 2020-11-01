package ProjectEuler;

import classwork.TextFileReader;

public class problem96 {
	public static int numSudokus = 50;
	public static int[][] solvedSudoku;
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		TextFileReader reader = new TextFileReader("data\\p096_sudoku.txt");
		int sum = 0;
		for(int i = 0; i<numSudokus; i++) {
			reader.nextLine();
			System.out.println("Sudoku number: "+(i+1));
			String[] strngs = new String[9];
			for(int j = 0; j<9; j++) {
				strngs[j] = reader.nextLine();
			}
			int[][] sudokuBoard = stringsToInts(strngs);
			if(forLoops96(sudokuBoard, 0,0,1)) {
				for(int y = 0; y<9; y++) {
					for(int x = 0 ;x<9; x++) {
						System.out.print(solvedSudoku[x][y]);
					}
					System.out.println();
				}
				sum+=100*solvedSudoku[0][0]+10*solvedSudoku[1][0]+solvedSudoku[2][0];
			} else System.out.println("unsolveable");
		}
		System.out.println("Answer to problem 96: "+sum);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
	public static boolean forLoops96(int[][] board, int x , int y, int recursionNum) {
		while(board[x][y]>0) {
			x++; if(x>=9) {x = 0; y++;} if(y>=9) {solvedSudoku = board.clone(); return true;}
		}
		for(int i = 1; i<10; i++) {
			boolean good = true;
			for(int psx = 0; psx<9; psx++) {
				if(board[psx][y] == i && psx != x) {good = false; break;}
			}
			if(good)for(int psy = 0; psy<9; psy++) {
				if(board[x][psy] == i && psy != y) {good = false;break;}
			}
			if(good)for(int psx = x/3*3; psx<x/3*3+3; psx++) {
				for(int psy = y/3*3; psy<y/3*3+3; psy++) {
					if(board[psx][psy] == i && (psy != y || psx != x)) {good = false;break;}
				}
			}
			if(good) {
				int[][] newBoard = clone(board);
				newBoard[x][y] = i;
				if(forLoops96(newBoard, x, y, recursionNum+1)) return true;
			}
		}
		return false;
	}
	public static int[][] clone(int[][] board) {
		int[][] newBoard = new int[board.length][board[0].length];
		for(int i = 0; i<board.length; i++) {
			for(int j = 0; j<board[i].length; j++) {
				newBoard[i][j] = board[i][j];
			}
		}
		return newBoard;
	}
	public static int[][] stringsToInts(String[] strngs) {
		int[][] board = new int[9][9];
		for(int x = 0; x<9; x++) {
			for(int y = 0; y<9; y++) {
				board[x][y] = Character.getNumericValue(strngs[y].charAt(x));
			}
		}
		return board;
	}
}

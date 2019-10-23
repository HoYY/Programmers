package programmers;

import java.util.ArrayList;
import java.util.List;

public class ches {
	class Bishop{
		int x;
		int y;
		
		public Bishop(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public int solution(String[] bishops) {
        boolean[][] matrix = new boolean[8][8];
        boolean[][] bishopPosition = new boolean[8][8];
        List<Bishop> bishopList = new ArrayList();
        
        for(String bishop : bishops) {
        	convert(bishopPosition, bishop, bishopList);
        }
        
        for(Bishop bishop : bishopList) {
        	chesCount(matrix, bishop);
        }
        
        return countMatrix(matrix, bishopPosition);
    }
	
	
	public void convert(boolean[][] bishopPosition, String bishop, List<Bishop> bishopList) {
		String[] s = bishop.split("");
		int x=-1;
		int y = Integer.parseInt(s[1]) - 1;
		switch(s[0]) {
			case "A":
				x = 0;
				break;
			case "B":
				x = 1;
				break;
			case "C":
				x = 2;
				break;
			case "D":
				x = 3;
				break;
			case "E":
				x = 4;
				break;
			case "F":
				x = 5;
				break;
			case "G":
				x = 6;
				break;
			case "H":
				x = 7;
				break;
		}
		
		bishopPosition[x][y] = true;
		bishopList.add(new Bishop(x, y));
	}
	
	public void chesCount(boolean[][] matrix, Bishop bishop) {
		buttomLeft(matrix, bishop.x, bishop.y);
		topLeft(matrix, bishop.x, bishop.y);
		buttomRight(matrix, bishop.x, bishop.y);
		topRight(matrix, bishop.x, bishop.y);
	}
	
	public boolean buttomLeft(boolean[][] matrix, int x, int y) {
		int xOffset = x-1;
		int yOffset = y-1;
		if(xOffset <= -1 || yOffset <= -1) {
			return true;
		}
		matrix[xOffset][yOffset] = true;
		buttomLeft(matrix, xOffset, yOffset);
		return true;
	}
	
	public boolean buttomRight(boolean[][] matrix, int x, int y) {
		int xOffset = x+1;
		int yOffset = y-1;
		if(xOffset >= 8 || yOffset <= -1) {
			return true;
		}
		matrix[xOffset][yOffset] = true;
		buttomRight(matrix, xOffset, yOffset);
		return true;
	}
	
	public boolean topLeft(boolean[][] matrix, int x, int y) {
		int xOffset = x-1;
		int yOffset = y+1;
		if(xOffset <= -1 || yOffset >= 8) {
			return true;
		}
		matrix[xOffset][yOffset] = true;
		topLeft(matrix, xOffset, yOffset);
		return true;
	}
	
	public boolean topRight(boolean[][] matrix, int x, int y) {
		int xOffset = x+1;
		int yOffset = y+1;
		if(xOffset >= 8 || yOffset >= 8) {
			return true;
		}
		matrix[xOffset][yOffset] = true;
		topRight(matrix, xOffset, yOffset);
		return true;
	}
	
	public int countMatrix(boolean[][] matrix, boolean[][] bishopPosition) {
		int answer = 0;
		for(int x=0; x<8; x++) {
			for(int y=0; y<8; y++) {
				if(!bishopPosition[x][y]) {
					if(!matrix[x][y]) {
						answer++;
					}
				}
			}
		}
		
		return answer;
	}
}


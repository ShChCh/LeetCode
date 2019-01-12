package patternDesign;

import java.util.*;

public class Solution {
	public static int isToeplitzMatrix(int[][] matrix) {
		// first line
		for(int i=0; i<matrix[0].length; i++)
			for(int j=1; j<matrix.length && i+j<matrix[0].length; j++)
				if(matrix[j][i+j]!=matrix[0][i])
					return 1;
		
		// first column
		for(int i=0; i<matrix.length-1; i++)
			for(int j=1; j<matrix.length-i-1; j++)
				if(matrix[i+1][0]!=matrix[i+1+j][j])
					return 2;
		return 3;
	}
	public static void main(String[] args){
		int[][] a = {{36,59,71,15,26,82,87},{56,36,59,71,15,26,82},{15,0,36,59,71,15,26}};
		System.out.println(isToeplitzMatrix(a));
	}
}

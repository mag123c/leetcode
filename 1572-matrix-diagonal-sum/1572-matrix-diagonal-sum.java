class Solution {		
	
    public int diagonalSum(int[][] mat) {
        int answer = 0;        
        for(int i=0; i<mat.length; i++) {
        	answer += mat[i][i];
        	answer += mat[i][(mat[0].length-1)-i];
        	if((mat[0].length-1)-i == i) answer -= mat[i][(mat[0].length-1)-i];
        }
        return answer;
    }
}
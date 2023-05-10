class Solution {		
	
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int cnt = 1;
        while(cnt <= n*n) {
        	for(int i=left; i<=right; i++) {
        		matrix[top][i] = cnt;
        		cnt++;
        	}
        	top++;
        	  
        	for(int i=top; i<=bottom; i++) {
        		matrix[i][right] = cnt;
        		cnt++;
        	}
        	right--;
        	
        	for(int i=right; i>=left; i--) {
        		matrix[bottom][i] = cnt;
        		cnt++;
        	}
        	bottom--;
        	
        	for(int i=bottom; i>=top; i--) {
        		matrix[i][left] = cnt;
        		cnt++;
        	}
        	left++;
        	
        }
        return matrix;
    }
}
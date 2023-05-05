class Solution{
	 
    public int minPathSum(int[][] grid) {
	        
	    for(int i=0; i<grid.length; i++) {
	    	for(int j=0; j<grid[i].length; j++) {	    		
	    		dp(grid, i, j);
	    	}
	    }
	    
	    return grid[grid.length-1][grid[0].length-1];
    	
	}
    
    public void dp(int[][] grid, int i, int j) {
    	if(i==0 && j==0) return;
    	else if(i==0) grid[i][j] += grid[i][j-1];
    	else if(j==0) grid[i][j] += grid[i-1][j];
    	else grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
    	
    }
}
import java.util.ArrayList;
import java.util.List;

class Solution {		
	
    public List<Integer> spiralOrder(int[][] matrix) {    	
    	List<Integer> list = new ArrayList<>();    	
    	int sum = matrix.length * matrix[0].length;   	
    	int cnt = 0;
    	int idx = 0; 
    	while(cnt<sum) {
    		for(int i=idx; i<matrix[0].length; i++) {
    			if(matrix[idx][i] != 101) {
    				list.add(matrix[idx][i]);
    				cnt++;
        			matrix[idx][i] = 101;
    			}
    		}
    		for(int i=idx; i<matrix.length; i++) {
    			if(matrix[i][(matrix[0].length-1)-idx] != 101) {
    				list.add(matrix[i][(matrix[0].length-1)-idx]);
    				cnt++;
    				matrix[i][(matrix[0].length-1)-idx] = 101;
    			}    			
    		}
    		for(int i=matrix[0].length-1; i>=idx; i--) {
    			if(matrix[(matrix.length-1)-idx][i] != 101) {    				
    				list.add(matrix[(matrix.length-1)-idx][i]);
    				cnt++;
    				matrix[(matrix.length-1)-idx][i] = 101;
    			}    			
    		}
    		for(int i=matrix.length-1; i>=idx; i--) {
    			if(matrix[i][idx] != 101) {
    				list.add(matrix[i][idx]);
    				cnt++;
    				matrix[i][idx] = 101;
    			}    			
    		}
    		idx++;
    	}
    	return list;
    }
}
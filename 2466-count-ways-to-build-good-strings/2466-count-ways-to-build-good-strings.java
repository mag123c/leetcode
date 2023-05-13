class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
    	int answer = 0;    	    	
    	int[] dp = new int[high+1];
    	dp[0] = 1;

    	for(int i=1; i<=high; ++i) {
    		if(i>=zero) dp[i] += dp[i-zero];
    		if(i>=one) dp[i] += dp[i-one];
    		
    		dp[i] %= 1_000_000_007;
    	}
    	
    	for(int i=low; i<=high; i++) {
    		answer += dp[i];
    		answer %= 1_000_000_007;
    	}
    	
        return answer;
    }
}
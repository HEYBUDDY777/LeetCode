// Last updated: 8/14/2026, 10:50:05 AM
class Solution {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount+1];
        
        dp[0] = 1;
        for(int coin:coins)
        {
            for(int i=coin;i<=amount;i++)
            {
                dp[i] = dp[i]+dp[i-coin];
            }
            
        }
        return dp[amount];
    }
}
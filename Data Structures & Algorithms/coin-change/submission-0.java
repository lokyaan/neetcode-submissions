class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount<=0) return 0;
        int dp[]= new int[amount+1];

        Arrays.fill(dp,amount+1);
        dp[0]=0;

        for(int current=1;current<amount+1;current++){
            for(int coin:coins){
                if(coin<=current){
                    dp[current]=Math.min(dp[current], 1+dp[current-coin]);
                }
            }
    }
    return dp[amount] == amount+1 ? -1 : dp[amount];
    }
}

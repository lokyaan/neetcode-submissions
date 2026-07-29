class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];

        int excludeLast= rob(nums,0,n-2);
        int excludeFirst= rob(nums,1,n-1);
        return Math.max(excludeLast,excludeFirst);
        
    }
    public static int rob(int nums[], int start, int end){
        int prev1=0;
        int prev2=0;

        for(int i=start;i<=end;i++){
            int robCurrent= nums[i]+ prev2;
            int skipCurrent= prev1;

            int current=Math.max(robCurrent,skipCurrent);
            prev2=prev1;
            prev1=current;
        }
        return prev1;
    }
}

class Solution {
    public int splitArray(int[] nums, int k) {
        
        int left=0;
        int right=0;
        for(int num:nums){
            left=Math.max(left,num);
            right+=num;
        }
        int ans=right;

        while(left<=right){
            int split=left + (right-left)/2;

            if(canSplit(nums,k,split)){
                ans=split;
                right=split-1;
            }else{
                left=split+1;
            }
        }
    
    return ans;
    }

    public static boolean canSplit(int nums[], int k, int split){
        int currSplit=0;
        int n=1;
        for(int num:nums){
            if(currSplit+num > split){
                currSplit=0;
                n++;
            }
            currSplit+=num;

            if(n>k) return false;
        }
        return true;
    }
}
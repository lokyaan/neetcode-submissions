class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set= new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int maxLen=0;


        for(int num:nums){
            if(!set.contains(num-1)){
                int length=1;
                int curr=num;
                while(set.contains(num+1)){
                    length++;
                    num++;
                }
                maxLen=Math.max(maxLen,length);
            }
        }
        return maxLen;
    }
}

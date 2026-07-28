class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result= new ArrayList<>();
        targetSum2(candidates,target,new ArrayList<>(), result,0);
        return result;
        
    }
    public static void targetSum2(int nums[], int target, List<Integer> curr, List<List<Integer>> result, int start){
        if(target==0){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]) continue;
            if(nums[i]<=target){
                curr.add(nums[i]);
                targetSum2(nums, target-nums[i], curr,result,i+1);
                curr.remove(curr.size()-1);
            }
        }
    }
}

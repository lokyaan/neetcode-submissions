class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result= new ArrayList<>();
        Arrays.sort(nums);
        targetSum(nums,target, new ArrayList<>(), result,0);
        return result;
    }

    public static void targetSum(int nums[], int target, List<Integer> curr, List<List<Integer>> result, int start){
        if(target==0){
            result.add(new ArrayList<>(curr));
            //return;
        }

        for(int i=start;i<nums.length;i++){
            if(nums[i]<=target){
                curr.add(nums[i]);
                targetSum(nums,target-nums[i],curr,result, i);
                curr.remove(curr.size()-1);
            }
        }
    }
}

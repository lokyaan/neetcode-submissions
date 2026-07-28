class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> result= new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, new ArrayList<>(), result, 0);
        return result;
        
    }
    public static void backtrack(int nums[], List<Integer> curr, List<List<Integer>> result, int start){
        result.add(new ArrayList<>(curr));

        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]) continue;
            curr.add(nums[i]);
            backtrack(nums,curr,result, i+1);
            curr.remove(curr.size()-1);
        }
    }
}

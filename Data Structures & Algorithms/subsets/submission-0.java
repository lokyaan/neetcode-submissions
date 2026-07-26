class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        backtrack(nums,new ArrayList<>(),result,0);
        return result;

        
    }
    public static void backtrack(int[] nums,List<Integer> curr, List<List<Integer>> result,int index){
        
        result.add(new ArrayList<>(curr));
       
        

        for(int i=index;i<nums.length;i++){
            curr.add(nums[i]);
            backtrack(nums, curr, result, i+1);
            curr.remove(curr.size()-1);
        }
    }

}

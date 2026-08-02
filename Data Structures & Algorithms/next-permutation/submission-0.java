class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int pivot=n-2;

        while(pivot>=0 && nums[pivot]>=nums[pivot+1] ){
            pivot--;
        }
        if(pivot>=0){
            int successor=n-1;
            while(nums[successor]<=nums[pivot]){
                successor--;
            }
            swap(nums, pivot, successor);
        }
        reverse(nums, pivot + 1, n - 1);

        
    }
    public void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp=nums[start];
            nums[start]= nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    private void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
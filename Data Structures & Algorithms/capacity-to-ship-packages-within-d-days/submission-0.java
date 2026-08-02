class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=0;
        for(int weight:weights){
            left=Math.max(left,weight);
            right+=weight;
        }
        int answer=right;

        while(left<=right){
            int capacity = left + (right-left)/2;

            if(canShip(weights,days,capacity)){
                answer=capacity;
                right=capacity-1;
            }else{
                left=capacity+1;
            }
        }
        return answer;
    }
    public static boolean canShip(int weights[], int days, int capacity){
        int currWeight=0;
        int currDays=1;

        for(int weight:weights){
            if(currWeight +weight>capacity){
                currWeight=0;
                currDays++;
            }
            currWeight+=weight;
            if(currDays>days) return false;
        }
        return true;
    }
}
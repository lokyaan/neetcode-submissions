class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer,Integer> freq= new HashMap<>();
    List<List<Integer>> buckets= new ArrayList<>();

    for(int n:nums){
        freq.put(n,freq.getOrDefault(n,0)+1);
    }
    for(int i=0;i<=nums.length;i++){
        buckets.add(new ArrayList<>());
    }
    for(Map.Entry<Integer,Integer> entry: freq.entrySet()){
        int number=entry.getKey();
        int frequency= entry.getValue();

        buckets.get(frequency).add(number);
    }

    int result[]= new int[k];
    int index=0;

    for(int i=buckets.size()-1;i>=0 && index<k ;i--){
        for(int num: buckets.get(i) ){
            result[index++]=num;

            if(index==k) return result;
        }
    }

    return result;
        
    }
}

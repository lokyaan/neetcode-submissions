class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result= new ArrayList<>();
        generate(s,new ArrayList<>(), result, 0);
        return result;
        
    }
    public static void generate(String s, List<String> curr, List<List<String>> result, int start){
        if(start==s.length()){
            result.add(new ArrayList<>(curr));
            return;
        }

        for(int end=start;end<s.length();end++){
            String sub=s.substring(start,end+1);
            if(isPalindrome(sub)){
                curr.add(sub);
                generate(s,curr,result, end+1);
                curr.remove(curr.size()-1);
            }
        }

    }
    public static boolean isPalindrome(String s){
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}

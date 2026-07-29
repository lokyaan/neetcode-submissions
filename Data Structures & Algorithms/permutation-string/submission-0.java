class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1freq[]= new int[26];
        int window[]= new int[26];

        if(s1.length()>s2.length()) return false;

        for(int i=0;i<s1.length();i++){
            s1freq[s1.charAt(i)-'a']++;
            window[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(s1freq,window)) return true;
        int left=0;
        for(int right=s1.length();right<s2.length();right++){
            window[s2.charAt(right)-'a']++;
            left = right-s1.length();
            window[s2.charAt(left)-'a']--;

            if(Arrays.equals(s1freq,window)) return true;

        }
        return false;
        
    }
}

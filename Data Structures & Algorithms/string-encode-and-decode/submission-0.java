class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb= new StringBuilder();
        for(String s: strs){
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        int index=0;

        List<String> result= new ArrayList<>();

        while(index<str.length()){
            int separator=index;

            while(str.charAt(separator)!='#'){
                separator++;
            }
            int length= Integer.parseInt(str.substring(index,separator));
            int start= separator+1;
            int end=start+length;

            result.add(str.substring(start,end));
            index=end;
        }
        return result;

    }
}

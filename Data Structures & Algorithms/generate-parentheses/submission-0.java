class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result= new ArrayList<>();
        generate(n,new StringBuilder(), result,0,0);
        return result;
        
    }
    public static void generate(int n, StringBuilder sb, List<String> result, int open, int close){
        if(sb.length()== 2*n){
            result.add(sb.toString());
            return;
        }
        if(open<n){
            sb.append("(");
            generate(n,sb,result,open+1,close);
            sb.setLength(sb.length()-1);
        }
        if(close<open){
            sb.append(")");
            generate(n,sb,result,open,close+1);
            sb.setLength(sb.length()-1);
        }
    }
}

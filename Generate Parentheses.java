class Solution {
    public List<String> generateParenthesis(int n) {
      List<String> output_arr=new ArrayList();
      backtrack(output_arr,"",0,0,n); 
      return output_arr;
    }
    public void backtrack(List<String> output_array, String curr_str, int open, int close, int max){
      if(curr_str.length()==max * 2){
        output_arr.add(curr_str);
        return;
      }
      if(open < max) backtrack(output_arr,curr_str+"(",open+1,close,max);
      if(close < open) backtrack(output_arr,curr_str+")",open,close+1,max);
      
      
    }
}

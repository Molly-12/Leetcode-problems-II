class Solution {
    public List<String> letterCombinations(String digits) {
      List<String> res=new ArrayList();
      if(digits.length()==0 || digits==0) return res;
      res.add("");
      
      String[] mapping={"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
      for(int i=0;i<digits.length();i++){
        List<String> new_res=new ArrayList();
        char[] map_arr=mapping[digits.charAt(i)-'0'].toCharArray();
        
        for(String str:res){
          for(char c:map_arr){
            new_res.add(new String(str+c));
          }
        }
        res=new_res;
      }
      return res;
    }
}

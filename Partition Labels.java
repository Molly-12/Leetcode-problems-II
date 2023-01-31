class Solution {
    public List<Integer> partitionLabels(String s) {
      if(s==null || s.length()==0){
        return null;
      }
      List<Integer> list=new ArrayList();
      int[] last_index=new int[26];
      for(int i=0;i<s.length();i++){
        last_index[s.charAt(i)-'a'];
      }
      int start=0;
      int end=0;
      for(int i=0;i<s.length();i++){
        end=Math.max(end,last_index[s.charAt(i)-'a']);
        if(i==end){
          list.add(end-start+1);
          start=end+1;
        }
      }
      return list;
    }
}

   

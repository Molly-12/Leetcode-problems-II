class Solution {
    public List<String> commonChars(String[] words) {
      List<String> common_chars=new ArrayList();
      int[] min_freq=new int[26];
      Arrays.fill(min_freq,Integer.MAX_VALUE);
      for(String s:words){
        int[] char_freq=new int[26];
        for(char c:s.toCharArray()){
          char_freq[c-'a']++;
        }
        for(int i=0;i<26;i++){
          min_freq[i]=Math.min(min_freq[i],char_freq[i]);
        }
      }
      for(int i=0;i<26;i++){
        while(min_freq[i]>0){
          common_chars.add(""+(char)(i+'a'));
          min_freq[i]--;
        }
      }
      return common_chars;
    }
}
                    
                    
    

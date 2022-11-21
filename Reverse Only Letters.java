class Solution {
    public String reverseOnlyLetters(String s) {
      int i=0;
      int j=s.length-1;
      char[] chars=s.toCharArray();
      
      while(i<j){
        while(i<j && !Character.isLetter(chars[i])) i++;
        while(i<j && !Character.isLetter(chars[j])) j--;
        
        char temp=chars[i];
        chars[i]=chars[j];
        chars[j]=temp;
      }
      return new String(chars);
    }
}

class Solution {
    public int secondHighest(String s) {
      Set<Integer> set=new HashSet();
      for(char c:s.toCharArray()){
        if(Character.isDigit(c)){
          set.add(c-'0');
        }
      }
      int[] arr=new int[set.size()];
      int k=0;
      for(int i:set){
        arr[k]=i;
        k++;
      }
      Arrays.sort(arr);
      if(arr.length<2){
        return -1;
      }
      return arr[arr.length-2];
    }
}

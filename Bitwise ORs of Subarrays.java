class Solution {
    public int subarrayBitwiseORs(int[] arr) {
      Set<Integer> unique=new HashSet();
      Set<Integer> prev=new HashSet();
      for(int i=0;i<arr.length;i++){
        Set<Integer> curr=new HashSet();
        curr.add(arr[i]);
        unique.add(arr[i]);
        for(Integer p:prev){
          curr.add(p|arr[i]);
          unique.add(p|arr[i]);
        }
        prev=curr;
      }
      return unique.size();
    }
}
        
   

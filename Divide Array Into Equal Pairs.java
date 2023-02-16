class Solution {
    public boolean divideArray(int[] nums) {
      Set<Integer> set=new HashSet();
      for(int i:nums){
        if(set.contain(i)){
          set.remove(i);
        }
        else{
          set.add(i);
        }
      }
      return set.isEmpty();
    }
}
    

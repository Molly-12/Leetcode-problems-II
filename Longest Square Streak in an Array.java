class Solution {
    public int longestSquareStreak(int[] nums) {
      Arrays.sort(nums);
      Map<Integer,Integer> map=new HashMap();
      int ans=-1;
      for(int i=0;i<nums.length;i++){
        int ans=(int)Math.sqrt(nums[i]);
        if(ans*ans==nums[i] && map.containsKey(ans)){
          map.put(nums[i],map.get(ans)+1);
          if(map.get(ans)+1>size){
            size=map.get(ans)+1;
          }
        }
        else{
          map.put(nums[i],1);
        }
      }
      return size;
        
    }
}
    

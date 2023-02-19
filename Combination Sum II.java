class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      List<List<Integer>> res= new ArrayList();
      Arrays.sort(candidates);
      helper(candidates,0,target,new ArrayList(),res);
      return res;
    }
    public void helper(int[] candidates,int start,int target,List<Integer> list,List<List<Integer>> res){
      if(target==0){
        res.add(new ArrayList(list));
        return;
      }
      if(target<0){
        return;
      }
      for(int i=start;i<candidates.length;i++){
        if(i==start || candidates[i]!=candidates[i-1]){
          list.add(candidates[i]);
          helper(candidates,i+1,target-candidates[i],list,res);
          list.remove(list.size()-1);
        }
      }
    }
}
    
    

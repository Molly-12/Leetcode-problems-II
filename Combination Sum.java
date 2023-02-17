class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      List<List<Integer>> res= new ArrayList();
      backtrack(candidates,0,target,list,res);
      return res;
    }
    public void backtrack(int[] candidates,int start,int target,List<Integer>list, List<List<Integer>> res){
      if(target<0) return;
      if(target==0){
        return (new ArrayList(list));
      }
      for(int i=start;i<candidates.length;i++){
        list.add(candidates[i]);
        backtrack(candidates,i,target-candidates[i],list,res);
        list.remove(list.size()-1);
    }
}

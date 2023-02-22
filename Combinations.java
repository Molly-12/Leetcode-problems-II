class Solution {
    public List<List<Integer>> combine(int n, int k) {
      List<List<Integer>> res= new LinkedList();
      if(k==0){
        res.add(new Linkedlist());
        return res;
      }
      backtrack(1, new LinkedList(), n,k, res);
      return res;
    }
    public void backtrack(int start, LinkedList<Integer> list, int n, int k, List<List<Integer>> res){
      if(list.size()==k){
        res.add(new Linkedlist(list));
      }
      for(int i=start; i<=n && list.size()< k; i++){
        list.add(i);
        backtrack(i+1,list, n,k, res);
        list.removeLast();
      }
    }
}

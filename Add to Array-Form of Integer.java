class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
      List<Integer> list=new ArrayList();
      for(int i=num.length-1;i>=0 || k>0;i--){
        if(i>=0){
          list.add((num[i]+k)%10);
          k=(num[i]+k)/10;
        }
        else{
          list.add(k%10);
          k=k/10;
        }
      }
      Collections.reverse(num);
      return list;
    }
}
    

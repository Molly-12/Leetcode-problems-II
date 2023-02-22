class Solution {
    public int largestInteger(int num) {
      PriorityQueue<Integer> even= new PriorityQueue<>((a,b)->(b,a));
      PriorityQueue<Integer> odd= new PriorityQueue<>((a,b)->(b,a));
      String str= nums+"";
      for(char c:str.toCharArray()){
        int el= c-'0';
        if(el%2==0){
          even.offer(el);
        }
        else{
          odd.offer(el);
        }
      }
      String ans="";
      for(char c:str.toCharArray()){
        int el= c-'0';
        if(el%2==0){
          ans+=(even.poll()+"");
        }
        else{
          ans+=(odd.poll()+"");
        }
      }
      return Integer.parseInt(ans);
      
    }
}
      
    

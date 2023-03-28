class Solution{
    public int numFriendRequests(int[] ages) {
      int[] freq= new int[121];
      int count=0;
      for(int i:ages){
        freq[i]++;
      }
      for(int i=0;i<=120;i++){
        for(int j=(int)(0.5*i)+7+1;j<=i;j++){
          count+=freq[i]+freq[j];
        }
        if(a==b){
          count-=freq[i];
      }
      return count;
    }
}

   

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
      int m=grid.length;
      int n=grid[0].length;
      int total=m*n;
      k=k%total;
      List<List<Integer>res=new ArrayList();
      
      for(int i=0;i<m;i++){
        List<Integer> sublist=new ArrayList();
        for(int j=0;j<n;j++){
          int index=getIndex(i,j,n,k,total);
          sublist.add(grid[index/n][index%n]);
        }
        res.add(sublist);
      }
      return res;
    }
    public int getIndex(int i,int j,int col,int k,int total){
      int idx=(i*col+j+total-k)%total;
      return idx;
    }
}
      
    

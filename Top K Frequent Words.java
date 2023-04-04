class Solution {
    public List<String> topKFrequent(String[] words, int k) {
      Map<String,Integer> map= new HashMap();
      for(String i:words){
        map.put(i,map.getOrDefault(i,0)+1);
      }
      Queue<String> q=new PriorityQueue<>((w1,w2)->map.get(w1).equals(map.get(w2))?w2.compareTo(w1):map.get(w1)-map.get(w2));
      for(String i:map.keySet()){
        q.add(i);
        if(q.size()>k) q.poll();
      }
      List<String> res= new ArrayList();
      while(!q.isEmpty()){
        res.add(q.poll());
      }
      Collections.reverse(res);
      return res;
    }
}
        
    

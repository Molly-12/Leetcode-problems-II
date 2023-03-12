class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
      List<String> rep= new ArrayList();
      Map<String, Integer> map= new HashMap();
      int i=0;
      while(i+10<=s.length()){
        String sub= s.substring(i,i++ +10);
        map.put(sub,map.getOrDefault(sub,0)+1);
        if(map.get(sub)==2){
          rep.add(sub);
        }
      }
      return rep;
    }
}
     
    

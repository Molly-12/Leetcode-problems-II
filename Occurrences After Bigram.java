class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] str= text.split(" ");
        List<String> l= new ArrayList();
        for(int i=0;i<str.length-2;i++){
            if(str[i].equals(first) && str[i+1].equals(second)){
                l.add(str[i+2]);
            }
        }
        String[] res= new String[l.size()];
        int k=0;
        for(String s:l){
            res[k]=s;
            k++;
        }
        return res;
    }
}

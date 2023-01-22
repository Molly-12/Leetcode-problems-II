/*There are numerous possible combinations of HTML colour codes, and each one is 
given a specific identification number. Each codes[i] in the list,  
is an HTML colour code that was chosen by the web designer. The list may 
contain duplicate codes.

The web designer's customer made the decision to eliminate P number of 
consecutive codes from the list. However, the web designer wants to preserve as 
many distinctive colour codes as he can. Find out how many unique colour codes 
the web designer can preserve, and print the count of unique color codes.


Input Format:
-------------
Line-1: Comma separated integers, codes[], HTML color codes
Line-2: An integer P.

Output Format:
--------------
Print an integer result.
*/

import java.util.*;
class Test{
  Scanner sc=new Scanner(System.in);
  String s[]=sc.next().split(",");
  int p=sc.nextInt();
  int[] a=new int[s.length];
  for(int i=0;i<s.length;i++){
    a[i]=Integer.parseInt(s[i]);
  }
  int y=0;
  int r=Integer.MIN_VALUE;
  while(y+p<s.length){
    List<Integer> l=new ArrayList();
    for(int i:a){
      l.add(i);
    }
    l.subList(y,y+p).clear();
    Set<Integer> s=new HashSet();
    for(int i:l){
      set.add(i);
    }
    if(r<s.size()){
      r=s.size();
    }
    y++;
  }
  System.out.println(r);
}
}
    
                         

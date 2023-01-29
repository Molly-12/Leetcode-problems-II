/*In this challenge you will create the username portion of a registation system.
     All usernames must be unique. If a new user requests a name that is already used,
     an integer should be added to the end of the username to make it unique. 
     The numbering begins with 1 and is incremented by 1 for each new instance per username.
     
     As an example, if username requests were for [bob,bob,alice,alice,alice], 
     your system should assign usernames[bob,bob1,alice,alice1,alice2].
     
    input format:
    no of usernames
    list of usernames one in each row
    
    output format:
    list of updated usernames one in each row
    
    input =
    4
    alex
    xylos
    alex
    alan
    output =
    alex
    xylos
    alex1
    alan
    */

import java.util.*;
class RegistrationSystem{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String[] a=new String[n];
    for(int i=0;i<n;i++){
      a[i]=sc.next();
    }
    int k=1;
    for(int i=0;i<n-1;i++){
      k=1;
      for(int j=i+1;j<n;j++){
        if(a[j].equals(a[i])){
          a[j]=a[i]+k;
          k++;
        }
      }
    }
    for(k=0;k<n;k++){
      System.out.println(a[k]);
  }
}

                           

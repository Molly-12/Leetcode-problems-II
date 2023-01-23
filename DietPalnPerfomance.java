/*
A dieter consumes calories[i] calories on the i-th day. 
Given an integer k, for every consecutive sequence of k days (calories[i], calories[i+1], ..., calories[i+k-1] for all 0 <= i <= n-k), they look at T, the total calories consumed during that sequence of k days (calories[i] + calories[i+1] + ... + calories[i+k-1]):
•	If T < lower, they performed poorly on their diet and lose 1 point; 
•	If T > upper, they performed well on their diet and gain 1 point;
•	Otherwise, they performed normally and there is no change in points.
Initially, the dieter has zero points. Return the total number of points the dieter has after dieting for calories.length days.
Note that the total points can be negative.
 
Example 1:
Input: claorie size calorie[5],calories = [1,2,3,4,5], k = 1, lower = 3, upper = 3
Output: 0
Explanation: Since k = 1, we consider each element of the array separately and compare it to lower and upper.
calories[0] and calories[1] are less than lower so 2 points are lost.
calories[3] and calories[4] are greater than upper so 2 points are gained.
*/

import java.util.*;
public class sol{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
        int[] calories=new int[n];
        for(int i=0;i<calories.length;i++)
            calories[i]=sc.nextInt();
        int k=sc.nextInt();
        int lower=sc.nextInt();
        int upper=sc.nextInt();
        System.out.println(helper(calories,k,lower,upper));
    }
  public static int helper(int[] calories,int k,int lower,int upper){
    int sum=0;
    int points=0;
    for(int i=0;i<k;i++){
      sum+=calories[i];
    }
    if(sum<lower) points--;
    if(sum>upper) points++;
    
    for(int i=k;i<calories.length;i++){
      sum+=calories[i];
      sum-=calories[i-k];
      if(sum<lower)
          points--;
      if(sum>upper)
        points++;
    }
    return points;
  }
}


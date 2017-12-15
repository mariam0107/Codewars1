//Implement the method isSortedAndHow, which accepts an array of integers, and returns one of the following:
//
//'yes, ascending' - if the numbers in the array are sorted in an ascending way
//'yes, descending' - if the numbers in the array are sorted in a descending way
//'no'
//You can assume the array will always be valid, and there will always be one correct answer.
package codewarstogithub;

public class Solution {
     public static String isSortedAndHow(int[] array) {
  Boolean a=false,d=false;
      
      for(int i=0;i<array.length-1;i++)
      {
       if(array[i]<array[i+1]) 
       {
          a=true; 
       }
      }
      for(int i=0;i<array.length-1;i++)
      {
       if(array[i]>array[i+1]) 
       {
          d=true; 
       }
      }
      if(a==true&&d==false)
      return "yes, ascending";
      else if(a==false&&d==true)
      return "yes, descending";
      else
          return "no";
          
     
  }
  

}

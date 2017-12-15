//Write function avg which calculates average of numbers in given list.
package codewarstogithub;

public class FindAverage {
    
  public static double find_average(int[] array){
  int sum=0;
    for(int i=0;i<array.length;i++)
    {
    sum+=array[i];
  }
  double average=(double)sum/array.length;
  
  return average;
}
}


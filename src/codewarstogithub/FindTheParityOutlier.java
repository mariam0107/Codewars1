
package codewarstogithub;
//You are given an array (which will have a length of at least 3, but could be very large) containing integers. The array is 
//either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N.
//Write a method that takes the array as an argument and returns this "outlier" N.

  public class FindTheParityOutlier{
  static int find(int[] integers){
  int odd=0;
  int even=0;
  int pos=0;
  for(int i=0;i<integers.length;i++)
  {
  if(integers[i]%2==0)
  even++;
  else
  odd++;
  }
  if(even>odd)
  {
  for(int i=0;i<integers.length;i++)
  {
  if(integers[i]%2!=0)
  pos=i;
  }}
  else
  {
  for(int i=0;i<integers.length;i++)
  {
  if(integers[i]%2==0)
  pos=i;
  }}
   
    return integers[pos];
}}
    

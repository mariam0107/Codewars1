//Welcome. In this kata, you are asked to square every digit of a number.
//
//For example, if we run 9119 through the function, 811181 will come out.
//
//Note: The function accepts an integer and returns an integer
package codewarstogithub;

public class SquareDigit {
   public int squareDigits(int n) {
  char d;
  int d1,sq,m;
  String str="",str1;
  str1=Integer.toString(n);
      for (int i = 0; i < str1.length(); i++) {
          
      d=str1.charAt(i);
      d1= Character.getNumericValue(d);
      sq=(int)(Math.pow(d1, 2));
      str+=Integer.toString(sq);
      }
    m=Integer.parseInt(str)  ;
  return m;

}} 


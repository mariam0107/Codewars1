/*You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.

#Examples:

runBF("test\0") should return "es"

runBF("testing\0") should return "t"

runBF("middle\0") should return "dd"

runBF("A\0") should return "A"
*/
package codewarstogithub;

public class GetMiddleCharacter {
    
  public static String getMiddle(String word) {
  char c1,c2;
  String s;
    int len=word.length();
    int l1=len/2;
    if(len%2!=0)
    {
    
    c1=word.charAt(l1);
   s=""+c1;
    }
    else
    {
    c1=word.charAt(l1-1);
    c2=word.charAt(l1);
   s =""+c1+c2;
   }
    return s;
  }
}


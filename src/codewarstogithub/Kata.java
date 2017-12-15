
package codewarstogithub;
//In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

  import java.util.Arrays;
public class Kata {
  public static String HighAndLow(String numbers) {
    // Code here or
    
String[] numberStrs = numbers.split(" ");
int[] numbers1 = new int[numberStrs.length];
for(int i = 0;i < numberStrs.length;i++)
{
   numbers1[i] = Integer.parseInt(numberStrs[i]);
}
Arrays.sort(numbers1);
String s="";
s=s+numbers1[numberStrs.length-1]+" "+numbers1[0];
    //return "throw towel";
    return s;
  }
}  


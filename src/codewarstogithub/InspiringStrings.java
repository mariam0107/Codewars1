//When given a string of space separated words, return the word with the longest length.
//If there are multiple words with the longest length, return the last instance of the word with the longest length.

//Example:
//
//'red white blue' //returns string value of white
//
//'red blue gold' //returns gold
package codewarstogithub;

public class InspiringStrings {
  
  public static String longestWord(String wordString) 
  {
  String[] splited=wordString.split(" ");
        String longestString=splited[0];
        for (int i = 1; i <  (splited.length); i++) {
            if(longestString.length()<=splited[i].length())
            longestString=splited[i];
        }
        return longestString;
  }
  }  


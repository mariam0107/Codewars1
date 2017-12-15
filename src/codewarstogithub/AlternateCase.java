/*
 Write function alternateCase which switch every letter in string from upper to lower and from lower to upper. E.g: Hello World -> hELLO wORLD


 */
package codewarstogithub;

public class AlternateCase {
   
    static String alternateCase(final String string) {
        char c1,c2=' ';
        String s1="";
    for(int i=0;i<string.length();i++)
    {
     
    c1=string.charAt(i);
    if(c1!=' ')
    {
    if(c1>='A'&&c1<='Z')
    {
    c2=Character.toLowerCase(c1);
    }
    else if(c1>='a'&&c1<='z')
    {
    c2=Character.toUpperCase(c1);
    }
    else
    {
        c2=c1;
    }
    s1+=c2;
        }
    else if(c1==' ')
        s1+=' ';
    else
        s1+=c1;
        }
   
        return s1;
    }
} 


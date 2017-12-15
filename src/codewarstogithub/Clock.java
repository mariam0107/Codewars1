//Clock shows 'h' hours, 'm' minutes and 's' seconds after midnight.
//
//Your task is to make 'Past' function which returns time converted to miliseconds.
//
//#####Example:
//
//Past(0, 1, 1) == 61000
package codewarstogithub;

public class Clock
{
  public static int Past(int h, int m, int s) 
  {
    h=h*60*60*1000;
    m=m*60*1000;
    s=s*1000;
    return (h+m+s);
  }
}

package codewarstogithub;
//Take an integer n (n >= 0) and a digit d (0 <= d <= 9) as an integer. 
//Square all numbers k (0 <= k <= n) between 0 and n.
//Count the numbers of digits d used in the writing of all the k**2. Call nb_dig (or nbDig or ...) the function taking n and d as parameters and returning this count.

public class CountDig {
  public static int nbDig(int n, int d) {
        int square1,c=0,d1;
        if(n==0 && d==0)
        {
        return 1;
        }
        else
        {
                for(int i=1;i<=n;i++)
        {
        square1=(int)Math.pow(i,2);
        while(square1>0)
        {
        d1=square1%10;
        if(d1==d)
        {
        c++;
        }
        square1=square1/10;
        }
    }
        }
        if(d!=0)
        return c;
        else
        return c+1;
       } 
    }
    
    


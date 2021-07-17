import java.util.*;
import java.lang.*;
public class leetcode1 {
    static int max=0;  
    public static void main(String args[])
    {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        int n = s.length();
        
       int maxx = count(s,0,n);
       System.out.println(maxx + " dddddddd");
    }
    static int count(String s,int i,int n)
    {
        //static int max=0;  
        char c = s.charAt(i); 
        int j = i+1;
        //System.out.println(".........");
        while(j<n) 
            {
                //System.out.println("j :" + j);
                if(c == s.charAt(j)) 
                {
                    
                    if(max<j) 
                        max = j;
                        //System.out.println("max : "+ max); 
                    break;
                }
                j++;
            }
            if(i==n)
                {
                    //System.out.println(max + " fsdfsfsfdsfd");
                    return max;
                }
            return count(s, ++i,j);  

        
    }
}

import java.util.*;
import java.lang.*;

class jaga{
    public static void main(String args[]){
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while(t-->0){
            int d,x,y,z,w1,w2;
            d= sc.nextInt();
            x= sc.nextInt();
            y= sc.nextInt();
            z= sc.nextInt();
            w1 = x*7;
            w2 = (y*d) + z*(7-d);
            if(w1>w2)
            System.out.println(w1);
            else
            System.out.println(w2);
        }
    }
}
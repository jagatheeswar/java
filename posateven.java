import java.util.*;
import java.lang.*;
import java.util.Collections;
 

public class posateven {
    public static void main(String args[]){
        int arr[] = new int[]{-1, 3, -5, 6, 3, 6, -7, -4, -9, 10};
        int temp[] =  new int[arr.length];
        int j=0,n=arr.length, k=1,pos=0,neg=0,countp = 0, countn = 0;
        
        Arrays.sort(arr); 
        System.out.print("sorted");
        printarray(arr, n); 
        System.out.print("...............");
        
        for(int i = 0;i<n ; i++){
            if(arr[i]>=0)
            pos++;
            else
            neg++;
        }
        int flag = neg ;
        System.out.print("flag: " +flag);
        if(neg>=pos){
            System.out.print("reverse");
            reverse(arr,n);
            flag = pos;
        }
        int f2 = 2*flag;
        for(int i = 0;i<n ; i++)
        {
            System.out.print(neg);
            if(f2>i){
                System.out.print(neg>pos);
                if((arr[i]>=0) && countp<pos)
            {
                System.out.print("i " + i);
                System.out.print(arr[i]>=0);
                temp[j] = arr[i];
                j+=2;
                countp++;
            }
            else if(arr[i]<0 && countn<neg) 
            {
                System.out.print("call ");
                temp[k] = arr[i];
                k+=2; 
                countn++;
            }
        }
        for(int z = f2;z<n;z++){
            temp[z] = arr[z];
        }
        }
        printarray(temp, n);
     
    }
    static void reverse(int arr[],int n)
    {
        int i=0,j=n-1,temp;
        while(i<j)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
            i++;
        }
    }
    static void printarray(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }   
       
    }
}
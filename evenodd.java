import java.util.*;
import java.lang.*;
public class evenodd {
    public static void main(String args[]){
        int arr[] = new int[]{1, 2, 2, 1};
        int temp[] =  arr.clone();
        int j=1,n=arr.length;
        int k=0;
        Arrays.sort(temp); // 2 3 4 5  // 0 5 0 4  
        for(int i = n-1,p=0;i>n/2||p<n/2 ; i--,p++){
            arr[j] = temp[i];
            j+=2;
            arr[k] = temp[p];
            k+=2; 

        }
     for(int i=0;i<n;i++){
         System.out.println(arr[i]);
     }   
    }
    
}
//Rearrange array such that even index elements are smaller and odd index elements are greater
//2 5 3 4 
//1 8 2 6 3 4
//0 1 2 3 4 5
//1 
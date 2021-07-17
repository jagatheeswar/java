import java.util.*;

public class oddevenpos {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        rearrange(arr,n);
    }    
    static void rearrange(int arr[], int n){
            int evenpos = n/2; // 7/2=> 3
            int oddpos = n - evenpos;  // 4
            int brr[] = arr.clone();
            Arrays.sort(brr); // 1 2 3 4 5 6 7
            int j = oddpos -1;   //3
            for(int i=0;i<n;i+=2){
                arr[i] = brr[j];
                j--;
            }
            j = oddpos;
            for(int i=1;i<n;i+=2){
                arr[i] = brr[j];
                j++;
            }
            for(int i=0;i<n;i++){
                System.out.println(arr[i]);
            }
            
    }
}

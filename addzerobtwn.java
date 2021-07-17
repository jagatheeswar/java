import java.util.*;
public class addzerobtwn {
    public static void main(String args[]){
        int arr[] = new int[]{2, 2, 0, 4, 0, 8};
        int n = arr.length;
        rearrange(arr, n);
        pushzero(arr, n);
        printarray(arr, n);

    }
    static void rearrange(int arr[],int n){
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1] && arr[i]!=0){
                arr[i] = arr[i]*2;
                arr[i+1] = 0;
            }
            

        }
    }
    static void pushzero(int arr[],int n){
        int count=0;
        for(int i =0;i<n;i++){
            if(arr[i]!=0){          // 1 2 0 3 0 4
                arr[count++] = arr[i];
            }
        }
        for(int i=count;i<n;i++){
            arr[i] = 0;
        }
    }
    static void printarray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

}

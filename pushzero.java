import java.util.*;
class s{
    public static void main(String args[]){
        int arr[] = new int[]{1,0,2,0,3,0,4,0,5,0};
        int count=0,k=0;
        int[] arr1 = new int[arr.length];
        for(int i = 0; i<arr.length ; i++){
            if(arr[i]==0)
            count++;
            if(arr[i] !=0){
            arr1[k] = arr[i]; //1 2 3 4 5
        k++;    
        }

        }
        for(int j= arr1.length;j<arr.length;j++){
            arr1[j]=0;
        }
        for(int i= 0;i<arr.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
import java.util.*;

public class rotationnum {
static int[] arr= new int[]{12, 15, 18, 2, 3, 6};  //2 3 6 12 15 18// 1 2 3 4 5 6 => 3 4 5 6 1 2  
    public static void main(String args[]){
    int i, n,minval=arr[0],minindex = 0;
    n = arr.length;
    for( i = 0;i<n;i++){
        if(arr[i]<minval){
        minval = arr[i];
        minindex = i;}
    }
    System.out.println(minindex);

 }   
}

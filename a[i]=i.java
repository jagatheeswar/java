import java.util.*;
import java.lang.*;
class rearrange{
    public static void main(String args[]){
        rearrange r = new rearrange();
        int arr[] = {-1, -1, 6, 1, 9,
            3, 2, -1, 4,-1};
             
        r.rearrangefun(arr);
        r.printarray(arr);

    }
    void printarray(int arr[]){
        for(int i =0 ;i <arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
    void rearrangefun(int arr[]){
        Set <Integer> s = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }
        for(int i =0;i<arr.length;i++){
            if(s.contains(i))
            arr[i] = i;
            else
            arr[i] = -1;
        }
    }
}

import java.util.*;
public class maxsum {
public static void main(String args[]){
    int arr[] = new int[]{10,1,2,3,4,5,6,7,8,9};
    //int arr[] = new int[]{3,2,1};
    maxsum m = new maxsum();
System.out.println(m.maxsumfun(arr));     
}
int maxsumfun(int arr[]){
int arraysum = 0 , maxval = 0,curruentval =0;
for(int i=0;i<arr.length;i++){
    arraysum = arraysum + arr[i];
    curruentval += arr[i]*i; 
}

maxval = curruentval;

for (int j=1; j<arr.length; j++)
{
    System.out.println(".........................................");
    System.out.println("arraysum "+arraysum);
    System.out.println("arr.length "+arr.length);
    System.out.println("arr.[length - 1] "+arr[arr.length-j]); 
    System.out.println("curent val "+curruentval);
    System.out.println("arr.length*arr[arr.length-j] "+ arr.length*arr[arr.length-j]);                           //    10,1,2,3,4,5,6,7,8,9
    System.out.println("//////////////////////////////////////////");
    curruentval = curruentval + arraysum-arr.length*arr[arr.length-j];
    System.out.println("arraysum "+arraysum);
    System.out.println("arr.length "+arr.length);
    System.out.println("arr.[length - 1] "+arr[arr.length-j]); 
    System.out.println("curent val "+curruentval);
    if (curruentval > maxval)
        maxval = curruentval;
}

// Return result
return maxval;
}
}

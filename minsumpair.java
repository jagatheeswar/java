import java.util.Map;

import java.util.*;
public class minsumpair {
    public static void main(String args[]){
        int arr1[] = {1,2,3,4};
        int arr2[] = {1,2,3,4};
        int n1=arr1.length,sum=0;
        String s= "";
        Map<String,Integer> map = new TreeMap<String,Integer>();
        for(int i=0;i<4;i++){
        for(int k=i+0;k<4;k++){
                
                    sum = arr1[i]+arr2[k];
                    s = Integer.toString(i) + "," + Integer.toString(k);
                    map.put(s,sum);
            }

        }
            System.out.println(map);
    }
}

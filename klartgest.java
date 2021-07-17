import java.util.*;
public class klartgest {
public static void main(String args[]){
    
    int arr[] = {503,33,113,213,23,563};
    Set<Integer> t = new TreeSet<Integer>();
    
    int k = 1;
    int key = 2;

    for(int i=0;i<arr.length;i++)
        t.add(arr[i]);
        
    for(Integer value : t)
    {   
        System.out.println(value+"dffsfd");
        if(k == key)
        break;
        k++;
    }
}   

}



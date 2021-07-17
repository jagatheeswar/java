import java.util.*;
public class kthsmallest {
public static void main(String args[]){
    
    int arr[] = {503,33,113,213,23,563};
    Set<Integer> t = new TreeSet<Integer>();
    ArrayList<Integer> list = new ArrayList<Integer>();
    int k = 1;
    int key = 2;
    
    for(int i=0;i<arr.length;i++)
        t.add(arr[i]);
        list.addAll(t);
        Collections.reverse(list);    
    for(Integer value : list)
    {   
        System.out.println(value+"dffsfd");
        if(k == 3)
        break;
        k++;
}
}   
}
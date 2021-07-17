public class arrayorder {
    public static void main(String args[]){
        int arr[] = { 10, 11, 12};
        int arr1[] = new int[arr.length];
       

        int index[] = {1, 0, 2};
        int n =arr.length;
        for(int i =0;i<n;i++){
            arr1[index[i]] = arr[i];
        }
        for(int i =0;i<n;i++){
            System.out.println(arr1[i]);
        }
        
    }
}

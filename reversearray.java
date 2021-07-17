

class reverse{
    static void reversefun(int arr[],int start, int end){
        int temp;
        if(start>=end)
        return;

        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    reversefun(arr,start+1,end-1);
    }
    static void printarray(int arr[]){
        for(int i = 0; i<arr.length;i++)
        System.out.println(arr[i]);
    }
    public static void main(String args[]){
            int arr[] = {1,2,3,4,5,6};
        reversefun(arr, 0, arr.length-1);
        printarray(arr);
    }
}
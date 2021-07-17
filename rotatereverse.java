import java.util.*;
class rotatereverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int i=0,n = 6;
        int arr[] = new int[n];
        while(i < n){
            arr[i] = sc.nextInt();
            i++;
        }
        rotatereverse r = new rotatereverse();
        r.reversearray(0,d-1,arr); //0 d-1
        r.reversearray(d,n-1,arr);  // d-1 n
        r.reversearray(0,n-1,arr); //0 n-1
        r.printArray(n, arr);
    }
    void reversearray(int start, int end , int arr[]){
            int temp = 0;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
                start++;
                end--;
            }
    }
    void printArray(int n, int arr[]){
            for(int i=0;i<n;i++){
                System.out.println(arr[i]);
            }
    }
}

// 1 2 3 4 5 6
// 1 2 => 2 1 
// 3 4 5 6 => 6 5 4 3
//  3 4 5 6 2 1
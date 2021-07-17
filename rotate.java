import java.util.*;
class rotatearrayclass{
public static void main(String[] args) {
    int no = 6;
    rotatearrayclass r = new rotatearrayclass();
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[no];
    for(int i=0;i<no;i++){
        System.out.println("enter " + i + "element");
        arr[i] = sc.nextInt();
        
    }
    System.out.println("enter d" + arr.length);
    int d = sc.nextInt();
    r.rotatearray(arr,d,arr.length);
    r.printArray(arr,arr.length);
    
}
void rotatearray(int arr[],int d, int n){
    for(int i=0;i<d;i++){
        System.out.println("called");
        rotateonebyone(arr,n);
    }

}
void rotateonebyone(int arr[],int n){
    int temp,i;                         
    temp = arr[0]; 
    for(i=0;i<n-1;i++){        
        arr[i]=arr[i+1];         
}                             
arr[n-1] = temp;
}
void printArray(int arr[], int n){
    for(int i=0;i<n;i++)
    System.out.println(arr[i]);
} 
}
//1 2 3 4 5 6
//1 aa
//2 3 4 5 6 1
 //2 temp
 //3 4 5 6 1 2


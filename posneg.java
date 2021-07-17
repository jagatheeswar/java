// Below is the implementation of the above approach
import java.io.*;
import java.lang.*;
import java.util.*;
public class posneg{

	// function which works in the condition when number of
	// negative numbers are lesser or equal than positive
	// numbers
	static void fill1(int a[], int neg, int pos)
	{
		if (neg % 2 == 1) {
			for (int i = 1; i < neg; i += 2) {
				int c = a[i];
				int d = a[i + neg];
				int temp = c;
				a[i] = d;
				a[i + neg] = temp;
			}
		}
		else {
			for (int i = 1; i <= neg; i += 2) {
				int c = a[i];
				int d = a[i + neg - 1];
				int temp = c;
				a[i] = d;
				a[i + neg - 1] = temp;
			}
		}
	}
	// function which works in the condition when number of
	// negative numbers are greater than positive numbers
	static void fill2(int a[], int neg, int pos)
	{
		if (pos % 2 == 1) {
			for (int i = 1; i < pos; i += 2) {
				int c = a[i];
				int d = a[i + pos];
				int temp = c;
				a[i] = d;
				a[i + pos] = temp;
			}
		}
		else {
			for (int i = 1; i <= pos; i += 2) {
				int c = a[i];
				int d = a[i + pos - 1];
				int temp = c;
				a[i] = d;
				a[i + pos - 1] = temp;
			}
		}
	}
	static void reverse(int a[], int n)
	{
		int i, k, t;
		for (i = 0; i < n / 2; i++) {
			t = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = t;
		}
        for(int f=0;f<a.length;f++){
            System.out.println(a[f]);
        }
	}
	static void print(int a[], int n)
	{
		for (int i = 0; i < n; i++)
			System.out.println(a[i] + " " );
		System.out.println();
	}
	public static void main(String[] args)
		throws java.lang.Exception
	{
		// Given array
		int[] arr = { -5, -2, -15, -12, -14, 7, 1, 8, 0, -8 };
		int n = arr.length;

		int neg = 0, pos = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0)
				neg++;
			else
				pos++;
		}
		// Sort the array
		Arrays.sort(arr);
        System.out.println("...........");
        for(int f=0;f<arr.length;f++){
            System.out.println(arr[f]);
        }
        System.out.println("...........");
		if (neg <= pos) {
			fill1(arr, neg, pos);
		}
		else {
			// reverse the array in this condition
			reverse(arr, n);
            
			fill2(arr, neg, pos);
		}
		print(arr, n);
	}
}
//...........
//-/15
//-14
//-12
//-8 
//-5
//-//2
//0
//1
//7
///8
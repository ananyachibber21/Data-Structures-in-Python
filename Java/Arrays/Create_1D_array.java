// Creating a 1-Dimensional Array

import java.util.Scanner;

public class Create_1D_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			System.out.println("Enter the element: ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Elements are as follows: ");
		for(int i = 0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}		
	}
}

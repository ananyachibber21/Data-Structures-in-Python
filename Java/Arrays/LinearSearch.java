// Linear Search on Arrays

import java.util.Scanner;

public class LinearSearch {

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
		System.out.println("Elements the element you are searching: ");
		int element = sc.nextInt();
		for(int i = 0; i<n; i++) {
			if(element == arr[i]) {
				System.out.println("Element present at position: "+ i);
			}
		}		
	}
}

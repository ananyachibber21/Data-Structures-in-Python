// Insertion of element in an Array

import java.util.*;
public class insertionArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5};
		System.out.println("Enter the element you want to insert: ");
		int element = sc.nextInt();
		System.out.println("Enter the the position you want to insert: ");
		int pos = sc.nextInt();
		if(pos<0 || pos>=arr.length) {
			System.out.println("Invalid Position");
		}
		else {
			for(int i=arr.length-1;i>pos;i--) {
				arr[i] = arr[i-1];
			}
			arr[pos]=element;
		}
		System.out.println("Modified Array: ");
		for(int num: arr) {
			System.out.println(num+" ");
		}
        
	}

}

// Deleting of element in an Array

import java.util.*;
public class deletionArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5};
		System.out.println("Enter the the position you want to delete: ");
		int pos = sc.nextInt();
		if(pos<0 || pos>=arr.length) {
			System.out.println("Invalid Position");
		}
		else {
			for(int i=pos;i<arr.length-1;i++) {
				arr[i] = arr[i+1];
			}
			arr[arr.length - 1] = 0;//set the last element to 0
		}
		System.out.println("Modified Array: ");
		for(int num: arr) {
			System.out.println(num+" ");
		}
        
	}

}

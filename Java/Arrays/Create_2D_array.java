// Creating a 2-Dimensional Array

import java.util.Scanner;

public class Create_2D_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int r = sc.nextInt();
		System.out.print("Enter the number of cols: ");
		int c = sc.nextInt();
		int arr[][]= new int[r][c];
		for(int i = 0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.println("Enter the element: ");
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("The matrix is given by: ");
		for(int i = 0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.print(arr[i][j]+ " ");
			}
		}
	}

}

import java.util.Scanner;

class Reverse{
	int[] reverseArr(int n, int[] arr) {
		int[] rev = new int[n];
		for(int j=arr.length-1,i=0;j>=0;j--,i++) {
			rev[j]=arr[i];
		}
		return rev;
	}
}

public class reversingArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];	
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Reverse r = new Reverse();
		int[] reversed_array_final = r.reverseArr(n, arr);
		for(int num:reversed_array_final) {
			System.out.print(num+" ");
		}
	}

}

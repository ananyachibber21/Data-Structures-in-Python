import java.util.*;

class Search{
	int binary_search(int[] arr, int element) {
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(element==arr[mid]) {
				return mid;
			}
			else if(element<arr[mid]) {
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}
		return -1;
	}
}

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,3,5,8,9,12};
		System.out.println("Enter the element you want to search: ");
		int element = sc.nextInt();
		Search bs = new Search();
		int result = bs.binary_search(arr, element);
        if (result == -1) {
        	System.out.println("Element not found in the array.");
        } 
        else {
        	System.out.println("The position of the element is: " + result);
        }
	}

}

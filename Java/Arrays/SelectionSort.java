class Selection{
	int[] arr;
	
	public Selection(int[] arr) {
		this.arr=arr;	
	}
	
	public void sorted_arr() {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			int minIndex = i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			
		}
	}
	
	public void print_arr() {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}


public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {6,2,9,0,3,5,1};
		Selection s = new Selection(arr);
		s.sorted_arr(); // Sort the array
        System.out.println("The sorted array: ");
        s.print_arr(); // Print the sorted array
	}
}

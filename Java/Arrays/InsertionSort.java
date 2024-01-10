class Insertion{
	int[] arr;
	
	public Insertion(int[] arr) {
		this.arr=arr;	
	}
	
	public void sorted_arr() {
		int n = arr.length;
		for(int i=1;i<n;i++) {
			int key = arr[i];
			int j = i-1;
			while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
		}
	}
	
	public void print_arr() {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}


public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {6,2,9,0,3,5,1};
		Insertion b = new Insertion(arr);
		b.sorted_arr(); // Sort the array
        System.out.println("The sorted array: ");
        b.print_arr(); // Print the sorted array
	}
}

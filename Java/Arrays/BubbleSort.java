class Bubble{
	int[] arr;
	
	public Bubble(int[] arr) {
		this.arr=arr;	
	}
	
	public void sorted_arr() {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	public void print_arr() {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}


public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {6,2,9,0,3,5,1};
		Bubble b = new Bubble(arr);
		b.sorted_arr(); // Sort the array
        System.out.println("The sorted array: ");
        b.print_arr(); // Print the sorted array
	}
}

class Maximum{
	int max_value(int[] arr) {
		int max=arr[0];
		int i=0;
		while(i<arr.length) {
			if(arr[i]>max) {
				max = arr[i];
			}
			i++;
		}
		return max;
	}
}

class Minimum{
	int min_value(int[] arr) {
		int min=arr[0];
		int i=0;
		while(i<arr.length) {
			if(arr[i]<min) {
				min = arr[i];
			}
			i++;
		}
		return min;
	}
}

public class MaxMinArray {

	public static void main(String[] args) {
		int[] arr = {5,7,3,2,9,8};
		Maximum M = new Maximum();
		Minimum m = new Minimum();
        int maximum = M.max_value(arr);
        int minimum = m.min_value(arr);
        System.out.println("Maximum Element: "+ maximum);
        System.out.println("Minimum Element: "+ minimum);
	}

}

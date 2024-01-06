// Updating an element in an array
import java.util.*;
public class updationArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5};
		System.out.println("Enter the position you want to update: ");
        int pos = sc.nextInt();

        if (pos >= 0 && pos < arr.length) {
            System.out.println("Enter the element that you want to add: ");
            int element = sc.nextInt();
            arr[pos] = element;

            System.out.println("Array after updating:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Invalid position");
        }
    }

}

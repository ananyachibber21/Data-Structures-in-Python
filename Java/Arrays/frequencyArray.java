import java.util.HashMap;
public class frequencyArray {

	public static void main(String[] args) {
		int[] arr = {1,1,1,3,3,4,4,4,5,5,6};
        HashMap<Integer,Integer> frequency = new HashMap<>();
        for(int i: arr) {
        	frequency.put(i, frequency.getOrDefault(i, 0)+1);
        }
        for(int key: frequency.keySet()) {
        	System.out.println("Number "+key+" Occurences: "+ frequency.get(key));
        }
	}
}

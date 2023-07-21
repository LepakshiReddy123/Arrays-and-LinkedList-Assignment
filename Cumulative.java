import java.util.*;
public class Cumulative {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int[] arr = new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		 }

	        try {
	            multiple(arr);
	            System.out.println("arrNum = " + Arrays.toString(arr));
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }

	}
	private static void multiple(int[] arr) throws Exception {
        if (arr == null || arr.length == 0) {
            throw new Exception("Array is null or empty.");
        }

        int cumulativeMultiple = 1;
        for (int i = 0; i < arr.length; i++) {
            cumulativeMultiple *= arr[i];
            arr[i] = cumulativeMultiple;
        }
    }

}

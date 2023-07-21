import java.util.*;
public class Missing {
	public static List<Integer> find(int[] arr) {
        int n = arr.length;
        int start = arr[0];
        int end = arr[n - 1];
        List<Integer> missingNum = new ArrayList<>();

        for (int num = start; num <= end; num++) {
            boolean found = false;
            for (int i = 0; i < n; i++) {
                if (arr[i] == num) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                missingNum.add(num);
            }
        }

        return missingNum;
    }

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		List<Integer> missingNum = find(arr);

        for (int num : missingNum) {
            System.out.print(num + " ");
        }

	}
	
}

import java.util.*;
public class Singular {
	public static int count(int[] arr) {
	LinkedList<Integer> sockPairs = new LinkedList<Integer>();
    for (int sockID : arr) {
        if (!sockPairs.remove(Integer.valueOf(sockID))) {
            sockPairs.add(sockID);
        }
    }
    int singularCount = sockPairs.size();
    return singularCount;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n]; 
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("arr = "+Arrays.toString(arr));
		int singularCount=count(arr);
		System.out.println("Count of singular socks = "+singularCount);
		
	}

}

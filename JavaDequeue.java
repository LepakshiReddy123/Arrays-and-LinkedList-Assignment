import java.util.*;
import java.lang.*;
public class JavaDequeue {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        Deque<Integer> d=new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] num=new int[10000001];
        int max=0;
        int c=0;
        for (int i = 0; i < n; i++) {
        	if(i>=m){
        		int last=d.removeLast();
                if(num[last]>=1){
                	num[last]--;
                    if(num[last]==0){
                        c--;
                    }
                }
            }
        	int val=in.nextInt();
            d.addFirst(val);
            if(num[val]==0){
                 c++;
                 if(c==0){
                     System.out.println(c);
                 }
                  max=Math.max(max,c);
            }
            num[val]++;
       }
       System.out.println(max); 
        
    }

}

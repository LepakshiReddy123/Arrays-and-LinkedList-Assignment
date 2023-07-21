// code executed in hackerrank
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class  NegativeSubarray{

    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt(); 
        }
        int count=countNegative(arr);
        System.out.println(count);
              
        sc.close();
        
    }
    private static int countNegative(int[] arr){
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int  j=i;j<n;j++){
                sum+=arr[j];
                if(sum<0){
                    count++;                
                }
            }
        }
    
    return count;
}
}



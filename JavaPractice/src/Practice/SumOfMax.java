package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfMax {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Araays Size: ");
		int n=sc.nextInt();
		if(n<=0){System.out.println("invalid input"); return;}
		if(n%2!=0) {System.out.println("please eneter even number"); return;}
		int[] arr= new int[n]; 
		int sum=0;
		int maxSum=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int maxIndex=n-1;
		int minIndex=0;
		while(maxIndex>minIndex) {
			
			sum=arr[minIndex]+arr[maxIndex];
			maxSum=Math.max(sum, maxSum);
			maxIndex--;
			minIndex++;
		}
//		for(int minIndex=0;minIndex<n;minIndex++) {
//
//			sum=min+max;
//			maxSum=Math.max(sum, maxSum);
//			maxIndex--;
//		}
		 System.out.println("Max Num is : "+maxSum);
	}
}

package Practice;

import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of chances: ");
		int n=sc.nextInt();
		if(n<1 || n>5) { System.out.println("Out of range");return;}
		int[] arr= new int[2*n];
		int sum=0;
		System.out.println("Enter numbers: ");
		for(int i=0;i<2*n;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]<0 || arr[i]>10) { System.out.println("invalid number"); return;}
			sum=sum+arr[i];
		}
		for(int i=2;i<Math.sqrt(sum);i++) {
			if(sum%i==0) {
				System.out.println("not prime");
				return;
			}
		}
		System.out.println("Prime, You Won!!");
		
		
	}

}

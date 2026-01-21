package Practice;

import java.util.Scanner;

public class MagicSum {
	public static boolean isPrime(int num) {
		if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        int limit = (int) Math.sqrt(num);
        for (int i = 3; i <= limit; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
	}
	public static boolean consecutiveNumbers(int n) {
		int sum=0;
		for(int i=2;i<n;i++) {
			if(isPrime(i)) {
				sum+=i;
				if(sum==n) { return true;}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		if(n<1||n>5) {System.out.println("Invalid Array size"); return;}
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]<=0 || arr[i]>=100) { System.out.println("invalid number"); return;}
		}
		for(int i=0;i<n;i++) {
			if(isPrime(arr[i])) {
				if(consecutiveNumbers(arr[i])) {
					System.out.println(arr[i]);
				}
			}
		}
	}
}

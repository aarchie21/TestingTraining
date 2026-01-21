package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticalOrder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str=sc.nextLine();
		str=str.toLowerCase();
		for(char c: str.toCharArray()) {
			if(!(Character.isLetter(c)|| c==' ')) {System.out.println("Invalid string"); return; }
			
		}
		String[] strArr= str.split(" ");
		String[] res=new String[strArr.length];
		for(int i=0;i<strArr.length;i++) {
			char[] arr = strArr[i].toCharArray();
			Arrays.sort(arr);
			String sorted = new String(arr);
			res[i]=sorted;
		}
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
	}
		
}

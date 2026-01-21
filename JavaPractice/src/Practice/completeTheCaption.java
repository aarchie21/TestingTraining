package Practice;

import java.util.Scanner;

public class completeTheCaption {
	public static boolean isValid(String s) {
		for(char c:s.toCharArray())
		{
		if(!(Character.isLetter(c)|| c=='!'||c==' ')) return false;
	}
		return true;
}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("String 1: ");
		String s1=sc.nextLine();
		System.out.println("String 2: ");
		String s2=sc.nextLine();
		if(s1.length()!=s2.length()) {
			System.out.println("Length of the Strings doesn't match"); return;
		}
		boolean valid1=isValid(s1);
		boolean valid2=isValid(s2);
		if(!valid1&&!valid2) { System.out.println("Both Strings invalid"); return;}
		else if(!valid1) {System.out.println("String1 invalid"); return;}
		else if(!valid2) {System.out.println("String2 invalid");return;}
		StringBuilder result=new StringBuilder();
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='!') { result.append(s2.charAt(i));}
			else {result.append(s1.charAt(i));}
		}
		System.out.println(result.toString());
	}
}
//String 1: Po**t**n
//String 2: !!si!io!
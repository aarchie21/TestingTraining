package Practice;

import java.util.Scanner;

public class FishingCompetition {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		String[] strArr= str.split(":");
		int age=Integer.parseInt(strArr[1]);
		int bigF=Integer.parseInt(strArr[2]);
		int medF=Integer.parseInt(strArr[3]);
		int smallF=Integer.parseInt(strArr[4]);
		if(age<18) {System.out.println("Invalid Age"); return;}
		if(bigF<0||medF<0||smallF<0){
			System.out.println("Invalid fish count"); return;
		}
		System.out.println("Total Points: "+ (bigF*10+medF*6+smallF*3));
	}
}

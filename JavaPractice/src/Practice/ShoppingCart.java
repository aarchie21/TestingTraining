package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {
	private List <String> list=new ArrayList<>();
	
	 public List<String> getList(){
		 return list;
	 }
	 public void setList(List<String> list) {
		 this.list=list;
	 }
	 public void addProductToList(String Product) {
		 list.add(Product);
	 }
	 public void sortProductList() {
		 Collections.sort(list);
	 }
	 
	 public static void main(String[] args) {
		 ShoppingCart shp=new ShoppingCart();
		 Scanner sc= new Scanner(System.in);
		 while(true) {
		 System.out.println("1.Add\n2.Dislpay\n3.Exit");
		 System.out.println("Enter your choice");
		 int option=sc.nextInt();
		 sc.nextLine();
		 switch(option) {
		 case 1:
			 System.out.println("Enter the product");
			 String product=sc.nextLine();
			 shp.addProductToList(product);
			 break;
		 case 2:
			 shp.getList();
			 break;
		 case 3:
			 System.out.println("Thank you for using the application");
			return;
		default:
			 System.out.println("Inavlid choice");
			 return;
		 	}
		 
		 }
	 }
}



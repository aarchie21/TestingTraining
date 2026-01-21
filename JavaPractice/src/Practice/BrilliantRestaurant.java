package Practice;

import java.util.Scanner;

public class BrilliantRestaurant {
	String customerName;
	int orderNumber;
	String deliveryType;
	String foodName;
	long phoneNumber;
	
	public BrilliantRestaurant(String customerName,int orderNumber,String deliveryType,String foodName,long phoneNumber) {
		this.customerName=customerName;
		this.orderNumber=orderNumber;
		this.deliveryType=deliveryType;
		this.foodName=foodName;
		this.phoneNumber=phoneNumber;
	}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName=customerName;
		}
		public int getOrderNumber() {
			return orderNumber;
		}
		public void setOrderNumber(int orderNumber) {
			this.orderNumber=orderNumber;
		}
		public String getDeliveryType() {
			return deliveryType;
		}
		public void setDeliveryType(String deliveryType) {
			this.deliveryType=deliveryType;
		}
		public String getFoodName() {
			return foodName;
		}
		public void setFoodName(String foodName) {
			this.foodName=foodName;
		}
		public long getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(long phoneNumber) {
			this.phoneNumber=phoneNumber;
		}
		public double BillAmount(double cost) {
			String deliveryType=getDeliveryType();
			double billAmount= 0;
			switch(deliveryType) {
				case "HomeDelivery":
					billAmount=(cost*0.8)+cost;
					break;
				case "Parcel":
					billAmount=(cost*0.3)+cost;
					break;
				case "NormalOrder":
					billAmount=(cost*0.3)+cost;
					break;
		}
			return billAmount;
		
	}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Name: ");
			String name=sc.nextLine();
			System.out.println("Order no: ");
			int orderNo=sc.nextInt();
			sc.nextLine();
			System.out.println("Delivery Type: ");
			String dType=sc.nextLine();
			if(dType.equals("HomeDelivery")||dType.equals("Parcel")||dType.equals("NormalOrder")) {
				System.out.println("Food Name: ");
				String fname=sc.nextLine();
				System.out.println("Phone No: ");
				long Phno=sc.nextLong();
				System.out.println("Price: ");
				double price=sc.nextDouble();
				BrilliantRestaurant br= new BrilliantRestaurant(name,orderNo,dType,fname,Phno);
				System.out.println("Name: "+br.getCustomerName());
				System.out.println("Order Number : "+br.getOrderNumber());
				System.out.println("Delivery Type: "+br.getDeliveryType());
				System.out.println("Food Name: "+br.getFoodName());
				System.out.println("Phone number: "+br.getPhoneNumber());
				System.out.println("Bill Amount: "+br.BillAmount(price));
			}
			else {
				System.out.println("Invalid Order Type");
			}
		}
}

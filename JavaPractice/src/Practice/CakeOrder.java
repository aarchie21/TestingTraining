package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CakeOrder {
	private Map<String,Double> orderMap;
	
	public CakeOrder(){
		orderMap=new HashMap<>();
	}
	public Map<String,Double> getCakeOrderList(){
		return orderMap;
	}
	public void setCakeOrderList(Map<String,Double> orderMap) {
		this.orderMap=orderMap;
	}
	public void addOrderDetails(String orderId,double cakeCost) {
//		orderId=orderId.toLowerCase();
		if(!orderMap.containsKey(orderId)) {
			orderMap.put(orderId,cakeCost);
		}
	}
	public Map<String,Double> findOrdersAboveSpecifiedCost(double cakeCost){
		Map<String,Double> resMap=new HashMap<>();
		for(Map.Entry<String,Double>entry:orderMap.entrySet()) {
			if(entry.getValue()>cakeCost) {
				resMap.put(entry.getKey(),entry.getValue());
			}
		}
		return resMap;
	}
	public static void main(String[] args) {
		CakeOrder cordr=new CakeOrder();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of cake orders to be added");
		int orders=sc.nextInt();
		sc.nextLine();
		Map<String,Double> map=new HashMap<>();
		String str="";
		System.out.println("Enter the cake order details (Order Id:CakeCost)");
		for(int i=0;i<orders;i++) {
			str=sc.nextLine();
			String[] details=str.split(":");
//			if(details.length==2) {
//				double d=Double.parseDouble(details[2]);
//				cordr.addOrderDetails(details[0], d);
//			}
			double d=Double.parseDouble(details[1]);
			cordr.addOrderDetails(details[0], d);
			}
		System.out.println("Enter the cost to search the cake orders");
		double cost=sc.nextDouble();
		System.out.println("orders : ");
		map=cordr.findOrdersAboveSpecifiedCost(cost);
		for(Map.Entry<String,Double>entry:map.entrySet()) {
			System.out.println("order id:"+entry.getKey()+", cost: "+entry.getValue());
		}
	}
}

package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CarSurvey {
	private Map<String,Integer> carMap;
	public CarSurvey() {
		carMap=new TreeMap<>();
	}
	public Map<String,Integer> getMap(){
		return carMap;
	}
	public void setMap(Map<String,Integer> map){
		this.carMap=map;
	}
	public void addCar(String name,int num) {
		name=name.toLowerCase();
		if(!carMap.containsKey(name)) {
			carMap.put(name,num);
		}
		
	}
	public int carByName(String name) {
		name = name.toLowerCase();
		return carMap.getOrDefault(name,-1);
	}
	public List<String> carByCount(int count){
		List<String> cars=new ArrayList<>();
		for(Map.Entry<String,Integer> entry:carMap.entrySet()) {
			if(entry.getValue()>=count) {
				cars.add(entry.getKey());
			}
		}
		return cars;
	}
	public int totalCarsSold() {
		int total=0;
		for(int v: carMap.values()) {
			total+=v;
		}
		return total;
	}
	
	
	public static void main(String[] args) {
		CarSurvey cs=new CarSurvey();
		 Scanner sc= new Scanner(System.in);
		 while(true) {
		 System.out.println("1.Add car\n2.Search by name\n3.Search by Count\n4.Total\n5.Exit");
		 System.out.println("Enter your choice");
		 int option=sc.nextInt();
		 sc.nextLine();
		 switch(option) {
		 case 1:
			 System.out.println("Enter the car name");
			 String car=sc.nextLine();
			 System.out.println("Enter the car sold");
			 int num=sc.nextInt();
			 if (num > 0) cs.addCar(car, num);
			 break;
		 case 2:
	 		if (cs.getMap().isEmpty()) {
                System.out.println("The map is empty");
                break;
            }
            System.out.println("Enter the car name");
            String carName = sc.nextLine();
            int res = cs.carByName(carName);
            if (res == -1) System.out.println("Car not found");
            else System.out.println(res);
            break;

		 case 3:

			 if (cs.getMap().isEmpty()) {
	            System.out.println("The map is empty");
	            break;
	        }
	        System.out.println("Enter the count");
	        int count = sc.nextInt();
	        sc.nextLine();
	        List<String> list = cs.carByCount(count);
	        if (list.isEmpty()) System.out.println("No cars found");
	        else for (String s : list) System.out.println(s);
	        break;
		 case 4:
			 if (cs.getMap().isEmpty()) {
                System.out.println("The map is empty");
                break;
            }
            System.out.println(cs.totalCarsSold());
            break;

		 case 5:
			 System.out.println("Thank you for using the application");
			return;
		 default:
			 System.out.println("Inavlid choice");
		 	}
		 
		 }
	}
}

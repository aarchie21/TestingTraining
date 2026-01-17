package com.ListLib01;

import java.util.List;

public class ListMethods {
	public boolean ArrayListTest(List<String> l1,List<String> l2){
		boolean l3=l1.addAll(l2);
		return l3;
		
	}
	public Object[] ConvertListToArray(List<Integer> l1) {
		Object arr[] = l1.toArray();
		return arr;
	}
}

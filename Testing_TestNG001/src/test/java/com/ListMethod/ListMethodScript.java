package com.ListMethod;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ListLib01.ListMethods;

//import junit.framework.Assert;

public class ListMethodScript {
	ListMethods obj= new ListMethods();
	boolean exp=true;
	Object expArr[]= {1,2,3,4,5};
	
  @Test
  public void f() {
	  List<String> test1= new ArrayList<>(Arrays.asList("Pune","Mumbai","Coimbatore"));
	  List<String> test2= new ArrayList<>(Arrays.asList("Pune1","Mumbai1","Coimbatore1"));
	  boolean res= obj.ArrayListTest(test1,test2);
	  System.out.println(res);
	  
	  Assert.assertEquals(res,exp);
	  
	  }
  @Test
	public void function() {
		List <Integer> arr1=Arrays.asList(1,2,3,4,5);
		Object resArr = obj.ConvertListToArray(arr1);
		Assert.assertEquals(resArr, expArr);
	}
  
}



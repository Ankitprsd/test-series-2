

package com.techment.day14.multithreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivideArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(5,1,3,2,4,6,5,0,9,7));
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(5);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(8);
		arr.add(9);
		arr.add(7);
		arr.add(0);
		arr.add(5);
		arr.add(6);
		arr.add(3);
		
		
		if(arr.size()==10)
		{
			List<Integer> arr1=arr.subList(0, 5);
			List<Integer> arr2=arr.subList(6, 10);
			System.out.println(arr1);
			System.out.println(arr2);
		}
		else if(arr.size()==11)
		{
			List<Integer> arr3=arr.subList(0, 6);
			List<Integer> arr4=arr.subList(7, 11);
			System.out.println(arr3);
			System.out.println(arr4);
			
			
		}
		
		
		
	}

}

package com.techment.day14.multithreading;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> sancks = new HashMap<String, Integer>();
		sancks.put("Chocolate", 4);
		sancks.put("Chocolate", 3);
		sancks.put("Ice Cream", 2);
		for(Entry<String, Integer> e: sancks.entrySet())
		{
			repeatFront(e.getKey(), e.getValue());
		}
	}
	
	static void repeatFront(String name, int n)
	{
		//Scanner sc = new Scanner(System.in);
		//System.out.println("enter n :");
		 //n= sc.nextInt();
		String repeatedChar = "";
		for(int i=n; i>0;i--)
		{
			repeatedChar += name.substring(0, i);
		}
		System.out.println(repeatedChar);
	

	}

}

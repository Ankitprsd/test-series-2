package com.techment.day14.multithreading;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> msg = new HashMap<String, Integer>();
		msg.put("Hello", 2);
		
		for(Entry<String, Integer> e: msg.entrySet())
		{
			repeatEnd(e.getKey(), e.getValue());
		}
	}
	
	static void repeatEnd(String str, int n)
	{
		String repeatedChar = "";
		for(int i=0; i<n; i++)
		{
			repeatedChar += str.substring(str.length()-n);		
		}
		System.out.println(repeatedChar);
	}


	}



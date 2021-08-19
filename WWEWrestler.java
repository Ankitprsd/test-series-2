package com.techment.day14.multithreading;

import java.util.ArrayList;
import java.util.stream.Collectors;





class WWE{
	//private data members
	private String firstName;
	private String LastName;
	private int weight;
	
	//This is the parameterized constructor
	public WWE(String firstName, String lastName, int weight) {
		super();
		this.firstName = firstName;
		LastName = lastName;
		this.weight = weight;
	}
	
	
	//Getter and setter
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
		
}

class  WWEWrestlerImplementation{
	
	//this will help in counting number of wrestlers
	public long numOfWrestlers(ArrayList<WWE> wwe) {
		long countWrestlers = wwe.stream().count();
		return countWrestlers;
	}
	
	//this gives us sum of the weight greater than 200 
	public long sumOfWeight(ArrayList<WWE> wwe) {
	long sumweight = wwe.stream().filter(e -> (e.getWeight() > 200)).collect(Collectors.summarizingInt(WWE::getWeight)).getSum();;
	return sumweight;
	}
	
	//for printing first name of all the wrestler
	public void printFirstName(ArrayList<WWE> wwe) {
		wwe.stream().forEach(e -> System.out.println(e.getFirstName()));
	}
	
//	for printing minimum weight or the wrestlers
	public int minWeight(ArrayList<WWE>wwe) {
		int minWeight = wwe.stream().collect(Collectors.summarizingInt(WWE::getWeight)).getMin();
		return minWeight;
	}
}

public class WWEWrestler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<WWE> wwe = new ArrayList<WWE>();
		
		wwe.add(new WWE("great", "khali", 181));
		wwe.add(new WWE("Under", "Taker", 190));
		wwe.add(new WWE("roman", "Reign", 120));
		wwe.add(new WWE("The", "Rock", 256));
		wwe.add(new WWE("mike", "tyson", 317));
			
		WWEWrestlerImplementation wweImp = new WWEWrestlerImplementation();
	
		//gives the number of wrestler
		System.out.println("=============================================");
		System.out.println("The numbers of wrestler is :"+ wweImp.numOfWrestlers(wwe));
		System.out.println();
		System.out.println();
		
		//gives sum of wrestler greater than 200
		System.out.println("=============================================");
		System.out.println("The sum of wrestler is :" + wweImp.sumOfWeight(wwe));
		System.out.println();
		System.out.println();
		
		//this will show sum of wrestler greater than 200
		
		System.out.println("===============================================");
		System.out.println("minimum weight is " + wweImp.minWeight(wwe));
		System.out.println();
		System.out.println();
		
		
	
	


}

	

}

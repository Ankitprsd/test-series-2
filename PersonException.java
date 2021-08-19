package com.techment.day14.multithreading;

import java.util.Scanner;

class Person
{
	int id;
	String name;
	int age;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @param id
	 * @param name
	 * @param age
	 */
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	

}

public class PersonException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of person");
		int age = sc.nextInt();
		try
		{
			if(age>=15)
			{
				System.out.println("Person is eligible");
			}
		}
		catch(Exception e)
		{
			System.out.println("Age of the person should be above 15");
		}

	
		System.out.println("Enter the name of person");
		int name = sc.nextInt();
		try
		{
			if(name.length>3)
			{
				System.out.println("name size is greater than 3");
			}
		}
		catch(Exception e)
		{
			System.out.println("name size should be greater than 3");
		}
	}

	public void nameSize(int size) {
		// TODO Auto-generated method stub
		if(size>3)
		{
			System.out.println("you are eligible to enter name ");
			
		}
		else
		{
			System.out.println("you are eligible to enter name because of your name sizer ");
		}
		
	}

}

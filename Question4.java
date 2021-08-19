package com.techment.day14.multithreading;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
				Scanner scanner = new Scanner(System.in);
				System.out.println("Please press 1 for geting RED, 2 for getting YELLOW and  3 for getting  GREEN");
				int choice = scanner.nextInt();
				if(choice==1)
					System.out.println("STOP");
				else if(choice==2)
					System.out.println("READY");
				else if(choice==3)
					System.out.println("GO");
				else
					System.out.println("you have choosen wrong option, please try again and press enter");

			}

		

	

}

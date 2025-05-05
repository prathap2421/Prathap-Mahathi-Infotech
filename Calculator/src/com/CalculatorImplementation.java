package com;

import java.util.Scanner;

public class CalculatorImplementation implements  Calculator {
	Scanner scan=new Scanner(System.in);
	@Override
	public int addition(){
		System.out.println("Enter the sum count: ");
		int count=scan.nextInt();
		System.out.println("Enter the inputs:");
		int sum=scan.nextInt();
		int input = 0;
		for(int i=2;i<=count;i++) {
			try {
				String in=scan.next();
				if(in.equals("exit")) {
					System.out.println("Program is terminated");
					break;
				}
				
				input=Integer.parseInt(in);
				sum=sum+input;
			}catch(Exception e) {
				System.out.println("It is not an integer");
				scan.next();
				i--;
			}

		}
		return sum;
	}
	@Override
	public int subtraction(){
		System.out.println("Enter the count :");
		int count=scan.nextInt();
		System.out.println("Enter the inputs :");
		int sub=scan.nextInt();
		int input=0;
		for(int i=2;i<=count;i++) {
			try {
				String in=scan.next();
				if(in.equals("exit")) {
					System.out.println("Program is terminated");
					break;
				}
				
				input=Integer.parseInt(in);
				sub=sub-input;
			}catch(Exception e) {
				System.out.println("Please enter a nummber");
				scan.next();
				i--;
			}
		}
		return sub;
	}
	@Override
	public int multiplication(){
		System.out.println("Enter the sum count: ");
		int count=scan.nextInt();
		System.out.println("Enter the inputs:");
		int product=scan.nextInt();
		int input = 0;
		for(int i=2;i<=count;i++) {
			try {String in=scan.next();
			if(in.equals("exit")) {
				System.out.println("Program is terminated");
				break;
			}
			
			input=Integer.parseInt(in);
			product=product*input;
			}catch(Exception e) {
				System.out.println("It is not an integer");
				scan.next();
				i--;
			}
		}
		return product;
	}
	@Override
	public float division(){
		System.out.println("Enter the count :");
		int count=scan.nextInt();
		System.out.println("Enter the inputs :");
		float div=scan.nextInt();
		int input=0;
		for(int i=2;i<=count;i++) {
			try {
				input=scan.nextInt();
				if(input==0) {
					System.out.println("Number cannot be divisible by 0");
					continue;
				}
					div=div/input;
			}catch(Exception e) {
				System.out.println("Please enter a nummber");
				scan.next();
				i--;
			}
		}
		return div;
	}
}
package com;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Calculator calci=new CalculatorImplementation();
		int choice=0;
		while(true) {
			System.out.println("1) Addition\n2) Subtraction \n3) Multiplication\n4) Division\n5) Exit");
			System.out.println("Enter the Data operation");
			try {
				 choice=scan.nextInt();
			}catch(Exception e) {
				System.out.println("Please enter a Choice number");
			}
			try{
				if(choice<=5 ||choice>5){
					switch (choice) {
					case 1: 
						int add=calci.addition();
						System.out.println(add);
						break;
					case 2: 
						int sub=calci.subtraction();
						System.out.println(sub);
						break;
					case 3: 
						int mul=calci.multiplication();
						System.out.println(mul);
						break;
					case 4: 
						float div=calci.division();
						System.out.println(div);
						break;
					case 5:
						System.out.println("Thank You");
						scan.close();
						System.exit(0);
					default:
						throw new InvalidData("No! Please choose the wanted Operation Choice");
					}
				}
			}catch(InvalidData e){
				System.out.println(e.getMsg());
			}
		}
	}
}

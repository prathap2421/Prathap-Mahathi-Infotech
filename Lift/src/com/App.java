package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Entity.Lift;
import com.LiftService.LiftImplementationService;
import com.LiftService.LiftService;

public class App {

	public static void main(String[] args) {

		List<Lift> lifts=new ArrayList<Lift>();
		Scanner scan=new Scanner(System.in);
		LiftService liftService=new LiftImplementationService();
		System.out.println("Welcome to Bombay Lift");
		System.out.println("Enter the Number of Lifts to create :");
		int NOfLifts=scan.nextInt();
		for(int i=0;i<NOfLifts;i++) {
			lifts.add(new Lift(i));
		}
		System.out.println("Enter the Lift Id :");
		int id=scan.nextInt();
		System.out.println("Enter the floor Number :");
		int floorId=scan.nextInt();
		
		liftService.move(lifts.get(id),floorId);
		while(true) {
			String input=scan.next();
			if(input.equals("exit")) {
				System.out.println("Thank You");
				System.exit(0);
			}else {
		liftService.addRequest(lifts.get(id),Integer.parseInt(input));
		}
		}
	}

}


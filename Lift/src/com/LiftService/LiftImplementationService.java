package com.LiftService;

import com.Entity.Lift;

public class LiftImplementationService implements LiftService {

	@Override
	public void move(Lift lift, int floor) {

		int initialFloor=lift.getPosition();
		lift.setPosition(floor);

		int destination=lift.getPosition();
		if(initialFloor>destination){
			for(int i=initialFloor;i>=destination;i--){
				System.out.println("Current Floor : "+i);
			}
		}
		if(initialFloor<destination) {
			for(int i=initialFloor;i<=destination;i++) {
				System.out.println("Current Floor : "+i);
			}
		}



	}

	@Override
	public void addRequest(Lift lift, int floor) {
		lift.addRequest(floor);
		System.out.println("Request Added");
		System.out.println(lift.getRequest());
		int newRequest=0;
		for(int i=0;i<lift.getRequest().size();i++) {
			if(lift.getRequestByFloor(i)!=0) {
				newRequest=lift.getRequestByFloor(i);
				lift.clearRequests(0);
				break;
			}
		}
		if(lift.getPosition()==newRequest)
			System.out.println("You are in he same Floor");
		else {
			this.move(lift,newRequest);
		}
	}


}

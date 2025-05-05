package com.LiftService;

import com.Entity.Lift;

public interface LiftService {

	void move(Lift lift,int floor);
	
	void addRequest(Lift lift,int floor);
}

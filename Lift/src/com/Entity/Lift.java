package com.Entity;

import java.util.ArrayList;
import java.util.List;

public class Lift {
	private int id;
	private int position=1;
	private int lastPosition=1;
	private List<Integer> Requests=new ArrayList<Integer>();
	
	public int getId() {
		return id;
	}
	public Lift(int id) {
		this.id=id;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public int getLastPosition() {
		return lastPosition;
	}
	public void setLastPosition(int lastPosition) {
		this.lastPosition = lastPosition;
	}
	public void addRequest(int floor) {
		Requests.add(floor);
	}
	public List getRequest() {
		return Requests;
	}
	public int getRequestByFloor(int floor){
		return Requests.get(floor);
	}
	public void clearRequests(int floor) {
		Requests.remove(floor);
	}
	
}
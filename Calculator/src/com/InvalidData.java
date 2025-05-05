package com;

public class InvalidData extends Exception{

	private String msg;
	InvalidData(String msg){
		this.msg=msg;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = getMessage();
	}
	
	
}



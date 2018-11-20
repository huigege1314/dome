package com.spring;

public class HelloSpring {
	//HelloSpringµƒ Ù–‘
	private String who = null;
	
	public void print(){
		System.out.println("Hello," + this.getWho() + "!!");
	}
	

	/**
	 * @return the who
	 */
	public String getWho() {
		return who;
	}

	/**
	 * @param who the who to set
	 */
	public void setWho(String who) {
		this.who = who;
	}
	
	
}

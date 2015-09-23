package com.mtsmda.java.simple.exaptions;

public class Run {

	public static void main(String[] args) {
		try{
//			Integer.parseInt("15.5");
			Integer.parseInt(null);	
		}
		catch(Exception e){
			System.out.println(e.getMessage() + " - NAME - " + e.getClass().getName());
		}
		
	}

}

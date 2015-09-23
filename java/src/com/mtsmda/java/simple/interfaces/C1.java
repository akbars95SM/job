package com.mtsmda.java.simple.interfaces;

public class C1 implements I1, I2{
	
	@Override
	public void print(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		I1 i1 = new C1();
		i1.print("S");
	}
	
}
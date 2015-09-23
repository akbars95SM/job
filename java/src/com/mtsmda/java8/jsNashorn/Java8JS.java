package com.mtsmda.java8.jsNashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Java8JS {
	
	public static void main(String[] args) {
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine engineByName = scriptEngineManager.getEngineByName("nashorn");
		
		String name = "Mahesh";
		Integer result = null;
		
		try{
			engineByName.eval("print('" + name + "')");
			result = (Integer) engineByName.eval("10 + 2");
		}
		catch(Exception e){
			System.out.println(e.getMessage() + "______ " + e.getClass().getName());
		}
		
		System.out.println("result = " + result);
		
	}
	
}
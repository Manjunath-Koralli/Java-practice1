package com.ex.garbagecollection;

public class RuntimeEx {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Runtime run = Runtime.getRuntime();
		System.out.println(run);
		System.out.println(run.freeMemory());
		run.exec("notepad");
	}

}

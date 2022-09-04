package com.demo.access;

public class Access {

	int def = 10;
	private int pri = 20;
	public  int pub = 30;
	protected int prot = 40;
	
	public void getDef()
	{
		System.out.println(def);
	}
	
	public void getPri()
	{
		System.out.println(pri);
	}
	
	public void getProt()
	{
		System.out.println(prot);
	}
	
	
}

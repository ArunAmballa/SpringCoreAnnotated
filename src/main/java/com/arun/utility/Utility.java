package com.arun.utility;

import org.springframework.stereotype.Component;

@Component
public class Utility 
{
	
	public Utility()
	{
		System.out.println("utitlity Object is Created");
		
	}
	
	public boolean mail()
	{
		System.out.println("Sending Mail ");
		return true;
	}
	

}

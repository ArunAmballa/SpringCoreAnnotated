package com.arun.service;

import org.springframework.stereotype.Component;

@Component
public class Service 
{
	
	public Service()
	{
		System.out.println("Service Object");
	}
	
	public boolean service()
	{
		System.out.println("Some Service is Performed");
		return true;
	}

}

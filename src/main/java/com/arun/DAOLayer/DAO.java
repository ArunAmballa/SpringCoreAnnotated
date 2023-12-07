package com.arun.DAOLayer;

import org.springframework.stereotype.Repository;

@Repository
public class DAO 
{
	
	public DAO()
	{
		System.out.println("DAO Obj is Created");
	}
	
	public boolean save()
	{
		System.out.println("Data is Saved");
		return true;
	}
}

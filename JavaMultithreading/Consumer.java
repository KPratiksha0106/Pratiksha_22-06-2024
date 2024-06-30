package com.JavaMultithreading;

import java.security.CodeSource;

public class Consumer extends Thread
{
	
	private final SharedResource resource;

	public Consumer(SharedResource resource2) 
	{
		this.resource = resource2;
	}
	
	public void run()
	{
		try
		{
			Thread.sleep(700);
		}
		catch(InterruptedException e)
		{
			Thread.currentThread().interrupt();
		}
	}
	

}

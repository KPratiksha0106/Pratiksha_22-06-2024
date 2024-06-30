package com.JavaMultithreading;

public class Producer extends Thread
{
	
	private final SharedResource resource;

	public Producer(SharedResource resource) 
	{
		this.resource = resource;
	}
	
		// TODO Auto-generated constructor stub
	

	public void run()
	{
		try
		{
			resource.consume();
			Thread.sleep(700);
		}
		catch(InterruptedException e)
		{
			Thread.currentThread().interrupt();
		}
	}
	

}

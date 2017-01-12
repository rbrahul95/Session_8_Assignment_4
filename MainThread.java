/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Rahul
 */
public class MainThread extends Thread {
	  MainThread()
	   {
	     super("my extending thread");
	     System.out.println("my thread created" + this);
	     start();
	   }	
	public void run(){
	
		try{
			for(int i=0;i<10;i++){
				System.out.println("Printing the count : "+i);
				sleep(1000);
			}
		}
		catch(IllegalThreadStateException | InterruptedException e)
			{
			e.printStackTrace();
			}
	
	}
}
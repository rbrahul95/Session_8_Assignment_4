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
public class Second {

	public static void main(String[] args) {
		MainThread s=new MainThread();
		try{
			while(s.isAlive()){
				System.out.println("This is the main Thread");
				Thread.sleep(1500);
			}
		}
		catch(IllegalThreadStateException | InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
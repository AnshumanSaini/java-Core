package com.hughes.Threading;

class UserThread extends Thread
{
	public void run(){
		System.out.println("Thread Started"+" "+this.getName());
		//any thread we create will have a name and id by JVM.
	}
}

public class Test1 {

	public static void main(String[] args) {
		UserThread obj=new UserThread();
		obj.setName("first");
		obj.start(); // start method will internally call on backend...
		UserThread obj1=new UserThread();
		obj1.start();

	}

}

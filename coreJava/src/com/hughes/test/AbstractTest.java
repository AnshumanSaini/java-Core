package com.hughes.test;

abstract class DataTransfer
{
	public abstract void sendSMS();
	public abstract void sendEmail();
	public abstract void sendPushNotification();
	
	public void display() {
		System.out.println("Message delivered!!!");
	}
}

//class Test extends DataTransfer
//{
//	public void sendSMS()
//	{
//		System.out.println("sendSMS");
//	}
//	
//	public void sendEmail()
//	{
//		System.out.println("Send Email");
//	}
//	
//	public void sendPushNotification()
//	{
//		System.out.println("send push notification");
//	}
//}

public class AbstractTest extends DataTransfer
{

	public static void main(String[] args) {
		DataTransfer obj=new AbstractTest();
		obj.sendEmail();
	}
	
	public void sendSMS()
	{
		System.out.println("sendSMS");
	}
	
	public void sendEmail()
	{
		System.out.println("Send Email");
	}
	
	public void sendPushNotification()
	{
		System.out.println("send push notification");
	}

}
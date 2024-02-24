package com.hughes.assignment;

class Account{
	private String accountID;
	private String accountName;
	private String Address;
	public int depositAmount;
	
	public void showDetails(){
		System.out.println(accountID+"\n"+accountName+"\n"+Address+"\n"+depositAmount);
	}
	
	public void getDetails(int amt, String add, String name, String id){
		String prefix=id.substring(0, 7);
		String suffix=id.substring(8);
		for(char c : prefix.toCharArray())
		{
			if(c<'0' || c>'9') {
				System.out.println("INVALID ID");
			}
		}
		
		for(char c : suffix.toCharArray())
		{
			if(c<'A' || c>'Z') {
				System.out.println("INVALID ID");
			}
		}
		
		accountID=id;
		accountName=name;
		Address=add;
		depositAmount=amt;
	}
}

class Loan extends Account{
	private String loanID;
	private String loanType;
	public int loanAmount;
	
	public void getLoan(int amt, String type, String id) {
		if(type.equalsIgnoreCase("home") || type.equalsIgnoreCase("car"))
		{
			loanAmount+=amt;
			loanType=type;
			loanID=id;
		}
		else System.out.println("Cannot provide loan on the given details");
	}
	
	public void showLoanDetails()
	{
		System.out.println(loanID+"\n"+loanType+"\n"+loanAmount);
	}
}

class Transaction extends Loan{
	
	public void depositAmount(int amt){
		super.depositAmount+=amt;
	}
	
	public int withdrawAmount(int amt){
		if(super.depositAmount<amt){
			System.out.println("Insufficient Balance!!!");
			return -1;
		}
		else {
			super.depositAmount-=amt;
			return amt;
		}
	}
	
	public void payLoan(int amt) {
		if(super.loanAmount<amt) {
			amt-=super.loanAmount;
			super.loanAmount=0;
			super.depositAmount+=amt;
			System.out.println("Not enough loan rest of the money is deposited into acccount");
		}
		else super.loanAmount-=amt;
	}
	
	public void showAccountDetails() {
		super.showDetails();
		super.showLoanDetails();
	}
}

public class CoreJava_Assessment1 {

	public static void main(String[] args) {
		Transaction[] arr=new Transaction[10];
		arr[0]=new Transaction();
		arr[0].getDetails(2000,"delhi","abc","1234567-ASDF");
		
		arr[1]=new Transaction();
		arr[1].getDetails(3000,"haryana","def","2234567-ASDF");
		
		arr[2]=new Transaction();
		arr[2].getDetails(4000,"ladkah","ghi","3234567-ASDF");
		
		arr[3]=new Transaction();
		arr[3].getDetails(5000,"Jammu","jkl","4234567-ASDF");
		
		arr[4]=new Transaction();
		arr[4].getDetails(6000,"kashmir","mno","5234567-ASDF");
		
		arr[5]=new Transaction();
		arr[5].getDetails(7000,"delhi","pqr","6234567-ASDF");
		
		arr[6]=new Transaction();
		arr[6].getDetails(8000,"Mumbai","stu","7234567-ASDF");
		
		arr[7]=new Transaction();
		arr[7].getDetails(9000,"Karnal","vwx","8234567-ASDF");
		
		arr[8]=new Transaction();
		arr[8].getDetails(10000,"Chennai","ghj","9234567-ASDF");
		
		arr[9]=new Transaction();
		arr[9].getDetails(11000,"Himachal Pardesh","yyt","1334567-ASDF");
		
		
		arr[1].depositAmount(1000);
		arr[1].withdrawAmount(100);
		arr[1].showAccountDetails();
		

	}

}

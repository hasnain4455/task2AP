package task2;

import java.util.*;

public class Account {
	
		protected String name;
		protected String address;
		protected String phoneNumber;
		protected int accountNumber;
		protected int balance;
		protected String date;
		protected int transitions=0;
		
		public Account(String nam,String a, String p,int n,int b, String d) {
			name=nam;
			address=a;
			phoneNumber=p;
			accountNumber=n;
			balance=b;
			date=d;
			transitions=0;
		}
		 public void setName(String n) {
				name=n;
		 }
		 public void setAddress(String add) {
			 address=add;
		 }
		 public void setPhoneNumber(String num) {
			 phoneNumber=num;
		 }
		 public void setAccountNumber(int num) {
			 accountNumber=num;
		 }
		 public void setBalance(int b) {
			 balance=b;
		 }
		 public void setDAte(String d) {
			 date=d;
		 }
		public String getName() {
			return name;
		}
		public String getAddress() {
			return address;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public int getAccountNumber() {
			return accountNumber;
		}
		public int getBalance() {
			return balance;
		}
		public String getDate() {
			return date;
		}
		public int getTransitions() {
			return transitions;
		}

		public void makeDeposit(int n) {
			
			//System.out.println("Enter the amount you want to Deposit: ");
			//Scanner inp=new Scanner(System.in);
			//int n=inp.nextInt();
			if(n<=0) {
				System.out.println("0 or negative balance cannot be added.\n");
			}
			else {
				balance = balance+n;
				System.out.println("New Balance is: "+balance);
			}
		}
		public void makeWithdrawal(int n ) {
			
			//System.out.println("Enter the amount you want to Withdraw: ");
			//Scanner inp=new Scanner(System.in);
			//int n=inp.nextInt();
			if(n<=0) {
				System.out.println("0 or negative balance cannot be withdrawed.\n");
			}
			else {
				balance = balance-n;
				System.out.println("New Balance is: "+balance);
				transitions++;
			}
		}
		public void checkBalance() {
			System.out.println("Balance is: "+balance);
		}
		public void transferAmount(int num,int n) {
			//System.out.println("Enter the Account Number of the Person: ");
			//Scanner inp1=new Scanner(System.in);
			//int an=inp1.nextInt();
			//System.out.println("Enter the Amount: ");
			//Scanner inp=new Scanner(System.in);
			//int n=inp.nextInt();
			if(n<=0) {
				System.out.println("0 or negative balance cannot be transfered.\n");
			}
			else {
				balance = balance-n;
				System.out.println("Transaction Successful.\n New Balance is: "+balance);
				transitions++;
			}
		}
		public int calculateZakat() {
			if(balance<=20000) {
				System.out.println("Zakat cannot be calculated.");
				return 0;
			}
			else {
				int z=(int) (balance*2.5);
				z=z/100;
				System.out.println("Zakat is: "+z);
				return z;
			}
		}
}

package Bank_app;
import java.util.Scanner;
class Details {
String Acc_No;
String name;
String Acc_type;
long balance;
Scanner sc = new Scanner(System.in);
//To open new account
public void Open_Account() {
System.out.println("Enter Acnt no : ");
Acc_No = sc.next();
System.out.println("Enter Name : ");
name = sc.next();
System.out.println("Enter Acnt type : ");
Acc_type = sc.next();
System.out.println("Enter Balance : ");
balance = sc.nextLong();
}
//Display the account details
public void show() {
System.out.println("Account no: " +Acc_No);
System.out.println("Name of the acnt holder: " +name);
System.out.println("Account type: " +Acc_type);
System.out.println("Balance: " +balance);
}
//to deposit money
public void deposit() {
	long amt;
	System.out.println("Enter the amount you want to deposit : " );
	amt = sc.nextLong();
	balance = balance +amt;
	System.out.println("Success..!");
	System.out.println("Remaining Balance : "+balance );
	}
	//to withdrawal money
	public void withdrawal() {
	long amt;
	System.out.println("Enter the amount you want to withdrawal : " );
	amt = sc.nextLong();
	if(balance>=amt) {
	balance = balance - amt;
	System.out.println("Balance amount : " +balance );}
	else {
	System.out.println("Insufficient Balance : " +amt+ "\n Transaction Failed...!" );
	}
	}
	//to search account number
	public boolean search(String acnt_no) {
		if(Acc_No.equals(acnt_no)) {
			show();
			return(true);
			}
			return(false);
			}
			}
			public class Bank_details{
			public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
			//To create initial account
			System.out.println("How many customers you want to input ?");
			int n = sc.nextInt();
			Details D[] = new Details[n];
			for(int i =0;i<D.length;i++) {
			D[i]= new Details();
			D[i].Open_Account();
			}
			int ch;
			do{
			System.out.println("\n **Banking Application** ");
			System.out.println("1.Display all account details \n 2.Search by account number \n 3.Deposit the amount \n 4.Withdraw the amount \n5.Exit\n");
			System.out.println("Enter your choice");
			 ch= sc.nextInt();
			 switch(ch) {
			 case 1 :
			 for(int i=0;i<D.length;i++) {
			 D[i].show();
			 }
			 break;
			 case 2:
			 System.out.println("Enter account no you want to search");
			 String acnt_no = sc.next();
			 boolean found = false;
			 for(int i=0;i<D.length;i++) {
			 found = D[i].search(acnt_no);
			 if(found) {
			 break;
			 }
			 }
			 if(!found) {
			 System.out.println("failed! Account doesn't exist !! ");

			 }
			 break;
			 case 3:
				 System.out.println("Enter account no :");
				 acnt_no = sc.next();
				 found = false;
				 for(int i=0;i<D.length;i++) {
				 found = D[i].search(acnt_no);
				 if(found) {
				 D[i].deposit();
				 break;
				 }

				 }
				 if(!found) {
				 System.out.println("failed! Account doesn't exist !!");
				 }
				break;
				 case 4:
				 System.out.println("Enter account no :");
				 acnt_no = sc.next();
				 found = false;
				 for(int i=0;i<D.length;i++) {
				 found = D[i].search(acnt_no);
				 if(found) {
				 D[i].withdrawal();
				 break;
				 }
				 }
				 if(!found) {
				 System.out.println("failed! Account doesn't exist !!");
				 }
				break;

				 case 5 :
				 System.out.println("See you soon..!!");
				 break;

				 }
				}
				while(ch!=5);
				 }
			}





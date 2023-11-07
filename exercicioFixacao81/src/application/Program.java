package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Bank account;
		System.out.printf("Enter account Number: ");
		int number = scan.nextInt();
		System.out.printf("Enter account Holder: ");
		scan.nextLine();
		String holder = scan.nextLine();
		System.out.printf("Is there an initial deposit ? (y/n)? ");
		String response = scan.nextLine();
		if(response.equals("y")) {
			System.out.printf("Enter initial deposit value: ");
			double initDeposit = scan.nextDouble();
			account = new Bank(number,holder , initDeposit);
		}else {
			account = new Bank(number,holder);
		}
		
		System.out.print("Account data: ");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double amount = scan.nextDouble();
		account.deposit(amount);
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		amount = scan.nextDouble();
		account.withdraw(amount);
		System.out.println(account);
		
		
		
		
		scan.close();
		
	
	}

}

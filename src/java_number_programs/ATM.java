package java_number_programs;
import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {

		Scanner ur = new Scanner(System.in);

		double bal = 5000, withdraw, deposit;

		while (true) {

			System.out.println("welcome!!");
			System.out.println("1.  for Withdraw");
			System.out.println("2.  for Deposit");
			System.out.println("3.  for Check Balance");
			System.out.println("4.  for EXIT");
			System.out.print("choose the operation you want to perform : ");

			int user = ur.nextInt();

			switch (user) {
			case 1:
				System.out.print("enter amount to withdraw : ");
				withdraw = ur.nextDouble();

				if (bal > withdraw)
					bal -= withdraw;
				System.out.println("please collect your amount");
				break;
			case 2:
				System.out.println("enter amount to deposit : ");
				deposit = ur.nextDouble();
				bal += deposit;
				System.out.println("your amount has been deposited");
				break;
			case 3:
				System.out.println("fletching your amount");
				System.out.println("your balance : " + bal);
				break;
			case 4:
				System.out.println("thank you visit again");
				ur.close();
				System.exit(0);
			default:
				System.out.println("invalid value");
			}
		}
	}
}
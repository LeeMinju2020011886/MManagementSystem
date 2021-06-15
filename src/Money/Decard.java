package Money;

import java.util.Scanner;

public class Decard extends DepositMoney implements Moneyinput{
	
	public Decard(Paykind kind) {
		super(kind);
	}
	
	protected String autoCategory;
	protected String autoMemo;
	
	public void getUserInput(Scanner input) {
		System.out.print("Unique Number : ");
		int uniNum = input.nextInt();
		this.setUniNum(uniNum);
		
		System.out.print("Amount : ");
		int amount = input.nextInt();
		this.setAmount(amount);
		
		System.out.print("Category : ");
		String category = input.next();		
		this.setCategory(category);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have a memo? (Y/N) ");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("memo: ");
				String memo = input.next();
				this.setMemo(memo);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setMemo("");
				break;
			}
			else {
			}
		
		}
		
		answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do it has a auto memo? (Y/N) ");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("auto memo: ");
				String memo = input.next();
				this.setMemo(memo);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setMemo("");
				break;
			}
			else {
			}
		}
	}
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Cash:
			skind = "Cash";
			break;
		case Card:
			skind = "Card";
			break;
		default:
			
		}
		System.out.println("kind:" + skind + "Unique Number: " + UniNum + " Amount: "+ Amount +" Category: "+ Category  + "Auto Category: "+ Category+  "Memo: "+ Memo + "Auto Memo:" + Memo);
	}
}

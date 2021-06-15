import java.util.ArrayList;
import java.util.Scanner;

import Money.DeCash;
import Money.Decard;
import Money.DepositMoney;
import Money.Moneyinput;
import Money.Paykind;
import Money.WithdrawalMoney;

public class MoneyManage {
	ArrayList<Moneyinput> depositmoneys = new ArrayList<Moneyinput>();
	ArrayList<WithdrawalMoney> withdrawalmoneys = new ArrayList<WithdrawalMoney>();
	int answer = 0;
	Scanner input;
	MoneyManage(Scanner input){
		this.input = input;
	}
	
	public void addDeposit() {
		int kind = 0;
		Moneyinput moneyinput;
		while(kind != 1 && kind != 2) {
			System.out.println("<Deposit>");
			System.out.println("1 for cash");
			System.out.println("2 for card");
			System.out.print("Select num for payment kind between 1 and 2: ");
			kind = input.nextInt();
			if (kind == 1) {
				moneyinput = new DeCash(Paykind.Cash);
				moneyinput.getUserInput(input);
				depositmoneys.add(moneyinput);
				break; 
			}
			else if (kind == 2) {
				moneyinput = new Decard(Paykind.Card);
				moneyinput.getUserInput(input);
				depositmoneys.add(moneyinput);
				break;
			}
			else {
				System.out.print("Select num for payment kind between 1 and 2: ");
			}
		} 
	}
	
	public void addWithdrawal() {  //2번
		
		System.out.println("<Withdrawal>");
		System.out.print("Unique Number : ");
		int UniNum = input.nextInt();
		System.out.print("Amount : ");
		int Amount = input.nextInt();
		System.out.print("Category : ");
		String Category = input.next();		
		System.out.print("memo: ");
		String Memo = input.next();
		
		WithdrawalMoney withdrawalmoney = new WithdrawalMoney(UniNum, Category, Amount, Memo);
		withdrawalmoneys.add(withdrawalmoney);
	}
	
	public void viewdeals() {
		System.out.println("<View deals>"); 
		
		System.out.println("1. Deposit\n2. Withdrawal");
		answer = input.nextInt();
		if(answer == 1) {
			System.out.println("# of registered money: " + depositmoneys.size());
			for (int i =0; i<depositmoneys.size(); i ++) {
				depositmoneys.get(i).printInfo();
			}
		}
		if(answer == 2) {
			for (int i =0; i<withdrawalmoneys.size(); i ++) { 
				withdrawalmoneys.get(i).printInfo();
			}
		}
	}
	
	public void editSystem() {
		System.out.println("1. Edit Deposit\n2. Edit Withdrawal");
		answer = input.nextInt();
		if(answer == 1) {
			System.out.print("Unique Number: ");
			int uninum = input.nextInt();
			for (int i =0; i<depositmoneys.size(); i ++) {
				Moneyinput moneyinput = depositmoneys.get(i);
				if (moneyinput.getUniNum() == uninum) {
					int num = -1;
					while(num != 5) {
						System.out.println("*** Money Management System Menu ***");
						System.out.println("1. Unique Number");		
						System.out.println("2. Amount");	
						System.out.println("3. Category");	
						System.out.println("4. Memo");
						System.out.println("5. Exit");			
						System.out.print("Select one number between 1 - 5:");
						num = input.nextInt();
						System.out.println();
						if (num == 1) {
							System.out.print("Unique Number: ");
							int uniNum = input.nextInt();
							moneyinput.setUniNum(uniNum);
						}
						else if (num == 2) {
							System.out.print("Amount: ");
							int amount = input.nextInt();
							moneyinput.setAmount(amount); ////////여기 주의
						}
						else if (num == 3) {
							System.out.print("Category: ");
							String category= input.next();
							moneyinput.setCategory(category);
						}
						else if (num == 4) {
							System.out.print("Memo: ");
							String memo = input.next();
							moneyinput.setMemo(memo);
						}
						else {
							continue;
						}
					}
					break;
				}
			}
		}
				
		if(answer == 2) {
			System.out.print("Unique Number: ");
			int uninum = input.nextInt();
			for (int i =0; i<withdrawalmoneys.size(); i ++) {
				WithdrawalMoney withdrawalmoney = withdrawalmoneys.get(i);
				if (withdrawalmoney.getUniNum() == uninum) {
					int num = -1;
					while(num != 5) {
						System.out.println("*** Money Management System Menu ***");
						System.out.println("1. Unique Number");		
						System.out.println("2. Amount");	
						System.out.println("3. Category");	
						System.out.println("4. Memo");
						System.out.println("5. Exit");			
						System.out.print("Select one number between 1 - 5:");
						num = input.nextInt();
						System.out.println();
						if (num == 1) {
							System.out.print("Unique Number: ");
							int uniNum = input.nextInt();
							withdrawalmoney.setUniNum(uniNum);	
						}
						else if (num == 2) {
							System.out.print("Amount: ");
							int amount = input.nextInt();
							withdrawalmoney.setAmount(amount);
						}
						else if (num == 3) {
							System.out.print("Category: ");
							String category= input.next();
							withdrawalmoney.setCategory(category);
						}
						else if (num == 4) {
							System.out.print("Memo: ");
							String memo = input.next();
							withdrawalmoney.setCategory(memo);
						}
						else {
							continue;
						}
					}
					break;
				}
			}
		}
	}
	
	public void deletedeal() {
		System.out.println("<Edit System>");
		System.out.println("1. Edit Deposit\n2. Edit Withdrawal");
		answer = input.nextInt();
		if(answer == 1) {
			System.out.print("Unique Number: ");
			int uninum = input.nextInt();
			int index = -1;
			for (int i =0; i<depositmoneys.size(); i ++) {
				if (depositmoneys.get(i).getUniNum() == uninum) {
					index = i;
					break;
				}
			}
			
			if (index >= 0) {
				depositmoneys.remove(index);
				System.out.println("the deal " + uninum + "is deleted");
			}
			else {
				System.out.println("the deal has not been registered");
			}
		}
		if(answer == 2) {
			System.out.print("Unique Number: ");
			int uninum = input.nextInt();
			int index = -1;
			for (int i = 0; i < withdrawalmoneys.size(); i++) {
				if (withdrawalmoneys.get(i).getUniNum() == uninum) {
					index = i;
					break;
				}
			}
			if (index >= 0) {
				withdrawalmoneys.remove(index);
				System.out.println("the deal " + uninum + "is deleted");
			}
			else {
				System.out.println("the deal has not been registered");
			}
		}
	}


}

package Money;

import java.util.Scanner;

import exception.AmountFormatException;

public class DeCash extends DepositMoney{
	
	public DeCash(Paykind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setUniNum(input);
		setAmount(input);
		setCategory(input);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have a memo? (Y/N) ");
			answer = input.next().charAt(0);
			try {
				if (answer == 'y' || answer == 'Y') {
					setMemo(input);
					break;
				}
				else if (answer == 'n' || answer == 'N') {
					this.setMemo("");
					break;
				}
				else {
				}
			}
			catch(AmountFormatException e) {
				System.out.println("Incorrect Memo Format. Put the memo that contains # ");
			}
		}
	}
	
	public void printInfo() {
		String skind = getKindStirng();
		System.out.println("kind:" + skind + "Unique Number: " + this.UniNum + " Amount: "+ this.Amount +" Category: "+ this.Category  +" Memo: "+ this.Memo);
	}
}

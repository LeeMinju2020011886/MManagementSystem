package Money;

import java.io.Serializable;
import java.util.Scanner;

import exception.AmountFormatException;

public abstract class DepositMoney implements Moneyinput, Serializable {			//abstract >> Deposit이라는 객체를 생성하지 않는다.
	/**
	 * 
	 */
	private static final long serialVersionUID = -4517492711906983620L;
	protected Paykind kind = Paykind.Cash;  
	protected String Category;
	protected int UniNum;
	protected int Amount;
	protected String Memo;
	
	public DepositMoney() {
	}
	
	public DepositMoney(Paykind kind) {
		this.kind = kind;
	}
	
	public DepositMoney(String category, int amount, int uninum) {
		this.Category = category;
		this.Amount = amount;
		this.UniNum = uninum;
	}
	public DepositMoney(String category, int amount, String memo, int uninum) {
		this.Amount = amount;
		this.Category = category;
		this.Memo = memo;
		this.UniNum = uninum; 
	}
	public DepositMoney(Paykind kind, String category, int amount, String memo, int uninum) {
		this.kind = kind;
		this.Amount = amount;
		this.Category = category;
		this.Memo = memo;
		this.UniNum = uninum; 
	} 
	
	public Paykind getKind() {
		return kind;
	}

	public void setKind(Paykind kind) {
		this.kind = kind;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public int getUniNum() {
		return UniNum;
	}

	public void setUniNum(int uniNum) {
		UniNum = uniNum;
	}

	public int getAmount() {
		return Amount;
	}

	public void setAmount(int amount) {
		Amount = amount;
	}

	public String getMemo() {
		return Memo;
	}

	public void setMemo(String memo) throws AmountFormatException {
		if (!memo.contains("#") && !memo.equals("")) {
			throw new AmountFormatException();
		}
		Memo = memo;
	}


	public abstract void printInfo(); 
	
	public void setUniNum(Scanner input) {
		System.out.print("Unique Number: ");
		int uniNum = input.nextInt();
		this.setUniNum(uniNum);
	}
	
	public void setAmount(Scanner input) {
		System.out.print("Amount: ");
		int amount = input.nextInt();
		this.setAmount(amount);
	}
	
	public void setCategory(Scanner input) {
		System.out.print("Category: ");
		String category= input.next();
		this.setCategory(category);
	}
	
	public void setMemo(Scanner input) { 
		String memo = "";
		while (!memo.contains("#")) {
			System.out.print("Memo: ");
			memo = input.next();
			try {
				this.setMemo(memo);
			} catch (AmountFormatException e) {
				System.out.println("Incorrect Memo Format. Put the memo that contains # ");
				
			}
		}
	}
	public String getKindStirng() {
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
		return skind;
	}

}


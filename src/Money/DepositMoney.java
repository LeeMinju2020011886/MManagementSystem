package Money;

import java.util.Scanner;

public class DepositMoney {

	protected Paykind kind = Paykind.Card;
	protected String Category;
	protected int UniNum;
	protected int Amount;
	protected String Memo;
	
	public DepositMoney() {
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

	public void setMemo(String memo) {
		Memo = memo;
	}

	
	public void printInfo() {
		System.out.println("Unique Number: " + this.UniNum + " Amount: "+ this.Amount +" Category: "+ this.Category  +" Memo: "+ this.Memo);
	}
	
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
		
		System.out.print("memo: ");
		String memo = input.next();
		this.setMemo(memo);
	}  


}


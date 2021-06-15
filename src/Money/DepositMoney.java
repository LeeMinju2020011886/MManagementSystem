package Money;

import java.util.Scanner;

public abstract class DepositMoney {			//abstract >> Deposit이라는 객체를 생성하지 않는다.
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

	public void setMemo(String memo) {
		Memo = memo;
	}


	public abstract void printInfo(); 
	



}

package Money;

public class WithdrawalMoney {
	
	public WithdrawalMoney() {
	}
	
	public WithdrawalMoney(int uninum, String category, int amount) {
		this.Category = category;
		this.Amount = amount;
		this.UniNum = uninum;
	}
	public WithdrawalMoney(int uninum, String category, int amount, String memo) {
		this.Category = category;
		this.Amount = amount;
		this.Memo = memo;
		this.UniNum = uninum;
	}
	
	protected Paykind kind = Paykind.Card;
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

	protected String Category;
	protected int UniNum;
	protected int Amount;
	protected String Memo;
	
	public void printInfo() {
		System.out.println("Unique Number: " + this.UniNum + " Category: "+ this.Category +" Amount: "+ this.Amount +" Memo: "+ this.Memo );
	}

}

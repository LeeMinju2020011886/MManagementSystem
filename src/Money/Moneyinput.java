package Money;

import java.util.Scanner;

public interface Moneyinput {
	
	public int getUniNum();
	
	public void setUniNum(int uniNum);
	
	public void setAmount(int amount);

	public void setCategory(String category);
	
	public void setMemo(String memo);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
}

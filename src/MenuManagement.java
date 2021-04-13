import java.util.Scanner;

public class MenuManagement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MoneyManage moneyManage = new MoneyManage(input);
		
		int num = -1;
		while (num != 6) {
			System.out.println("*** Money Management System Menu ***");
			System.out.println("1. Deposit");		
			System.out.println("2. Withdrawal");	
			System.out.println("3. View deals");	
			System.out.println("4. Edit System");
			System.out.println("5. delete deal");
			System.out.println("6. Exit");			
			System.out.print("Select one number between 1 - 6:");
			num = input.nextInt();
			System.out.println();
			if (num == 1) {
				moneyManage.addDeposit();
			}
			else if (num == 2) {
				moneyManage.addWithdrawal();
			}
			else if (num == 3) {
				moneyManage.viewdeals();
			}
			else if (num == 4) {
				moneyManage.editSystem();
			}
			else if (num == 5) {
				moneyManage.deletedeal();
			}
			else {
				continue;
			}
		}
	}	
}
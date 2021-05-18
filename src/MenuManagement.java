import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManagement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MoneyManage moneyManage = new MoneyManage(input);
		
		selectMenu(input, moneyManage);
	}
	
	public static void selectMenu(Scanner input, MoneyManage moneyManage) {
		int num = -1;
		while (num != 6) {
			
			try {
				showMenu();			
				num = input.nextInt();
				switch(num) {
				case 1:
					moneyManage.addDeposit();
					break;
				case 2:
					moneyManage.addWithdrawal();
					break;
				case 3:
					moneyManage.viewdeals();
					break;
				case 4:
					moneyManage.editSystem();
					break;
				case 5:
					moneyManage.deletedeal();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 6");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("*** Money Management System Menu ***");
		System.out.println("1. Deposit");		
		System.out.println("2. Withdrawal");	
		System.out.println("3. View deals");	
		System.out.println("4. Edit System");
		System.out.println("5. delete deal");
		System.out.println("6. Exit");			
		System.out.print("Select one number between 1 - 6:");
	
	}
}

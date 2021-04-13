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
	
	
			/*switch(num) {
				case 1:
					int num2 = 0;
					@@@@@@@@@@@@@@@@@@@while (num2 != 2) {
						System.out.println("<Amount>");
						System.out.print("Name : ");
						String DepositName = input.next();
						System.out.print("Amount : ");
						int DepositAmount = input.nextInt();
						System.out.println("Continue?");
					@@@@@@@@@@@@@@@@@@@System.out.println("1. Yes");
					@@@@@@@@@@@@@@@@@@@System.out.println("2. No");
					@@@@@@@@@@@@@@@@@@@num2 = input.nextInt();			//@는 나중에 추가할 거!! 표시
					}
					break;
				case 2:
				System.out.println("<Withdrawal>");
				System.out.print("Name : ");
				String WithdrawalName = input.next();
				System.out.print("Amount : ");
				int WithdrawalAmount = input.nextInt();
					break;
				case 3:
				case 4:
				case 5:
			}*/

}

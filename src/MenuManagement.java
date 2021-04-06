import java.util.Scanner;

public class MenuManagement {
	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		MoneyManage moneyManage = new MoneyManage(input);
		// 처음에 현재 잔고를 적는 것을 시작으로..
		while (num != 5) {
			System.out.println("1. Deposit");		
			System.out.println("2. Withdrawal");	
			System.out.println("3. View Balance");	
			System.out.println("4. Edit System");	
			System.out.println("5. Exit");			
			System.out.print("Select one number between 1 - 5:");
			num = input.nextInt();
			System.out.println();
			if (num == 1) {
				moneyManage.addDeposit();
			}
			if (num == 2) {
				moneyManage.addWithdrawal();
			}
			if (num == 3) {
				moneyManage.ViewBalance();
			}
			if (num == 4) {
				moneyManage.EditSystem();
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

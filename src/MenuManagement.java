import java.util.Scanner;

public class MenuManagement {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner input = new Scanner(System.in);
		// ó���� ���� �ܰ� ���� ���� ��������..
		while (num != 6) {
			System.out.println("1. Deposit");		//����
			System.out.println("2. Withdrawal");	//���
			System.out.println("3. View Balance");	//�ܰ� Ȯ��
			System.out.println("4. Edit System");	//����(�̸�, �޸� ��)
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");			
			System.out.print("Select one number between 1 - 5:");
			num = input.nextInt();
			System.out.println();
			if (num == 1) {
				addDeposit();
			}
			if (num == 2) {
				addWithdrawal();
			}
			if (num == 3) {
				ViewBalance();
			}
			if (num == 4) {
				EditSystem();
			}
		}
	}	
	public static void addDeposit() {
		System.out.println("<Deposit>");
		Scanner input = new Scanner(System.in);
		System.out.print("Amount : ");
		int DepositAmount = input.nextInt();
		System.out.print("Category : ");
		String DepositName = input.next();		//�޴��� ���� ��� �ȵǷ���?
		System.out.print("memo: ");
		String DepositMemo = input.next();
	}
	
	public static void addWithdrawal() {
		System.out.println("<Withdrawal>");
		Scanner input = new Scanner(System.in);
		System.out.print("Amount : ");
		int WithdrawalAmount = input.nextInt();
		System.out.print("Category : ");
		String WithdrawalName = input.next();		//�޴��� ���� ��� �ȵǷ���?
		System.out.print("memo: ");
		String WithdrawalMemo = input.next();
	}
	
	public static void ViewBalance() {
		System.out.println("<View Balance>");
	}
	
	public static void EditSystem() {
		System.out.println("<Edit System>");
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
					@@@@@@@@@@@@@@@@@@@num2 = input.nextInt();			//@�� ���߿� �߰��� ��!! ǥ��
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

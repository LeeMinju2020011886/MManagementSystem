import java.util.Scanner;

public class MenuManagement {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner input = new Scanner(System.in);
		
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
			
			switch(num) {
				case 1:
					int num2 = 0;
					while (num2 != 2) {
						System.out.println("<Amount>");
						System.out.print("Name : ");
						String DepositName = input.next();
						System.out.print("Amount : ");
						int DepositAmount = input.nextInt();
						System.out.println("Continue?");
						System.out.println("1. Yes");
						System.out.println("2. No");
						num2 = input.nextInt();			//int num2 = �� �� �ȵƴ�����??
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
			}
		}
	}
}

import java.util.Scanner;

public class MenuManagement {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {
			System.out.println("1. Deposit");		//예금
			System.out.println("2. Withdrawal");	//출금
			System.out.println("3. View Balance");	//잔고 확인
			System.out.println("4. Edit System");	//수정(이름, 메모 등)
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");			
			System.out.print("Select one number between 1 - 5:");
			num = input.nextInt();
			System.out.println();
			if (num == 1) {
				System.out.print("Name : ");
				String DepositName = input.next();
				System.out.print("Amount : ");
				int DepositAmount = input.nextInt();
			}
		}
		
	}

}

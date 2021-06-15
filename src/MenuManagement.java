import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManagement {
	private static final Object MoneyManage = null;
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		MoneyManage moneyManage = getObject("moneymanager.ser");
		if (moneyManage == null) {
			moneyManage = new MoneyManage(input);
		}
		
		WindowFrame frame = new WindowFrame(moneyManage);
		selectMenu(input, moneyManage);
		putObject(moneyManage, "moneymanager.ser");
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
					logger.log("add a deposit");
					break;
				case 2:
					moneyManage.addWithdrawal();
					logger.log("add a withdrawal");
					break;
				case 3:
					moneyManage.viewdeals();
					logger.log("view deals");
					break;
				case 4:
					moneyManage.editSystem();
					logger.log("edit deals");
					break;
				case 5:
					moneyManage.deletedeal();
					logger.log("delete a deal");
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
	
	public static MoneyManage getObject(String filename) {
		MoneyManage moneyManage = null;
		
		
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			moneyManage = (MoneyManage) in.readObject();
			
			in.close();
			file.close();
			 
		} catch (FileNotFoundException e) {
			return moneyManage;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return moneyManage;
		
	}
	
	public static void putObject(MoneyManage moneyManage, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(MoneyManage);
			
			out.close();
			file.close();
			
			
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

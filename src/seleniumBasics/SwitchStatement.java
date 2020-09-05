package seleniumBasics;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter a Command");
		
			String text = input.nextLine();
			switch(text) {			
			case "start":
				System.out.println("Machine has started");
				break;
			case "stop":
				System.out.println("Machine has stopped");
				break;				
			default:
				System.out.println("Command is not recognized");
			}
			
	}

}

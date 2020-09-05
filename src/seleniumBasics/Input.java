package seleniumBasics;

import java.util.Scanner;

public class Input {
	
public static void main(String[] agrs)
 {
	
	Scanner input  = new Scanner(System.in) ;
	
		System.out.println("Enter a String:");
	
	String Line = input.nextLine();
	
		System.out.println("You have entered :" + Line);
		
	
}
}

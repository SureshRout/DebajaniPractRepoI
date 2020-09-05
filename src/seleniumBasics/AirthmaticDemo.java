package seleniumBasics;

public class AirthmaticDemo {
	
	public static void main(String[] args) {
	
	long result = 1000+2000;
	
	result = result + 1;	
	
	System.out.println("Result is:=" + result);
	
	long original_result = result;
	
	result = result -1;
	
	System.out.println(original_result + "- 1 ="+ result);
	
	original_result = result;
	
	result = result *2;
	
	System.out.println(original_result + "* 2 =" + result);
	
	original_result = result;
	
	result = result % 3;
	
	System.out.println(original_result + " % 3 =" + result);
	
	}
}

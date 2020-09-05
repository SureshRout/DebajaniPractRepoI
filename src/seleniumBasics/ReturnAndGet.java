package seleniumBasics;

class People{	
	String Name;
	int Age;
	int calculateRetirementAge() {
		int yearsLeft = 65- Age;
		//System.out.println(yearsLeft);
		return yearsLeft;
	}
	String getName() {
		return Name;
		}
	int getAge() {
		return Age;
	}
}


public class ReturnAndGet{ 
	
	public static void main(String[] agrs) {
	
		People P1 = new People();
		P1.Name = "Joe";
		P1.Age = 35;
		int Years = P1.calculateRetirementAge();
			
		System.out.println("The Retirment Age is " + Years);
		
		String Name= P1.getName();
		System.out.println("Person Name is " + Name);
		int Age =P1.getAge();
		System.out.println("Person Age is " + Age);
	}

}
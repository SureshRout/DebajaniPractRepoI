package seleniumBasics;

class Person{
	String Name;
	int Age;
	String Village;
	
}

public class PersonTemplate {
	
	public static void main(String[] args) {
		
		Person P1 = new Person();
		Person P2 = new Person();
		P1.Name="Ram";
		P1.Age= 22;
		P1.Village="Tikiripada";
		P2.Name="Raja";
		P2.Age=25;
		P2.Village="Karabara";
		System.out.println(P1.Village);				
		
	}

}

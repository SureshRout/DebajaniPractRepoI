package seleniumBasics;

class PersonDetails{
	String Name;
	int Age;
	String Address;
	public void Speak() {
		for(int i=0;i<3;i++) {
		System.out.println("My name is " + Name +" Age is "+ Age);
		}
	}
	void SayHello() {
		System.out.println("Say Hello");
	}
}

public class PersonMethod {
	public static void main(String[] args) {
		PersonDetails P3=new PersonDetails();
		PersonDetails P4=new PersonDetails();
		P3.Name = "Suresh";
		P3.Age = 40;
		P3.Address="Sarakantara";
		P4.Name= "Debajani";
		P4.Age = 33;
		P4.Address="Tikiripada";
		System.out.println(P3.Name);
		P3.Speak();
		P3.SayHello();
		P4.Speak();
		P4.SayHello();
		
	}
	

}

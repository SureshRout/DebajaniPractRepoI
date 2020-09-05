package seleniumBasics;

class Sheep{
	String Name;
	int Age;
	private	String Address;
	
	public void setName(String newName) {
		Name=newName;
	}
	public void setAge(int newAge) {
		Age = newAge;
	}
	
	public void setAddress(String newAddress) {
	this.Address = newAddress;  //here this.Address is referring to the private Address variable which is now assigned to the newAddress inside the set method.
	}
	//This is refer to current class object or method
	public String getName() {
		return Name;		
	}
	public int getAge() {
		return Age;
	}
	public String getAddress() {
		return Address;
	}
}


public class SettersThis {
	public static void main(String[] agrs) {
		
		Sheep S1 = new Sheep();
		//S1.Address = "Play Barn"; here we cannot Address variable of Sheep class as it is private		
		S1.setName("Shaun");
		System.out.println("Sheep name is " + S1.getName());
		S1.setAge(3);
		S1.setAddress("Hoveton");
		System.out.println("She is " +S1.getAge() + " years old");
	//	System.out.println("Her Address is " + S1.getAddress("Wroxham Barn"));
		System.out.println("New Address is " + S1.getAddress());
	}

}




///////////////////////////////////////
//The this keyword refers to the current object in a method or constructor.The most common use of the this keyword is to eliminate the confusion between class attributes and parameters with the same name (because a class attribute is shadowed by a method or constructor parameter).



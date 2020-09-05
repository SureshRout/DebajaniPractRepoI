package seleniumBasics;

public class ArrayString {
	public static void main(String [] args) {
		
		String Values[];
		Values =new String[5];
		Values[0]="Aasha";
		Values[1]="Judhisthir";
		Values[2]="Jagdish";
		Values[3]="Debajani";
		Values[4]="Ronika";
		System.out.println("Value of string is "+ Values[0]);
		
		String[] Fruits= {"Aapple","Banana","Kiwi","PassionFruit"};
		for(String Fruit:Fruits) {
			System.out.println(Fruit);
		}
		
	}

}

package seleniumBasics;

public class Thisclass {

	int x=0;
	  // Constructor with a parameter
	  public Thisclass(int y) {
	  y = x;
		 // this.x = x;
	  }
	  //Call the constructor
	  public static void main(String[] args) {
	    Thisclass myObj = new Thisclass(5);
	    System.out.println("Value of x = " + myObj.x);
	  }
	}



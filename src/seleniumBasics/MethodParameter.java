package seleniumBasics;

class Robot{
	public void speak(String text) {
		System.out.println(text);
		
	}
	public void jump(int height) {
		System.out.println("Height is " + height);
	}
	public void roam(String direction, double distance) {
		System.out.println("roaming in " + direction + " distance travelled " + distance);
	}
}

public class MethodParameter {
	
	public static void main(String[] args) {
		Robot R1 = new Robot();
		R1.speak("Hello There");
		R1.jump(6);
		R1.roam("east", 34.0);
		String talk = "I am ok";
		R1.speak(talk);
		int value = 18;
		R1.jump(value);
		
		
			
	}

}

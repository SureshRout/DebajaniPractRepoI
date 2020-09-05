package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseoverPractise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\Tool\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		
	}

}

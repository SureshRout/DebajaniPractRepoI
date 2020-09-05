package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\Tool\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String title=driver.getTitle();
		/*System.out.println(title);
		System.out.println(driver.getTitle());*/
		System.out.println("The Page Title is = "+title);
		
		driver.close();

		

	}

}

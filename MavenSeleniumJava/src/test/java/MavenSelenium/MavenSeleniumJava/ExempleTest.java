package MavenSelenium.MavenSeleniumJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExempleTest {
	
	@Test
	public void printSomething() {
		System.out.println("affiche cet exemple");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\guend\\Documents\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}

}

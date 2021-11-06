package caclculator;

import org.openqa.selenium.chrome.ChromeDriver;

public class openbroeser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net");
	}

}

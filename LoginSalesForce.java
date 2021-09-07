package assessmentweek2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSalesForce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com");
		
		driver.findElementById("username").sendKeys("earth@testleaf.com");
		driver.findElementById("password").sendKeys("Bootcamp$123");
		driver.findElementById("Login").click();
		
		Thread.sleep(10000);
	
		driver.findElementByXPath("//div[@class = 'appLauncher slds-context-bar__icon-action']//button").click();
	
		Thread.sleep(5000);
		
		driver.findElementByXPath("//button[text() = 'View All']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//label[text() = 'Search apps or items...']/following::input").sendKeys("contracts");
		
		driver.findElementByXPath("//mark[text() = 'Contracts']").click();
		
		driver.findElementByXPath("//span[text() = 'Recently Viewed | Contracts' ]/following::lightning-primitive-icon[1]").click();
		
		driver.findElementByXPath("//span[text() = 'New Contract']").click();
		
		
		//driver.findElementByXPath("//p[text() = 'Contracts']").click();
		
	
	
	}

}

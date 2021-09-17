package assessmentweek3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
	
		driver.findElementByXPath("//div[text() = 'Fashion']");
		
		Actions builder = new Actions(driver);
	WebElement	MBW = driver.findElementByXPath("//a[text() = 'Men's Bottom Wear']");
		
		builder.moveToElement(MBW).click();
		
		

	
	}

}

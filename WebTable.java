package assessmentweek3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		
		List<WebElement> Row = driver.findElements(By.xpath("//table//tbody//th"));
		for (int i = 0; i <3; i++) {
			System.out.println(Row.get(i).getText()+" ");
		}
		
		
		List<WebElement> coloumn = driver.findElements(By.xpath("//table//tbody//td"));
		for (int j = 0; j < 18; j++) {
			System.out.println(coloumn.get(j).getText()+" ");

		}
	    
		}
		
	}



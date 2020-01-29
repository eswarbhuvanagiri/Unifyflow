import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class chargesPage {


	public static void main(String[] args) throws InterruptedException {
		//  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.get("http://172.16.0.70:9080/unifyadmin");
		  Thread.sleep(3000);
		  WebElement uname = driver.findElement(By.name("username"));
		  WebElement pwd = driver.findElement(By.name("password"));
		  WebElement domain = driver.findElement(By.id("domain"));
		  WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
		  WebElement billings = driver.findElement(By.xpath("//a[@class='popNavLink'][contains(text(),'Billing')]"));
		  WebElement charges = driver.findElement(By.name("//a[contains(text(),'Charges')]"));
		 
		  uname.sendKeys("admin");
		  pwd.sendKeys("admin");
		  domain.sendKeys("admin");
		  btn.click();
		  billings.click();
		  Actions action = new Actions(driver);
			action.moveToElement(billings).build().perform();
			charges.click();

	}

}

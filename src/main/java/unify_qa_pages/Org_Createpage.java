package unify_qa_pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import unify_qa_base.Testbase;

public class Org_Createpage extends Testbase {

	public static JavascriptExecutor js;
	@FindBy(xpath = "//input[@id='combobox-1310-inputEl']']")
	WebElement domainName;
	@FindBy(xpath = "//input[@id='orgName-inputEl']")
	WebElement org_Name;
	@FindBy(xpath = "//input[@id='shortName-inputEl']")
	WebElement short_Name;
	@FindBy(xpath = "//input[@id='countryNo-inputEl']")
	WebElement countryName;
	@FindBy(xpath = "//span[@id='move-next-btnIconEl']")
	WebElement linktoledgerbtn;
	@FindBy(xpath = "//input[@id='newLedgerAccount-inputEl']")
	WebElement addledgerbtn;
	@FindBy(id = "finish-btnIconEl")
	
	/*
	 * WebElement addledgerbook;
	 * 
	 * @FindBy(xpath="//input[@placeholder='Select ledger book']")
	 */
	WebElement finishbtn;
	@FindBy(id = "button-1006-btnIconEl")
	WebElement shiptoyesbtn;
	@FindBy(xpath = "//input[@placeholder='Search here']")
	WebElement orgsearch;

	public Org_Createpage() {
		PageFactory.initElements(driver, this);
	}

	public void switchToFrame() {
		driver.switchTo().frame(0);
	}

	public void switchingWindow() {
		String mycurrentWindow = driver.getWindowHandle();
		driver.switchTo().window(mycurrentWindow);
		System.out.println("Windows Handled");
	}

	/*
	 * public void selectdomain(){
	 * 
	 * 
	 * //
	 * js.executeScript("document.getElementById('combobox-1310-inputEl').click();")
	 * ;
	 * driver.findElement(By.xpath("//input[@id='combobox-1310-inputEl']")).click();
	 * System.out.println("element clicked");
	 * 
	 * 
	 * }
	 */

	public void createNewContact(String domain, String orgName, String shortName) throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement domain_name = driver.findElement(By.xpath("//input[@name='domain.domno']"));
		domain_name.sendKeys(domain);
		System.out.println("domain clicked");
		// WebElement
		// ele=driver.findElement(By.xpath("//div[@id='boundlist-1380-listEl']//ul[@class='x-list-plain']//li[contains(text(),'ANKUR
		// BOYS HOSTEL(UPWDE2458)')]"));
		
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//*[contains(@class,'x-boundlist-item')]"));
		ele.click();

		// Thread.sleep(3000);
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		domain_name.sendKeys(Keys.DOWN);
		domain_name.sendKeys(Keys.ENTER);
		org_Name.sendKeys(orgName);
		short_Name.sendKeys(shortName);
		/*
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 * List<WebElement> org_list =
		 * driver.findElements(By.xpath("//div[@id='boundlist-1382-listEl']"));
		 * 
		 * for (WebElement o_list : org_list) { if
		 * (o_list.getText().equalsIgnoreCase(domain)) o_list.click(); break; }
		 * Thread.sleep(3000);
		 */
		/*
		 * WebElement org= driver.findElement(By.
		 * xpath("//li[@class='x-boundlist-item x-boundlist-item-over']"));
		 * List<WebElement> orgList=org.findElements(By.tagName("li")); for (WebElement
		 * li : orgList) { if (li.getText().equals(domain)) { li.click(); } }
		 */
		/*
		 * Select select = new
		 * Select(driver.findElement(By.xpath("//li[contains(text(),'"+domain+"')]")));
		 * select.selectByVisibleText(domain); WebElement Domain =
		 * driver.findElement(By.xpath("//input[contains(@name,'domain.domno')]"));
		 * //String dom = pro.getProperty("domain").trim(); Domain.sendKeys(domain); //
		 * Thread.sleep(5000);
		 * 
		 * Domain.sendKeys(Keys.DOWN); Domain.sendKeys(Keys.ENTER);
		 * System.out.println("element passed");
		 */
		// js.executeScript("document.getElementById('ext-gen2234').click();");

		/*
		 * Select select = new
		 * Select(driver.findElement(By.xpath("//li[contains(text(),'"+domain+"')]")));
		 * select.selectByVisibleText(domain);
		 */

		

		/*
		 * WebElement contact_list=driver.findElement(By.xpath(
		 * "//input[@id='contactTypeid-inputEl']"));
		 * contact_list.sendKeys("Organisation"); Thread.sleep(3000);
		 * contact_list.sendKeys(Keys.DOWN); contact_list.sendKeys(Keys.ENTER);
		 */
	}

	public void selectCountry(String country) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement countries_list = driver.findElement(By.xpath("//input[@id='countryNo-inputEl']"));
		// String s=countries_list.getAttribute("contact.countryNo");
		String s = countries_list.getText();
		System.out.println(s);
		// countries_list.sendKeys(country);
		// WebElement
		// ele=driver.findElement(By.xpath("//div[@id='boundlist-1382-listEl']//ul[@class='x-list-plain']//li[contains(text(),'"+country+"')]"));
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Thread.sleep(3000);
		// wait.until(ExpectedConditions.visibilityOf(ele));
		// countries_list.sendKeys(Keys.DOWN);
		// countries_list.sendKeys(Keys.ENTER);
		
		
	}

	//
	// driver.findElement(By.xpath("div[@id='ext-gen2293']")).click();
	/*
	 * js.executeScript("document.getElementById(''ext-gen2293').click();");
	 * 
	 * Select select1 = new
	 * Select(driver.findElement(By.xpath("//li[contains(text(),'"+country+"')]")));
	 * select1.selectByVisibleText(country);
	 */
	public void selectcity(String city) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement cities = driver.findElement(By.xpath("//input[@id='city-inputEl']"));
		cities.sendKeys(city);
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Thread.sleep(1000);
		cities.sendKeys(Keys.DOWN);
		cities.sendKeys(Keys.ENTER);
	}
	/*
	 * driver.findElement(By.xpath("//input[@id='city-inputEl']")).click();
	 * 
	 * Select select2 = new
	 * Select(driver.findElement(By.xpath("//li[contains(text(),'"+city+"')]")));
	 * select2.selectByVisibleText(city);
	 */

	public void linktoLedger() {
		linktoledgerbtn.click();
	}

	public void switchingtoLedgerwindow() {
		String mycurrent_Window = driver.getWindowHandle();
		driver.switchTo().window(mycurrent_Window);
		System.out.println("Ledger Window Handled");
	}

	public void addLedgerAccount() {
		addledgerbtn.click();
	}

	public void addLedgerbook(String lbook) throws Exception {
		WebElement addledgerbook = driver.findElement(By.xpath("//input[@placeholder='Select ledger book']"));
		addledgerbook.sendKeys(lbook);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Thread.sleep(1000);
		addledgerbook.sendKeys(Keys.DOWN);
		addledgerbook.sendKeys(Keys.ENTER);

	}

	public void clickonFinishbtn() {
		finishbtn.click();
	} 

	public void shiptoaddress() {
		String mycurrent_Window = driver.getWindowHandle();
		driver.switchTo().window(mycurrent_Window);
		System.out.println("shipto Window Handled");
		shiptoyesbtn.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void searchOrg(String orgsName) throws Exception {
		orgsearch.sendKeys(orgsName);
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 Thread.sleep(1000);
		orgsearch.sendKeys(Keys.ENTER);
		/*
		 * 
		 * List<WebElement> orgs_list=driver.findElements(By.xpath(
		 * "//div[@id='boundlist-1301-listEl']//div[@class='x-boundlist-item']")); 
		 * for(WebElement or_list : orgs_list) 
		 * {
		 *  if
		 * (or_list.getText().equalsIgnoreCase(orgsName)) or_list.click();
		 *  break; 
		 *  }
		 */
		
		
		
		
	}
	public void createServiceGrp() {
		
	}

}

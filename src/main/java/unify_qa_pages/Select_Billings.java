package unify_qa_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import unify_qa_base.Testbase;

public class Select_Billings extends Testbase{
	@FindBy(xpath = "//a[@class='popNavLink'][contains(text(),'Billing')]")
	WebElement billings;
	@FindBy(xpath = "//a[contains(text(),'Charges')]")
	WebElement charges;
	public Select_Billings() {
		PageFactory.initElements(driver, this);
	}
	/*
	 * public Add_charges clickOnBillings() { billings.click(); return new
	 * Add_charges(); }
	 */
	
	public Add_charges clickOnCharges() {
		Actions action = new Actions(driver);
		action.moveToElement(billings).build().perform();
		charges.click();
		return new Add_charges();
	}
}

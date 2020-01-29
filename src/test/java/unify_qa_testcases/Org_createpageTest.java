package unify_qa_testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import unify_qa_base.Testbase;
import unify_qa_pages.Homepage;
import unify_qa_pages.Loginpage;
import unify_qa_pages.Org_Contactspage;
import unify_qa_pages.Org_Createpage;
import unify_qa_util.Testutil;

public class Org_createpageTest extends Testbase {
	Loginpage loginpage;
	Homepage homepage;
	Org_Contactspage org_contactspage;
	Org_Createpage org_createpage;
	String sheetName = "Sheet3";
	Testutil testutil;

	public Org_createpageTest() {
		super();

	}

	@BeforeMethod
	public void setUp() throws InterruptedException {

		initialization();
		testutil = new Testutil();
		org_createpage = new Org_Createpage();

		org_contactspage = new Org_Contactspage();
		loginpage = new Loginpage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"),
				prop.getProperty("domain"));

		org_contactspage = homepage.clickonCustomers();
		org_createpage.switchingWindow();
		// org_createpage.switchToFrame();
	}

	@DataProvider
	public Object[][] getorg_TestData() {
		Object data[][] = Testutil.getTestData(sheetName);
		return data;
	}

	@Test(priority = 1, dataProvider = "getorg_TestData")
	public void create_org(String domain, String orgName, String shortName, String country, String city, String lbook)
			throws Exception {

		//org_contactspage.createOrg();

		/*
		 * org_createpage.createNewContact(domain, orgName, shortName);
		 * org_createpage.selectCountry(country); org_createpage.selectcity(city);
		 * org_createpage.linktoLedger();
		 * 
		 * org_createpage.switchingtoLedgerwindow(); org_createpage.addLedgerAccount();
		 * org_createpage.addLedgerbook(lbook); org_createpage.clickonFinishbtn();
		 * org_createpage.shiptoaddress(); testutil.screenshot("Org_created");
		 * Thread.sleep(3000);
		 */

	org_createpage.searchOrg(orgName);
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		Thread.sleep(5000);
		testutil.screenshot("Org_searched");
		Thread.sleep(5000);

		driver.quit();
	}

}

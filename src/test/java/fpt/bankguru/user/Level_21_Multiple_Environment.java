package fpt.bankguru.user;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import environmentConfig.Environment;

public class Level_21_Multiple_Environment extends BaseTest {
	WebDriver driver;
	Environment environment;

	@Parameters({ "browser" })
	@BeforeClass
	public void beforeClass(String browserName) {
		// Get environment value from Maven command line
		String prefixPropertiesName = System.getProperty("envMaven");
		System.out.println("Properties file name = " + prefixPropertiesName + ".properties");

		ConfigFactory.setProperty("evnOwner", prefixPropertiesName);
		environment = ConfigFactory.create(Environment.class);
		driver = getBrowserDriver(browserName, environment.appUrl());

		System.out.println(environment.appUrl());
		System.out.println(environment.appUsername());
		System.out.println(environment.appPassword());
		System.out.println(driver.getCurrentUrl());
	}

	@Test
	public void Employee_01_Add_New_Employee() {

	}

	@Test
	public void Employee_02_Upload_New_Avatar() {

	}

	@Test
	public void Employee_03_Personal_Details() {

	}

	@Test
	public void Employee_04_Contact_Details() {

	}

	@Test
	public void Employee_05_Emergency_Details() {

	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		closeBrowserAndDriver();
	}
}

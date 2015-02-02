package selenium;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import selenium.pages.TestBase;

public class MyAccountTest extends TestBase {
	
	@BeforeClass
	public void login (){
		
		app.getUserHelper().loginAs("test_inna4@jo-games.com", "123123");
		app.getNavigationHelper().openMyAccountPage();
	  
		System.out.println("LOGIN - PASSED");
		   
		}
	
	@Test
	public void changeEmail() throws Exception {
	app.getUserHelper().changeEmail("test_stag2@jo-media.com");
	
	Thread.sleep(2000);	
	System.out.println("CHANGEEmail - PASSED");
	}
	
	@Test
	public void changePassword() throws Exception {
	app.getUserHelper().changePassword("123123", "123456");
	Thread.sleep(2000);
	System.out.println("PASSWORD - PASSED");
	  	}
	
	@Test
	public void changeLanguage() throws Exception {
	app.getUserHelper().changeLanguage();
	Thread.sleep(2000);
	System.out.println("LANGUAGE - PASSED");

	}
	
	
	@Test
	public void changeMethodPayment() throws Exception {
	app.getUserHelper().changeMethodPayment("test", "test", "4000123440001230", "12", "2014", "123");
	Thread.sleep(2000);
	System.out.println("PAYMENT - PASSED");
	   
		}
	
	
}

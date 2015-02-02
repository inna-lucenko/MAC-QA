package selenium;

import org.testng.annotations.Test;

import selenium.pages.TestBase;

public class FirstTest extends TestBase {
	


	@Test
	public void login() throws Exception {
	app.getUserHelper().loginAs("test_stag2@jo-media.com", "123456");
	Thread.sleep(2000);
	}

	/*@Test
	public void loginfailed() throws Exception {
	app.getUserHelper().loginAs("test_stag2@jo-media.com", "13456");
	}
	*/
	@Test
	public void logout() throws Exception {
	app.getUserHelper().logout();
	Thread.sleep(2000);
	}
}

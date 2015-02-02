package selenium;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selenium.pages.TestBase;

public class SoftwareTest  extends TestBase {
	

	@BeforeClass
	public void login() {
		app.getUserHelper().loginAs("test_inna4@jo-games.com", "123123");
		app.getNavigationHelper().openSoftwarePage();

		System.out.println("SOFTWARE - Software page open - PASSED");

	}

	@BeforeMethod
	public void mayBeSoftwarePageOpen() {
		if (app.getSoftwareHelper().isSoftwarePage()) {
			return;
		}
		app.getNavigationHelper().openSoftwareLoad();
	}
	
	@Test
	public void selectCSGenreGraphicInSoftware() throws Exception {
				
		app.getSoftwareHelper().selectCSGenreGraphicInSoftware();
		Thread.sleep(10000);
		System.out
				.println("SOFTWARE - content segments - genre GRAPHIC has been pressed - PASSED");
		app.getSoftwareHelper().downloadGenreSoftware();
		Thread.sleep(10000);
		System.out
				.println("SOFTWARE -content segments - software in genre GRAPHIC has been downloaded - PASSED");
	}
	
   @Test
	public void downloadAnySoftwarePlayButtonOverTheImage() throws Exception {
		app.getSoftwareHelper().downloadAnySoftwarePlayButtonOverTheImage();
		Thread.sleep(10000);
		System.out
				.println("SOFTWARE - software downloaded on button over the image  - PASSED");
	}

	@Test
	public void downloadNowAnySoftwareButtonPlusMenu() throws Exception {
		app.getSoftwareHelper().downloadNowAnySoftwareButtonPlusMenu();
		Thread.sleep(10000);
		System.out
				.println("SOFTWARE - download now software by plus menu has been pressed - PASSED");
	}


	@Test
	public void AddAnySoftwareToCollection() throws Exception {
		app.getSoftwareHelper().AddAnySoftwareToCollectionInPlusMenu();
		Thread.sleep(5000);
		System.out
				.println("SOFTWARE - Add to collection button on plus menu has been pressed - PASSED");
	}	
	
	@Test
	public void MoreInfoSoftwareToCollection() throws Exception {
		app.getSoftwareHelper().moreLikePLusButton();
		Thread.sleep(5000);
		System.out
				.println("SOFTWARE - More info button on plus menu has been pressed - PASSED");
	}
	
	
	@Test
	public void downloadAnySoftwareNowInMoreInfo() throws Exception {
		app.getSoftwareHelper().moreLikePLusButton();
		Thread.sleep(5000);
		app.getSoftwareHelper().clickDownloadNowinMoreInfoSection();
		Thread.sleep(10000);
		System.out
				.println("SOFTWARE - download now button in More info page has been pressed - PASSED");
	}

	@Test
	public void clickNeedHelp() throws Exception {
		app.getSoftwareHelper().moreLikePLusButton();
		Thread.sleep(5000);
		app.getSoftwareHelper().clickNeedHelp();
		Thread.sleep(5000);
		System.out
				.println("SOFTWARE - Need Help message in More info pages has been pressed - PASSED");

	}
	@Test
	public void moreLikeDownloadSoftwareOverImage() throws Exception {
		app.getSoftwareHelper().moreLikePLusButton();
		Thread.sleep(5000);
		app.getSoftwareHelper().moreLikeDownloadSoftwareOverImage();
		Thread.sleep(5000);
		System.out
				.println("SOFTWARE - download any software over image in More like section has been pressed - PASSED");

	}
	@Test
	public void moreInfoPageAddtoCollection () throws Exception {
		app.getSoftwareHelper().moreLikePLusButton();
		Thread.sleep(5000);
		app.getSoftwareHelper().moreInfoAddToCollectionInMoreInfoPage();
		Thread.sleep(5000);
		System.out
				.println("SOFTWARE - button Add to collection in more info page has been pressed - PASSED");

	}
	
}

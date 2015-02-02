package selenium;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selenium.pages.TestBase;

public class BookPageTest extends TestBase {
	@BeforeClass
	public void login() {
/* if(app.getUserHelper().isloginIn())
	 return;*/
	/*			if (app.getUserHelper().isloginIn())
		{app.getUserHelper().logout();}*/
		//driver.get("http://ipad-emulator.org/");
		app.getUserHelper().loginAs("test4_inna4@jo-games.com", "123123");
		app.getNavigationHelper().openBookPage();

		System.out.println("BOOKS - Book page open - PASSED");

	}
	
	@BeforeMethod
	public void mayBeBookPageOpen() {
		if (app.getBookHelper().isBookPage()) {
			return;
		}
		app.getNavigationHelper().openBookPageFromMoviePlayer();
	}
	
	@Test
	public void selectCSGenreMysteryInBook() throws Exception {
				
		app.getBookHelper().selectCSGenreMysteryInBook();
		Thread.sleep(10000);
		System.out
				.println("BOOKS - content segments - genre MYSTERY has been pressed - PASSED");
		app.getBookHelper().readBookMystery();
		Thread.sleep(30000);
		app.getBookHelper().proverkaSegment();
		}
	

	@Test
	public void moreLikeReadBookOverImage() throws Exception {
		app.getBookHelper().playAnyBookNowButtonPlusMenu();
		Thread.sleep(10000);
		app.getBookHelper().clickMoreInfo();
		Thread.sleep(5000);
		app.getBookHelper().moreLikeReadBookOverImage();
		Thread.sleep(25000);
		app.getBookHelper().proverkaOpenBook();
		 
		}

	@Test
	public void moreLikeReadBookPlusMenu() throws Exception {
		app.getBookHelper().playAnyBookNowButtonPlusMenu();
		Thread.sleep(10000);
		app.getBookHelper().clickMoreInfo();
		Thread.sleep(5000);
		app.getBookHelper().moreLikePLusButton();
		Thread.sleep(10000);
		app.getBookHelper().moreLikeReadBookPlusMenu();
		Thread.sleep(10000);
		app.getBookHelper().provMoreLikePlusMenuReadBook();
		
	}

	@Test
	public void moreLikeAddPlusMenu() throws Exception {
		app.getBookHelper().playAnyBookNowButtonPlusMenu();
		Thread.sleep(10000);
		app.getBookHelper().clickMoreInfo();
		Thread.sleep(5000);
		app.getBookHelper().moreLikePLusButton();
		Thread.sleep(10000);
		app.getBookHelper().moreLikeAddPlusMenu();
		Thread.sleep(10000);
		app.getBookHelper().provMoreLikePlusMenuAddToColl();
	}

	@Test
	public void moreLikeMoreLikeInPlusButton() throws Exception {
		app.getBookHelper().playAnyBookNowButtonPlusMenu();
		Thread.sleep(10000);
		app.getBookHelper().clickMoreInfo();
		Thread.sleep(5000);
		app.getBookHelper().moreLikePLusButton();
		Thread.sleep(10000);
		app.getBookHelper().moreLikeMoreLikeInPlusButton();
		Thread.sleep(10000);
		System.out
				.println("BOOKS - More Like on plus menu in More Like sectin has been pressed - PASSED");
	}

	@Test
	public void playAnyBookPlayButtonOverTheImage() throws Exception {
		app.getBookHelper().playAnyBookPlayButtonOverTheImage();
		Thread.sleep(15000);
		app.getBookHelper().proverkaOverImageOpenBook();
	}

	@Test
	public void playAnyBookNowButtonPlusMenu() throws Exception {
		app.getBookHelper().playAnyBookNowButtonPlusMenu();
		Thread.sleep(10000);
		app.getBookHelper().clickPlayNow();
		Thread.sleep(15000);
		app.getBookHelper().provPlusMenuReadBook();
	}

	@Test
	public void AddAnyBookToCollection() throws Exception {
		app.getBookHelper().playAnyBookNowButtonPlusMenu();
		Thread.sleep(5000);
		System.out.println("BOOKS - Plus button has been pressed - PASSED");
		app.getBookHelper().AddAnyBookToCollection();
		Thread.sleep(5000);
		app.getBookHelper().provPlusMenuAddToColl();	}

	@Test
	public void MoreInfoPageOpen() throws Exception {
		app.getBookHelper().playAnyBookNowButtonPlusMenu();
		Thread.sleep(5000);
		app.getBookHelper().clickMoreInfo();
		Thread.sleep(10000);
	    app.getBookHelper().PlayAnyBokOnMoreInfoPage();
		Thread.sleep(15000);
		app.getBookHelper().proverkaOpenBook();
	
	}

	@Test
	public void PlayAnyBookFromCollection() throws Exception {
		app.getBookHelper().playAnyBookNowButtonPlusMenu();
		Thread.sleep(5000);
		app.getBookHelper().AddAnyBookToCollection();
		Thread.sleep(5000);
		app.getBookHelper().provMessageAddToColl();
		app.getBookHelper().PlayAnyBookFromCollection();
		Thread.sleep(15000);
		System.out
				.println("BOOKS - Message Colection has been selected - PASSED");
	}

	@Test
	public void clickAddCollectionButtoninMoreInfoPage() throws Exception {
		app.getBookHelper().playAnyBookNowButtonPlusMenu();
		Thread.sleep(5000);
		app.getBookHelper().clickMoreInfo();
		Thread.sleep(10000);
		app.getBookHelper().clickAddCollectionButtoninMoreInfoPage();
		Thread.sleep(5000);
		System.out
				.println("BOOKS - Add to collection button in More info pages has been pressed - PASSED");

	}

	@Test
	public void clickNeedHelp() throws Exception {
		app.getBookHelper().playAnyBookNowButtonPlusMenu();
		Thread.sleep(5000);
		app.getBookHelper().clickMoreInfo();
		Thread.sleep(10000);
		app.getBookHelper().clickNeedHelp();
		Thread.sleep(5000);
		app.getBookHelper().provNeedHelp();
		

	}

}
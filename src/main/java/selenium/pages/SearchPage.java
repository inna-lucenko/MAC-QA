package selenium.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends SearchScreenShots {
	public SearchPage(selenium.pages.PageManager pages) {
		super(pages);}
	
	
	    // click search
		@FindBy(className= "search_button") 
		private WebElement iconSearch;
		// put text in to search field
		@FindBy(id = "search")
		private WebElement searchField;
		
		// move image in to search page
		@FindBy(xpath = "//*[@id=\"browse_wrapper\"]/div[2]/div[3]/a/div[1]/div/div[2]")
		private WebElement moveToImageMovieInSearchPage;
		// click plus menu in search page
		@FindBy(xpath= "//*[@id=\"browse_wrapper\"]/div[2]/div[3]/div/div[2]")
		private WebElement plusInSearchPage;
		// play movie in search page
		@FindBy(xpath = " //*[@id=\"browse_wrapper\"]/div[2]/div[3]/div[1]/div[2]/ul/li[2]/a")
		private WebElement playNowAnyMovieInSearchPageInPlusMenu;
		// more info in Search page
		@FindBy(xpath ="//*[@id=\"browse_wrapper\"]/div[2]/div[3]/div[1]/div[2]/ul/li[3]/a")
		private WebElement MoreInfoAnyMovieInSearchPageInPlusMenu;
		// play movie in search page
		@FindBy(xpath="//*[@id=\"browse_wrapper\"]/div[2]/div[3]/div[1]/div[2]/ul/li[1]/a")
		private WebElement AddToColectionAnyMovieInSearchPageInPlusMenu;
		// back button
		@FindBy(id= "video_close")
		private WebElement backButoon;
		
		// move image in to search page to music
		@FindBy(xpath = "//*[@id=\"browse_wrapper\"]/div[2]/div[9]/a/div[1]/div/div[2]") 
		private WebElement moveToImageMusicInSearchPage;
		// click plus menu in search page to music composition
		@FindBy(xpath= "//*[@id=\"browse_wrapper\"]/div[2]/div[9]/div/div[2]")
		private WebElement plusMusicInSearchPage;
		// play music in search page
		@FindBy(xpath ="//*[@id=\"browse_wrapper\"]/div[2]/div[9]/div[1]/div[2]/ul/li[3]/a")
		private WebElement playNowAnyMusicInSearchPageInPlusMenu;
		// more info in Search page to album
		@FindBy(xpath ="//*[@id=\"browse_wrapper\"]/div[2]/div[9]/div[1]/div[2]/ul/li[4]/a")
		private WebElement MoreInfoAnyMusicInSearchPageInPlusMenu;
		// add to collection album in search page
		@FindBy(xpath="//*[@id=\"browse_wrapper\"]/div[2]/div[9]/div[1]/div[2]/ul/li[2]/a")
		private WebElement AddToColectionAnyMusicInSearchPageInPlusMenu;
		// add to queue album in search page
		@FindBy(xpath="//*[@id=\"browse_wrapper\"]/div[2]/div[9]/div[1]/div[2]/ul/li[1]/a") 
		private WebElement AddToQueueAnyMusicInSearchPageInPlusMenu;	
		
		// move image in to search page to book
		@FindBy(xpath = "//*[@id=\"browse_wrapper\"]/div[2]/div[17]/a/div[1]/div/div[2]") 
		private WebElement moveToImageBookInSearchPage;
		// click plus menu in search page to book composition
		@FindBy(xpath= "//*[@id=\"browse_wrapper\"]/div[2]/div[17]/div/div[2]")
		private WebElement plusBookInSearchPage;
		// read book in search page
		@FindBy(xpath ="//*[@id=\"browse_wrapper\"]/div[2]/div[17]/div[1]/div[2]/ul/li[2]/a")
		private WebElement readNowAnyBookInSearchPageInPlusMenu;
		// more info in Search page to book
		@FindBy(xpath ="//*[@id=\"browse_wrapper\"]/div[2]/div[17]/div[1]/div[2]/ul/li[3]/a")
		private WebElement MoreInfoAnyBookInSearchPageInPlusMenu;
		// add to collection book in search page
		@FindBy(xpath="//*[@id=\"browse_wrapper\"]/div[2]/div[17]/div[1]/div[2]/ul/li[1]/a")
		private WebElement AddToColectionAnyBookInSearchPageInPlusMenu;
		
		
		public SearchPage backButtonInSearchVideo() {
			new Actions(driver).moveToElement(backButoon);
			backButoon.click();
			return this;
		}
		public SearchPage clearSearchField() {
		    searchField.clear();
		    return this;
		  } 
		
		public SearchPage setSearchField(String text) {
		    searchField.sendKeys(text);
		    return this;
		  }

		public SearchPage ClickSearchButton() {
			iconSearch.click();
			return this;
		}
		
		public SearchPage movetoImageInSearhcPage() {
			new Actions(driver)
			.moveToElement(moveToImageMovieInSearchPage)
			.perform();
			return this;
			}
		public SearchPage clickOverImageMovieInSearchPage() {
			moveToImageMovieInSearchPage.click();
			return this;
		}
		
		public SearchPage clickPlusMenuInSearchPage() {
			plusInSearchPage.click();
			return this;
		}
		public SearchPage playNowMoviePlusMenuInSearchPage() {
			playNowAnyMovieInSearchPageInPlusMenu.click();
			return this;
		}
		
		public SearchPage MoreInfoMoviePlusMenuInSearchPage() {
			MoreInfoAnyMovieInSearchPageInPlusMenu.click();
			return this;
		} 
		public SearchPage AddToCollectionInPlusMenuInSearchPage() {
			AddToColectionAnyMovieInSearchPageInPlusMenu.click();
			return this;
		}
		
		public SearchPage ensurePageLoaded() {
			super.ensurePageLoaded();
			wait.until(presenceOfElementLocated(By
					.xpath("//*[@id=\"search_button\"]")));
			return this;
		}
		
		public SearchPage movetoImageMusicInSearhcPage() {
			new Actions(driver)
			.moveToElement(moveToImageMusicInSearchPage)
			.perform();
			return this;
			}
		public SearchPage clickOverImageMusicInSearchPage() {
			moveToImageMusicInSearchPage.click();
			return this;
		}
		public SearchPage clickPlusMenuInSearchPageMusic() {
			plusMusicInSearchPage.click();
			return this;
		}
		public SearchPage playNowMusicPlusMenuInSearchPage() {
			playNowAnyMusicInSearchPageInPlusMenu.click();
			return this;
		}
		
		public SearchPage MoreInfoMusicPlusMenuInSearchPage() {
			MoreInfoAnyMusicInSearchPageInPlusMenu.click();
			return this;
		} 
		public SearchPage AddToCollectionMusicInPlusMenuInSearchPage() {
			AddToColectionAnyMusicInSearchPageInPlusMenu.click();
			return this;
		}
		public SearchPage AddToQueueMusicInPlusMenuInSearchPage() {
			AddToQueueAnyMusicInSearchPageInPlusMenu.click();
			return this;
		}
		
		
		public SearchPage movetoImageBookInSearhcPage() {
			new Actions(driver)
			.moveToElement(moveToImageBookInSearchPage)
			.perform();
			return this;
			}
		public SearchPage clickOverImageBookInSearchPage() {
			moveToImageBookInSearchPage.click();
			return this;
		}
		public SearchPage clickPlusMenuInSearchPageBook() {
			plusBookInSearchPage.click();
			return this;
		}
		public SearchPage readNowBookPlusMenuInSearchPage() {
			readNowAnyBookInSearchPageInPlusMenu.click();
			return this;
		}
		
		public SearchPage MoreInfoBookPlusMenuInSearchPage() {
			MoreInfoAnyBookInSearchPageInPlusMenu.click();
			return this;
		} 
		public SearchPage AddToCollectionBookInPlusMenuInSearchPage() {
			AddToColectionAnyBookInSearchPageInPlusMenu.click();
			return this;
		}
		
		public SearchPage clickCheckMoreInfoMovieOpen() {
	try {
    	if (driver.findElement(By.xpath("//*[@id=\"body_container\"]/div/div[1]/div[1]")).isDisplayed()) {
			System.out.println("SEARCH PAGE - more info page opened in search page by over image movie - PASSED");
		   		} } catch (Exception e)
	
	{	System.out.println("SEARCH PAGE - more info page opened in search page by over image movie - FAILED");
	      ScreenBUGcheckMoreInfoMovieOpen();
		}
	return this;
}
		public SearchPage clickCheckMovieOpen() {
	try {
    	if (driver.findElement(By.id("video_close")).isDisplayed()) {
			System.out.println("SEARCH PAGE - movie played in search page - PASSED");
		   		} } catch (Exception e)
	
	{	System.out.println("SEARCH PAGE - movie played in search page - FAILED");
		ScreenBUGcheckMovieOpen();
		}
	return this;
}
		public SearchPage clickCheckAddMovieToCollection() {
	try {
    	if (driver.findElement(By.xpath("//*[@id=\"feedback\"]/div[2]/a")).isDisplayed()) {
			System.out.println("SEARCH PAGE - movie added to colection in search page by plus menu  - PASSED");
		   		} } catch (Exception e)
	
	{	System.out.println("SEARCH PAGE - movie added to colection in search page by plus menu - FAILED");
		ScreenBUGcheckAddMovieToCollection();
		}
	return this;
}
		public SearchPage clickCheckMoreInfoMusicOpen() {
	try {
    	if (driver.findElement(By.xpath("//*[@id=\"body_container\"]/div/div[3]")).isDisplayed()) {
			System.out.println("SEARCH PAGE - more info page opened in search page by over image album - PASSED");
		   		} } catch (Exception e)
	
	{	System.out.println("SEARCH PAGE - more info page opened in search page by over image album - FAILED");
		
		}
	return this;
}
		public SearchPage clickcheckMusicPlay() {
	try {
    	if (driver.findElement(By.id("audio-player-bar")).isDisplayed()) {
			System.out.println("SEARCH PAGE - music played in search page by plus menu - PASSED");
		   		} } catch (Exception e)
	
	{	System.out.println("SEARCH PAGE - music played in search page by plus menu - FAILED");
		ScreenBUGcheckMusicPlay();
		}
	return this;
}
		public SearchPage clickCheckAddMusicToCollection() {
	try {
    	if (driver.findElement(By.xpath("//*[@id=\"feedback\"]/div[2]/a")).isDisplayed()) {
			System.out.println("SEARCH PAGE - music added to colection in search page by plus menu - PASSED");
		   		} } catch (Exception e)
	
	{	System.out.println("SEARCH PAGE - music added to colection in search page by plus menu - FAILED");
		ScreenBUGcheckAddMusicToCollection();
		}
	return this;
}
		
		public SearchPage clickcheckAddMusicToQueue() {
	try {
    	if (driver.findElement(By.xpath("//*[@id=\"feedback\"]/div[2]")).isDisplayed()) {
			System.out.println("SEARCH PAGE -  album added to queue in search page by plus menu - PASSED");
		   		} } catch (Exception e)
	
	{	System.out.println("SEARCH PAGE -  album added to queue in search page by plus menu - FAILED");
		ScreenBUGcheckAddMusicToQueue();
		}
	return this;
}
		public SearchPage clickCheckMoreInfoBookOpen() {
	try {
    	if (driver.findElement(By.xpath("//*[@id=\"body_container\"]/div/div[1]/div[1]")).isDisplayed()) {
			System.out.println("SEARCH PAGE - more info page opened in search page by over image book  - PASSED");
		   		} } catch (Exception e)
	
	{	System.out.println("SEARCH PAGE - more info page opened in search page by over image book - FAILED");
		ScreenBUGcheckMoreInfoBookOpen();
		}
	return this;
}
		public SearchPage clickCheckBookOpen() {
	try {
    	if (driver.findElement(By.xpath("//*[@id=\"reader\"]/div[2]/div/div")).isDisplayed()) {
			System.out.println("SEARCH PAGE - book opened in search page by plus menu - PASSED");
		   		} } catch (Exception e)
	
	{	System.out.println("SEARCH PAGE - book opened in search page by plus menu - FAILED");
		ScreenBUGcheckBookOpen();
		}
	return this;
}
		public SearchPage clickCheckAddBookToCollection() {
	try {
    	if (driver.findElement(By.xpath("//*[@id=\"feedback\"]/div[2]/a")).isDisplayed()) {
			System.out.println("SEARCH PAGE - book added to colection in search page by plus menu - PASSED");
		   		} } catch (Exception e)
	
	{	System.out.println("SEARCH PAGE - book added to colection in search page by plus menu - FAILED");
		ScreenBUGcheckAddBookToCollection();		}
	return this;
}
				
		
}

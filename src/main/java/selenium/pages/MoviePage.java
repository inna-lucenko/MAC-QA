package selenium.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MoviePage extends MoviesScreenAnyPage {

	public MoviePage(selenium.pages.PageManager pages) {
		super(pages);
	}

	// play any movies button Play
	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[5]/div/div/a/button")
	private WebElement playMovieOverTheImage;

	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[7]/div/a/img")
	private WebElement hoverImage;

	// button Back

	@FindBy(xpath = "//*[@id=\"video_close\"]")
	private WebElement backButton;
	// select plus menu
	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[7]/div/div/div/button")
	private WebElement plusMenu;

	// Play now for plus menu
	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[5]/div[1]/div/div/ul/li[2]/a")
	private WebElement playNow;
	// add to collection for plus menu
	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[5]/div[1]/div/div/ul/li[1]/a")
	private WebElement addToCollection;

	// MoreInfo for plus menu

	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[5]/div[1]/div/div/ul/li[3]/a")
	private WebElement moreInfo;
	// Watch on MoreInfo
	@FindBy(id = "video-loader")
	private WebElement watchMovieOnMoreInfoPage;

	// Click COLLECTION
	@FindBy(xpath = "//div [@class='message']/a")
	private WebElement addToCollectionMessage;

	// Click Add collection button in More info page
	@FindBy(xpath = "//*[@id=\"body_container\"]/div/div[1]/button")
	private WebElement buttonAddToCollection;

	// Click message Need Help
	@FindBy(xpath = "//*[@id=\"body_container\"]/div/div[1]/a")
	private WebElement messageNeedHelp;

	// Select over image in More Like section
	@FindBy(xpath = "//*[@id=\"related_container\"]/div[1]/div/a/img")
	private WebElement overImageMovie;

	// Click play now over image in More Like section
	@FindBy(xpath = "//*[@id=\"related_container\"]/div[1]/div/div/a/button")
	private WebElement moreLikePlayMovie;

	// click plus menu in More Like section

	@FindBy(xpath = "//*[@id=\"related_container\"]/div[1]/div/div/div/button")
	private WebElement moreLikePlusMenu;

	// Read now on plus menu in More Like section
	@FindBy(xpath = "//*[@id=\"related_container\"]/div[1]/div[1]/div/div/ul/li[2]/a")
	private WebElement moreLikePlayNawPlusMenu;

	// Add to collection on plus menu in More Like section
	@FindBy(xpath = "//*[@id=\"related_container\"]/div[1]/div[1]/div/div/ul/li[1]/a")
	private WebElement moreLikeAddMoviePlusMenu;

	// More info on plus menu in More Like section
	@FindBy(xpath = "//*[@id=\"related_container\"]/div[1]/div[1]/div/div/ul/li[3]/a")
	private WebElement moreLikeMoreLikePlusMenu;

	
	// Move to CS in movie genre
	@FindBy(xpath = "//*[@id=\"games_tab\"]/span") 
	private WebElement moveCSInGame;
	// Move to CS in movie genre
	@FindBy(xpath = "//*[@id=\"movies_tab\"]/span") 
	private WebElement moveCSInMovie;
		

	//select genre in movies CS
	@FindBy(xpath = "/html/body/div[1]/header/nav/ul/li[2]/div/ul[2]/li[1]/a") 
	private WebElement clickGenreComedyInMovie;
	
	// move movie in war genre
		@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[1]/div/a/img") 
		private WebElement moveMovieGenreComedy;
	
	// play movie in comedy genre
	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[1]/div/div/a/button") 
	private WebElement playMovieGenreComedy;
	
	
	
	//select genre in movies CS
	@FindBy(xpath = "/html/body/div[1]/header/nav/ul/li[2]/div/ul[3]/li[5]/a") 
	private WebElement clickGenreWarInMovie;
	
	
	// move movie in war genre
	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[1]/a") 
	private WebElement moveMovieGenreWar;
		
	
	// play movie in war genre
	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[1]/div/div/a/button") 
	private WebElement playMovieGenreWar;
	
	public MoviePage Proverka() {
		try {
        	if (driver.findElement(By.id("video_close")).isDisplayed()) {
				System.out.println("MOVIES - Movie comedy has been played - PASSED");
			   		} } catch (Exception e)
		
		{	System.out.println("MOVIES - Movie comedy has been played - FAILED");
			ScreenBUGSegment();		
			}
		return this;
	}
	public MoviePage ProverkaMoreLikeSection() {
		try {
        	if (driver.findElement(By.id("video_close")).isDisplayed()) {
				System.out.println("MOVIES - Play movie over image in More Like section has been pressed - PASSED");
			   		} } catch (Exception e)
		
		{	System.out.println("MOVIES - Play movie over image in More Like section has been pressed - FAILED");
			ScreenBUGMoviePlayerOpeninMoreLikeSection();		
			}
		return this;
	}
	public MoviePage ProverkaPlayOnPlus() {
		try {
        	if (driver.findElement(By.id("video_close")).isDisplayed()) {
				System.out.println("MOVIES  - Play now on plus menu has been pressed - PASSED");
			   		} } catch (Exception e)
		
		{	System.out.println("MOVIES  - Play now on plus menu has been pressed - FAILED");
					ScreenBUGPlayNowInPlusMenu();
			}
		return this;
	}
	public MoviePage ProverkaPlusMenuMoreLike() {
		try {
        	if (driver.findElement(By.id("video_close")).isDisplayed()) {
				System.out.println("MOVIES  - Play now on plus menu in More Like section has been pressed - PASSED");
			   		} } catch (Exception e)
		
		{	System.out.println("MOVIES  - Play now on plus menu in More Like section has been pressed - FAILED");
			ScreenBUGPlayNowInPlusMenuONMoreLike();		
			}
		return this;
	}
	public MoviePage ProverkaAddTo() {
		try {
        	if (driver.findElement(By.className("message")).isDisplayed()) {
				System.out.println("MOVIES  - Add to collection on plus menu in More Like section has been pressed - PASSED");
			   		} } catch (Exception e)
		
		{	System.out.println("MOVIES  - Add to collection on plus menu in More Like section has been pressed - FAILED");
				ScreenBUGAddToCollectionPlusMenuMoreLikeSection();	
			}
		return this;
	}
	
	
	public MoviePage ProverkaAddOnPlus() {
		try {
        	if (driver.findElement(By.className("message")).isDisplayed()) {
				System.out.println("MOVIES - Add to collection button on plus menu has been pressed - PASSED");
			   		} } catch (Exception e)
		
		{	System.out.println("MOVIES - Add to collection button on plus menu has been pressed - FAILED");
			ScreenBUGAddToCollecInPlusMenu();		
			}
		return this;
	}
	
	public MoviePage ClickPlayMovieComedy() {
		
		new Actions(driver).moveToElement(moveMovieGenreComedy).perform();
		playMovieGenreComedy.click();
		return this;
	}
	public MoviePage ClickPlayWar() {
		new Actions(driver).moveToElement(moveMovieGenreWar).perform();
		playMovieGenreWar.click();
		return this;
	}
	
	public MoviePage moveCSinMovie() {
		new Actions(driver).moveToElement(moveCSInGame).moveToElement(moveCSInMovie).perform();
		return this;
	}
	
	public MoviePage ClickGenreComedy() {
		clickGenreComedyInMovie.click();
		return this;
	}
	public MoviePage ClickGenreWar() {
		clickGenreWarInMovie.click();
		return this;
	}
	
	
	public MoviePage ClickMoreLikeOnPlusMenuInLikeSection() {
		moreLikeMoreLikePlusMenu.click();
		return this;
	}

	public MoviePage ClickAddToCollectioOnPlusMenuInLikeSection() {
		moreLikeAddMoviePlusMenu.click();
		return this;
	}

	public MoviePage ClickReadNowOnPlusMenuInLikeSection() {
		moreLikePlayNawPlusMenu.click();
		return this;
	}

	public MoviePage ClickPlusMenuOverImageInLikeSection() {
		moreLikePlusMenu.click();
		return this;
	}

	public MoviePage ClickPlayMovieOverImageInLikeSection() {
		moreLikePlayMovie.click();
		return this;
	}

	public MoviePage movetooverImageMovietoLikeSection() {
		new Actions(driver).moveToElement(overImageMovie).perform();
		return this;
	}

	public MoviePage ClickMessageNeedHelp() {
		messageNeedHelp.click();
		return this;
	}

	public MoviePage ClickButtonAddToCollection() {
		buttonAddToCollection.click();
		return this;
	}

	public MoviePage ClicColectionMovies() {
		addToCollectionMessage.click();
		return this;
	}

	public MoviePage WatchMovies() {
		watchMovieOnMoreInfoPage.click();
		return this;
	}

	public MoviePage clickMenuMoreInfo() {
		new Actions(driver).moveToElement(moreInfo).perform();
		moreInfo.click();
		return this;
	}

	public MoviePage clickAddToCollection() {
		new Actions(driver).moveToElement(addToCollection).perform();
		addToCollection.click();
		return this;
	}

	public MoviePage clicMenuPlayNow() {
		playNow.click();
		return this;
	}

	public MoviePage clickPlusMenu() {
		new Actions(driver).moveToElement(plusMenu).perform();
		plusMenu.click();
		return this;
	}

	public MoviePage clickOnmoviesplay() {
		playMovieOverTheImage.click();
		return this;
	}

	public MoviePage clickback() {
		backButton.click();
		return this;
	}

	public MoviePage movetoImage() {
		new Actions(driver).moveToElement(hoverImage).perform();
		return this;
	}

	public MoviePage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(presenceOfElementLocated(By
				.xpath("//*[@id=\"browse_wrapper\"]/h4")));
		return this;
	}

}

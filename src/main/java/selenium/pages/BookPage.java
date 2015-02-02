package selenium.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import selenium.pages.AnyPage;

public class BookPage extends BookScreen {

	public BookPage(selenium.pages.PageManager pages) {
		super(pages);
	}

	// read any books on hover image
	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[1]/div/div/a/button")
	private WebElement readBookHoverImage;

	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[1]/div/a/img")
	private WebElement hoverImageBook;

	// select plus menu
	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[1]/div/div/div/button")
	private WebElement plusMenu;

	// Read now for plus menu
	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[1]/div[1]/div/div/ul/li[2]/a")
	private WebElement readNowInPlusMenu;

	// add to collection for plus menu
	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[1]/div[1]/div/div/ul/li[1]/a")
	private WebElement addToCollectionInPlusMenu;

	// MoreInfo for plus menu

	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[1]/div[1]/div/div/ul/li[3]/a")
	private WebElement moreInfoInPlusMenu;
	
	// Read Book on for MoreInfo
	@FindBy(xpath = "//*[@id=\"title_download_container\"]") 
	private WebElement readBookInMoreInfoPage;

	// Click message "COLLECTION"
	@FindBy(xpath = "//div [@class='message']/a")
	private WebElement messageCollection;
	
	// Click Add collection button in More info page
	@FindBy(xpath = "//*[@id=\"body_container\"]/div/div[1]/button") 
	private WebElement buttonAddToCollection;
	// Click Back button
	@FindBy(xpath = "//*[@id=\"backToBook\"]")
	private WebElement buttonBack;
	// Click message Need Help
	@FindBy(xpath = "//*[@id=\"body_container\"]/div/div[1]/a")
	private WebElement messageNeedHelp; 

	// Select  over image in More Like section
	@FindBy(xpath = "//*[@id=\"related_container\"]/div[1]/div/a/img") 
	private WebElement overImageBook;
	
	// Click read now  over image in More Like section
	@FindBy(xpath = "//*[@id=\"related_container\"]/div[1]/div/div/a/button")
	private WebElement moreLikeReadBook; 
	
	// click plus menu in More Like section 
	
	@FindBy(xpath = "//*[@id=\"related_container\"]/div[1]/div/div/div/button")
	private WebElement moreLikePlusMenu; 
	
	
	// Read now on plus menu in More Like section
	@FindBy(xpath = " //*[@id=\"related_container\"]/div[1]/div[1]/div/div/ul/li[2]/a")
	private WebElement moreLikeReadNowPlusMenu; 
		
	// Add to collection on plus menu in More Like section
	@FindBy(xpath = "//*[@id=\"related_container\"]/div[1]/div[1]/div/div/ul/li[1]/a")
	private WebElement moreLikeAddBookPlusMenu; 
	
	// More info on plus menu in More Like section
	@FindBy(xpath = "//*[@id=\"related_container\"]/div[1]/div[1]/div/div/ul/li[3]/a")
	private WebElement moreLikeMoreLikePlusMenu; 
		
	// Move to CS in game genre
	@FindBy(xpath = "//*[@id=\"movies_tab\"]/span") 
	private WebElement moveCSInGame;
	// Move to CS in book genre
	@FindBy(xpath = "//*[@id=\"books_tab\"]/span") 
	private WebElement moveCSInBook;
	//select genre in book CS
	@FindBy(xpath = "/html/body/div[1]/header/nav/ul/li[4]/div/ul[3]/li[1]/a") 
	private WebElement clickGenreMysteryInBook;
	// move book in mystery genre
	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[10]/div/a/img") 
	private WebElement moveBookGenreMystery;
	// read book in mystery genre
	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[10]/div/div/a/button") 
	private WebElement readBookGenreMystery;
	
	
	public BookPage ClickReadBookMystery() {
		
		new Actions(driver).moveToElement(moveBookGenreMystery).perform();
		readBookGenreMystery.click();
		return this;
	}
	
	public BookPage moveCSinBook() {
		new Actions(driver).moveToElement(moveCSInGame).moveToElement(moveCSInBook).perform();
		return this;
	}
	
	public BookPage ClickGenreMystery() {
		clickGenreMysteryInBook.click();
		return this;
	}
	
	
	public BookPage ClickPlusMenuOverImageInLikeSection()
	   { moreLikePlusMenu.click();
	   return this;
	   }	
	public BookPage ClickReadNowOnPlusMenuInLikeSection()
	   { moreLikeReadNowPlusMenu.click();
	   return this;
	   }	
	public BookPage ClickAddToCollectioOnPlusMenuInLikeSection()
	   { moreLikeAddBookPlusMenu.click();
	   return this;
	   }

	public BookPage ClickMoreLikeOnPlusMenuInLikeSection() {
		moreLikeMoreLikePlusMenu.click();
		return this;
	}
	public BookPage movetooverImageBooktoLikeSection() {
		new Actions(driver).moveToElement(overImageBook).perform();
		return this;
	}
	public BookPage ClickReadBookOverImageInLikeSection()
	   { moreLikeReadBook.click();
	   return this;
	   }	
	public BookPage ClickMessageNeedHelp()
	   { messageNeedHelp.click();
	   return this;
	   }	
	public BookPage ClickBackButton()
	   { buttonBack.click();
	   return this;
	   }
	
   public BookPage ClickButtonAddToCollection()
   { buttonAddToCollection.click();
   return this;
   }
   
	public BookPage ClicColection() {
		messageCollection.click();
		return this;
	}

	public BookPage SelectMoreInfo() {
		new Actions(driver).moveToElement(moreInfoInPlusMenu).perform();
		moreInfoInPlusMenu.click();
		return this;
	}

	public BookPage ReedBooks() {
		readBookInMoreInfoPage.click();
		return this;
	}

	public BookPage clicMenuPlayNow() {
		readNowInPlusMenu.click();
		return this;
	}

	public BookPage clickPlayPlusMenu() {
		new Actions(driver).moveToElement(plusMenu).perform();
		plusMenu.click();
		return this;
	}

	public BookPage clickOnPlayButton() {
		readBookHoverImage.click();
		return this;
	}

	public BookPage movetoImage() {
		new Actions(driver).moveToElement(hoverImageBook).perform();
		return this;
	}

	public BookPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(presenceOfElementLocated(By
				.xpath("//*[@id=\"browse_wrapper\"]/h4")));
		return this;
	}

	public BookPage clickAddToCollection() {
		new Actions(driver).moveToElement(addToCollectionInPlusMenu).perform();
		addToCollectionInPlusMenu.click();
		return this;
	}
	
	public BookPage proverkaBookopen() {
		try {
        	if (driver.findElement(By.xpath("//*[@id=\"reader\"]/div[2]/div/div/div[3]")).isDisplayed()) {
				System.out.println("BOOKS - Read Book over image in More Like section has been pressed - PASSED");
			   		} } catch (Exception e)
		
		{	System.out.println("BOOKS - Read Book over image in More Like section has been pressed - FAILED");
				ScreenBUGBookOpen();
			}
		return this;
	}

	
		public BookPage proverkaSegmentBookopen() {
		try {
        	if (driver.findElement(By.xpath("//*[@id=\"reader\"]/div[2]/div/div/div[3]")).isDisplayed()) {
				System.out.println("BOOKS - Book  open over image in segment  has been pressed - PASSED");
			   		} } catch (Exception e)
		
		{	System.out.println("BOOKS - Read Book over image in segment  has been pressed - FAILED");
				ScreenBUGSegment();	
			}
		return this;
	}
		public BookPage proverkaMoreLikePlusMenuReadBook() {
		try {
        	if (driver.findElement(By.xpath("//*[@id=\"reader\"]/div[2]/div/div/div[3]")).isDisplayed()) {
				System.out.println("BOOKS - Read Book on plus menu in More Like section has been pressed - PASSED");
			   		} } catch (Exception e)
		
		{	System.out.println("BOOKS - Read Book on plus menu in More Like sectin has been pressed - FAILED");
			ScreenBUGReadNowInPlusMenuONMoreLike();		
			}
		return this;
	}
		public BookPage proverkaMoreLikePlusMenuAddToColl() {
		try {
        	if (driver.findElement(By.xpath("//*[@id=\"feedback\"]/div[2]/a")).isDisplayed()) {
				System.out.println("BOOKS - Add to collection on plus menu in More Like sectin has been pressed - PASSED");
			   		} } catch (Exception e)
		
		{	System.out.println("BOOKS - Add to collection on plus menu in More Like sectin has been pressed - FAILED");
			ScreenBUGAddToCollectionPlusMenuMoreLikeSection();		
			}
		return this;
	}
		public BookPage proverkaOverImageOpenBook() {
		try {
        	if (driver.findElement(By.xpath("//*[@id=\"reader\"]/div[2]/div/div/div[3]")).isDisplayed()) {
				System.out.println("BOOKS - Book opened on button over the image  - PASSED");
			   		} } catch (Exception e)
		
		{	System.out.println("BOOKS - Book opened on button over the image  - FAILED");
			ScreenBUGBookOpen();		
			}
		return this;
	}
		public BookPage proverkaPlusMenuReadBook() {
		try {
        	if (driver.findElement(By.xpath("//*[@id=\"reader\"]/div[2]/div/div/div[3]")).isDisplayed()) {
				System.out.println("BOOKS - Read now button on plus menu has been pressed - PASSED");
			   		} } catch (Exception e)
		
		{	System.out.println("BOOKS - Read now button on plus menu has been pressed - FAILED");
					ScreenBUGReadNowInPlusMenu();
			}
		return this;
	}
		public BookPage proverkaPlusMenuAddToColl() {
		try {
        	if (driver.findElement(By.xpath("//*[@id=\"feedback\"]/div[2]/a")).isDisplayed()) {
				System.out.println("BOOKS - Add to collection button on plus menu has been pressed - PASSED");
			   		} } catch (Exception e)
		
		{	System.out.println("BOOKS - Add to collection button on plus menu has been pressed - FAILED");
					ScreenBUGAddToCollecInPlusMenu();
			}
		return this;
	}
	public BookPage proverkaPlusMenuMoreInfo() {
		try {
        	if (driver.findElement(By.xpath("//*[@id=\"body_container\"]/div/div[1]/a")).isDisplayed()) {
				System.out.println("BOOKS - More info button on plus menu has been pressed - PASSED");
			   		} } catch (Exception e)
		
		{	System.out.println("BOOKS - More info button on plus menu has been pressed - FAILED");
			ScreenBUGMoreInfoInPlusMenu();		
			}
		return this;
	}
			public BookPage proverkaMessageAddToColl() {
		try {
        	if (driver.findElement(By.xpath("//*[@id=\"feedback\"]/div[2]/a")).isDisplayed()) {
				System.out.println("BOOKS - Add to collection button on plus menu has been pressed - PASSED");
			   		} } catch (Exception e)
		
		{	System.out.println("BOOKS - Add to collection button on plus menu has been pressed - FAILED");
			ScreenBUGMessageAddToCollection();		
			}
		return this;
	}
		public BookPage proverkaNeedHelp() {
		try {
        	if (driver.findElement(By.xpath("//*[@id=\"how-top\"]/h2")).isDisplayed()) {
				System.out.println("BOOKS - Need Help message in More info pages has been pressed - PASSED");
			   		} } catch (Exception e)
		
		{	System.out.println("BOOKS - Need Help message in More info pages has been pressed - FAILED");
			ScreenBUGNeedHelp();		
			}
		return this;
	}
	
}

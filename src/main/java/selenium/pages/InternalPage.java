package selenium.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InternalPage extends AnyPage {

	public InternalPage(PageManager pages) {
		super(pages);
    }
	
	// Right menu
	@FindBy(id="account_container")
	private WebElement accountIcon;
	
	@FindBy(xpath=".//*[@id='account_container']/ul/li[1]/a")
	private WebElement rightMyAccount;
	
	@FindBy(xpath="//*[@id=\"account_container\"]/ul/li[7]/a")
	private WebElement rightLogButton;
	 
	
	// Music Tab
	@FindBy(id="albums_tab")
	private WebElement musicTab;
	
	//Book Tab
	@FindBy(id="books_tab")
	private WebElement bookTab;
	
	//Movie Tab
	@FindBy(id="movies_tab") 
	private WebElement movieTab;
	
	//Game Tab
	@FindBy(id="games_tab") 
	private WebElement gameTab;
	
 	// open collection page
	@FindBy(xpath = "//*[@id=\"account_container\"]/ul/li[3]/a")
	private WebElement clickCollectionLeftMenu;
	
	// open queue page
	@FindBy(xpath = "//*[@id=\"account_container\"]/ul/li[4]/a") 
	private WebElement queueLeftMenu;
	
	// open queue page
	@FindBy(id="software_tab") 
	private WebElement softwareTab;
	
	
	
	
	public InternalPage clickAccountIcon() {
		accountIcon.click();
		return this;
	}
	
	public InternalPage clickRightogButton() {
		rightLogButton.click();
		return this;
	}
	
	public InternalPage clickMyAccount() {
		rightMyAccount.click();
		return this;
	}
	
	public MyAccountPage goToMyAccountPage() {
		accountIcon.click();
		rightMyAccount.click();
		return pages.myAccountPage;
		}
	
	public MusicPage goToMusicPage() {
		musicTab.click();
		return pages.musicPage;
		
	}
	
	
	 public InternalPage ensurePageLoaded() {
		    super.ensurePageLoaded();
		  wait.until(presenceOfElementLocated(By.id("logo_container")));
		    return this;
		  }

	public BookPage goToBookPage() {
		bookTab.click();
		return pages.bookPage;
		
	}

	public MoviePage goToMoviePage() {
	movieTab.click();
	return pages.moviePage;
		
	}
	public GamePage goToGamePage() {
		gameTab.click();
		return pages.gamePage;
			
		}
	
	public CollectionPage goToCollectionPage() {
	accountIcon.click();
	clickCollectionLeftMenu.click();
	return pages.collectionPage;
		
	}
	
	public QueuePage goToQeuePage() {
	accountIcon.click();
	queueLeftMenu.click();
	return pages.queuePage;
	}
	public SoftwarePage goToSoftwarePage() {
		softwareTab.click();
		return pages.softwarePage;
			
		}
}

package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageManager {
	 private WebDriver driver;

	  public LoginPage loginPage;
	  public InternalPage internalPage;
	  public MusicPage musicPage;
	  public BookPage bookPage;
	  public MyAccountPage myAccountPage;
	  public MoviePage moviePage;
	  public CollectionPage collectionPage;
      public QueuePage queuePage;
	  public SearchPage searchPage;
	  public SoftwarePage softwarePage;
	  public GamePage gamePage;
 


	  public PageManager(WebDriver driver) {
	    this.driver = driver;
	    loginPage = initElements(new LoginPage(this));
	    internalPage = initElements(new InternalPage(this));
	    musicPage = initElements(new MusicPage(this));
	    bookPage = initElements(new BookPage(this));
	    myAccountPage = initElements(new MyAccountPage(this));
	    moviePage = initElements(new MoviePage(this));
       collectionPage = initElements(new CollectionPage(this));
        queuePage = initElements(new QueuePage(this));
        searchPage = initElements(new SearchPage(this));
        softwarePage = initElements(new SoftwarePage(this));
        gamePage = initElements(new GamePage(this));
	  }
	  
	  private <T extends Page> T initElements(T page) {
	    //PageFactory.initElements(driver, page);
	    //PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), page);
	    PageFactory.initElements(new DisplayedElementLocatorFactory(driver, 10), page);
	    return page;
	  }
	  
	  public WebDriver getWebDriver() {
	    return driver;
	  }
}

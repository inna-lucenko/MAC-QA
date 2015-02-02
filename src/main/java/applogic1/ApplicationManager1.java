package applogic1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;

import applogic.ApplicationManager;
import applogic.BookHelper;
import applogic.CollectionHelper;
import applogic.MoviesHelper;
import applogic.MusicHelper;
import applogic.NavigationHelper;
import applogic.QueueHelper;
import applogic.SearchHelper;
import applogic.SoftwareHelper;
import applogic.UserHelper;
import selenium.pages.GameHelper;
import selenium.util.Browser;
import selenium.util.PropertyLoader;
import selenium.webdriver.WebDriverFactory;


public class ApplicationManager1 implements ApplicationManager{
	
		  private UserHelper userHelper;
		  private NavigationHelper navHelper;
		  private BookHelper bookHelper;
		  private MusicHelper musicHelper;
		  private MoviesHelper moviesHelper;
		  private CollectionHelper collectionHelper;
		  private QueueHelper queueHelper;
		  private SearchHelper1 searchHelper;
		  private SoftwareHelper1 softwareHelper;
		  private GameHelper1 gameHelper;
		  

		  private WebDriver driver;
		  private String baseUrl;
		  private String movieUrl;
		  private String bookUrl;
		  private String musicUrl;
		  private String collectionUrl;
		  private String queueUrl;
		  private String searchUrl;
		  private String softwareUrl;
		  private String gameUrl; 
				  
		  public ApplicationManager1() {
		    baseUrl = PropertyLoader.loadProperty("site.url");
		    String gridHubUrl = PropertyLoader.loadProperty("grid2.hub");

		    Browser browser = new Browser();
		    browser.setName(PropertyLoader.loadProperty("browser.name"));
		    browser.setVersion(PropertyLoader.loadProperty("browser.version"));
		    browser.setPlatform(PropertyLoader.loadProperty("browser.platform"));

		    String username = PropertyLoader.loadProperty("user.username");
		    String password = PropertyLoader.loadProperty("user.password");
		    
		    driver = WebDriverFactory.getInstance(gridHubUrl, browser, username, password);
		  
		    userHelper = new UserHelper1(this);
		    navHelper = new NavigationHelper1(this);
		    bookHelper = new BookHelper1(this);
		    musicHelper = new MusicHelper1(this);
		    moviesHelper = new MoviesHelper1(this) ;
		    collectionHelper = new CollectionHelper1(this);
		    queueHelper = new QueueHelper1(this);
		    searchHelper = new SearchHelper1(this);
		    softwareHelper = new SoftwareHelper1(this);
		    gameHelper = new GameHelper1(this);
		   			

		    getNavigationHelper().openMainPage();
		  }
		  
		  @Override
		  public GameHelper getGameHelper() {
		    return gameHelper;
		  }
		  @Override
		  public SearchHelper getSearchHelper() {
		    return searchHelper;
		  }
		  
		  @Override
		  public UserHelper getUserHelper() {
		    return userHelper;
		  }
          @Override
		   public BookHelper getBookHelper() {
			return bookHelper;
		   }
          
		   @Override
		   public MusicHelper getMusicHelper() {
			return musicHelper;
		   }
		   @Override
		   public MoviesHelper getMoviesHelper() {
			return moviesHelper;
		   }
		  
         
		  @Override
		  public NavigationHelper getNavigationHelper() {
		 return navHelper;
		  }

		  protected WebDriver getWebDriver() {
		    return driver;
		  }

		  public String getBaseUrl() {
		    return baseUrl;
		  }
		  


		  @Override
		  public void stop() {
		    if (driver != null) {
		      driver.quit();
		    }
		  }

		public String getMovieUrl() {
			return movieUrl;
		}
		public String getGameUrl() {
			return gameUrl;
		}
		public String getBookUrl() {
			return bookUrl;
		}
		public String getMusicUrl() {
			return musicUrl;
		}
		public String getCollectionUrl() {
			return collectionUrl;
		}
		public String getQueueUrl() {
			return queueUrl;
		}
		public String getSearchUrl() {
			return searchUrl;
		}
		public CollectionHelper getCollectionHelper() {
			return collectionHelper;
		}

		public void setCollectionHelper(CollectionHelper collectionHelper) {
			this.collectionHelper = collectionHelper;
		}

		@Override
		public QueueHelper getQueueHelper() {
			return queueHelper;
		}
		public String getSoftwareUrl() {
			return softwareUrl;
		}
	
		@Override
		public SoftwareHelper getSoftwareHelper() {
			return softwareHelper;
		}
		
        
         
		}


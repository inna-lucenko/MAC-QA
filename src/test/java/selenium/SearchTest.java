package selenium;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selenium.pages.TestBase;

public class SearchTest extends TestBase {
	@BeforeClass
	public void login (){
		/* if(app.getUserHelper().isloginIn())
		 { return;}*/
		app.getUserHelper().loginAs("test4_inna4@jo-games.com", "123123");
	   app.getNavigationHelper().openMainPage();
	  
		System.out.println("SEARCH_PAGE - PASSED");
		   
		}
	@BeforeMethod
	public void mayBeCollectionPageOpen() throws Exception {
		app.getNavigationHelper().openMainPage();
		app.getSearchHelper().putAnyInfoIntoSearchField("Evil");
		Thread.sleep(5000);
		app.getSearchHelper().clickButtonSearch();
		Thread.sleep(5000);
		System.out.println("SEARCH PAGE - icon Search has been pressed - PASSED");
	}
	@Test
	public void clickOverImageMovie() throws Exception {
		app.getSearchHelper().clickOverImageMovie();
		Thread.sleep(5000);
		System.out.println("");
	app.getSearchHelper().checkMoreInfoMovieOpen();
	Thread.sleep(5000);
	}
	@Test
	public void playAnyMoviesInSearch() throws Exception {
		app.getSearchHelper().playAnyMovieInSearch();
		Thread.sleep(5000);
		System.out.println("");
		app.getSearchHelper().checkMovieOpen();
		Thread.sleep(5000);
		
	}
	
	@Test
	public void ToColectionMovieInSearchPage() throws Exception {
		app.getSearchHelper().AddToColectionMovieInSearchPage();
		Thread.sleep(5000);
		System.out.println("");
		app.getSearchHelper().checkAddMovieToCollection();
		Thread.sleep(5000);
}
	@Test
	public void MoreInfoMovieInSearchPage() throws Exception {
		app.getSearchHelper().MoreInfoMovieInSearchPage();
		Thread.sleep(5000);
		System.out.println("SEARCH PAGE - more info movie opened in search page by plus menu - PASSED");
		app.getSearchHelper().checkMoreInfoMovieOpen();
		Thread.sleep(5000);
}
	@Test
	public void clickOverImageMusic() throws Exception {
		app.getSearchHelper().clickOverImageMusic();
		Thread.sleep(5000);
		System.out.println("");
		app.getSearchHelper().checkMoreInfoMusicOpen();
		Thread.sleep(5000);
	}
	@Test
	public void playAnyMusicInSearch() throws Exception {
		app.getSearchHelper().playAnyMusicInSearch();
		Thread.sleep(5000);
		System.out.println("");
		app.getSearchHelper().checkMusicPlay();
		Thread.sleep(5000);
	}
	
	@Test
	public void ToColectionMusicInSearchPage() throws Exception {
		app.getSearchHelper().AddToColectionMusicInSearchPage();
		Thread.sleep(5000);
		System.out.println("");
		app.getSearchHelper().checkAddMusicToCollection();
		Thread.sleep(5000);

	}
	@Test
	public void MoreInfoMusicInSearchPage() throws Exception {
		app.getSearchHelper().MoreInfoMusicInSearchPage();
		Thread.sleep(5000);
		System.out.println("SEARCH PAGE -  more info album opened in search page by plus menu - PASSED");
		app.getSearchHelper().checkMoreInfoMusicOpen();
		Thread.sleep(5000);
	}
	@Test
	public void AddToQueueMusicInSearchPage() throws Exception {
		app.getSearchHelper().AddToQueueMusicInSearchPage();
		Thread.sleep(5000);
		System.out.println("");
		app.getSearchHelper().checkAddMusicToQueue();
		Thread.sleep(5000);}
	
	@Test
	public void clickOverImageBook() throws Exception {
		app.getSearchHelper().clickOverImageBok();
		Thread.sleep(5000);
		System.out.println("");
		app.getSearchHelper().checkMoreInfoBookOpen();
		Thread.sleep(5000);		
	}
	@Test
	public void readAnyBookInSearch() throws Exception {
		app.getSearchHelper().readAnyBookInSearch();
		Thread.sleep(5000);
		System.out.println("");
		app.getSearchHelper().checkBookOpen();
		Thread.sleep(5000);
	}
	
	@Test
	public void ToColectionBookInSearchPage() throws Exception {
		app.getSearchHelper().AddToColectionBookInSearchPage();
		Thread.sleep(5000);
		System.out.println("");
		app.getSearchHelper().checkAddBookToCollection();
		Thread.sleep(5000);}
	@Test
	public void MoreInfoBookInSearchPage() throws Exception {
		app.getSearchHelper().MoreInfoBookInSearchPage();
		Thread.sleep(5000);
		System.out.println("SEARCH PAGE - book added to colection in search page by plus menu - PASSED");
		app.getSearchHelper().checkMoreInfoBookOpen();
		Thread.sleep(5000);}
}
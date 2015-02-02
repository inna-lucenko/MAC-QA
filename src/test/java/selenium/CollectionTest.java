package selenium;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selenium.pages.TestBase;

public class CollectionTest extends TestBase {

	@BeforeClass
	public void login (){
		/* if(app.getUserHelper().isloginIn())
		 { return;}*/
		app.getUserHelper().loginAs("test4_inna4@jo-games.com", "123123");
	   app.getNavigationHelper().openCollectionPage();
	  
		System.out.println("COLLECTION_PAGE - PASSED");
		   
		}

	
	
	@BeforeMethod
	public void mayBeCollectionPageOpen() {
		if (app.getCollectionHelper().isCollectionPage()) {
			return;
		}
		app.getNavigationHelper().openCollectionPagePlayer();}
		
	@Test
	public void openCollectionPage() throws Exception {
		app.getCollectionHelper().filterMediaInCollectionPage();
		Thread.sleep(5000);
		System.out.println("COLLECTION PAGE - filter media in collection page has been pressed open - PASSED");
		app.getCollectionHelper().MoviesFilterMediaInCollectionPage();
		Thread.sleep(5000);
		System.out.println("COLLECTION PAGE - movies on filter media in collection page has been pressed - PASSED");
		app.getCollectionHelper().filterMediaInCollectionPage();
		app.getCollectionHelper().BookFilterMediaInCollectionPage();
		Thread.sleep(5000);
		System.out.println("COLLECTION PAGE - book on filter media in collection page has been pressed - PASSED");
		app.getCollectionHelper().filterMediaInCollectionPage();
		app.getCollectionHelper().MusicFilterMediaInCollectionPage();
		Thread.sleep(5000);
		System.out.println("COLLECTION PAGE - music on filter media in collection has been pressed - PASSED");
	
	}
	@Test
	public void AnyCompositonPlayInCollectionPage() throws Exception {
		app.getCollectionHelper().playFirstComposition();
		Thread.sleep(10000);
		app.getCollectionHelper().CheckOpenPlayerInCollection();
		
	}

	@Test
	public void DeleteAnyCompositionInCollectionPage() throws Exception {
		app.getCollectionHelper().DeleteAnyCompositionInCollectionPage();
		Thread.sleep(5000);
		System.out.println("COLLECTION PAGE - delete button in collection page has been pressed - PASSED");
	}

	@Test
	public void PlayLaterInPlusMenuInCollectionPage() throws Exception {
		app.getCollectionHelper().filterMediaInCollectionPage();
		Thread.sleep(5000);
		app.getCollectionHelper().MusicFilterMediaInCollectionPage();
		Thread.sleep(10000);
		app.getCollectionHelper().PlayLaterInPlusMenuInCollectionPage();
		Thread.sleep(5000);
		System.out.println("COLLECTION PAGE - play later in collection page has been pressed - PASSED");
	}
	
}

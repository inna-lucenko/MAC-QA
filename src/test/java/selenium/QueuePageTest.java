package selenium;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selenium.pages.TestBase;

public class QueuePageTest extends TestBase {
	
	@BeforeClass
	public void login (){
		/* if(app.getUserHelper().isloginIn())
		 { return;}*/
		app.getUserHelper().loginAs("test4_inna4@jo-games.com", "123123");
	   app.getNavigationHelper().openQeuePage();
	  
		System.out.println("QUEUE PAGE - PASSED");
	
		}
	@BeforeMethod
	public void mayBeQueuePageOpen() {
		if (app.getQueueHelper().isQeuePage()) {
			return;
		}
		app.getNavigationHelper().openMusicQeuePage();
		}
		

	@Test
	public void openQueuePage() throws Exception {
		Thread.sleep(15000);
		app.getQueueHelper().playFirstCompositioninQeuePage();
		Thread.sleep(10000);
		app.getQueueHelper().CheckOpenPlayerInQueue();
	}

@Test
	public void DeleteAnyCompositionInQueuePage() throws Exception {
	Thread.sleep(15000);
		app.getQueueHelper().DeleteCompositionInQeuePage();
		Thread.sleep(5000);
		System.out.println("QUEUE PAGE - delete button in queue page has been pressed - PASSED");
	}

	@Test
	public void PlayLaterInPlusMenuInQueuePage() throws Exception {
		Thread.sleep(15000);
		app.getQueueHelper().PlayLaterInPlusMenuInCollectionPage();
		Thread.sleep(5000);
		System.out.println("QUEUE PAGE - play later in collection page has been pressed - PASSED");
	}
	
}


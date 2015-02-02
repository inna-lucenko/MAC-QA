package selenium.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class QueuePage extends CollectionANDQueueScreen {

	public QueuePage(selenium.pages.PageManager pages) {
		super(pages);
	}
			// play any song in queue 
			@FindBy(xpath = "//*[@id=\"queue-wrapper\"]/div[1]/div[1]/div")
			private WebElement clickPlayAnyCompositionInQueue;
			// delete any composition in queue
			@FindBy(xpath = "//*[@id=\"queue-wrapper\"]/div[1]/div[4]/div[2]/div") 
			private WebElement clickDeleteAnyCompositionInQueuePage;	
			// any hover record in queue
			@FindBy(xpath = "//*[@id=\"queue-wrapper\"]/div[1]/div[2]")
			private WebElement hoverImageRecordInQueuePage;	
			// plus menu on music in queue page
			@FindBy(xpath = "//*[@id=\"queue-wrapper\"]/div[1]/div[4]/div[1]/div") 
			private WebElement plusmenuOnMusicInQueuePage;	
			// play latter on plus menu on music in queue page
			@FindBy(xpath = "//*[@id=\"queue-wrapper\"]/div[1]/div[4]/div[1]/div/ul/li/a") 
			private WebElement playLaterOnPlusMenuOnMusicInQueuePage;	
			
			public QueuePage PlayFirstCompositionInMusic()
			{ clickPlayAnyCompositionInQueue.click();
			return this;
			}
			
			public QueuePage DeleteAnyCompositionInQeue()
			{ clickDeleteAnyCompositionInQueuePage.click();
			return this;
			}
			public QueuePage movetoRecord() {
				new Actions(driver)
				.moveToElement(hoverImageRecordInQueuePage)
				.perform();
				return this;
			}
			
			public QueuePage clickPlusMenuOnMusicInQueuePage()
			{ plusmenuOnMusicInQueuePage.click();
			return this;}
			
			public QueuePage clickPlayLaterPlusMenuOnMusicInQueuePage()
			{ playLaterOnPlusMenuOnMusicInQueuePage.click();
			return this;}
			
			
			public QueuePage checkOpenPlayerInQueuePage() {
				try {
		        	if (driver.findElement(By.xpath("//*[@id=\"audio-player_wrapper\"]")).isDisplayed()) {
						System.out.println("QUEUE PAGE - first track has been played - PASSED");
					   		} } catch (Exception e)
				
				{	System.out.println("QUEUE PAGE - first track has been played - FAILED");
							ScreenBUGMusicPlayerOpenInQueuePage();
					}
				return this;		
			}
			public QueuePage ensurePageLoaded() {
				super.ensurePageLoaded();
				wait.until(presenceOfElementLocated(By
						.id("browse_page"))); 
				return this;
			}
			
}

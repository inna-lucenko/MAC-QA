package selenium.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CollectionPage extends CollectionANDQueueScreen {
			
		public CollectionPage(selenium.pages.PageManager pages) {
			super(pages);
	}
		// click Filter media in collection page
		@FindBy(xpath = "//*[@id=\"browse_wrapper\"]/div[1]/div") 
		private WebElement clickFilterCollection;
		// click in Filter media music
		@FindBy(xpath = "//*[@id=\"browse_wrapper\"]/div[1]/ul/li[4]/a")
		private WebElement clickMusicInFilterCollection;
		// click in Filter media book
		@FindBy(xpath = "//*[@id=\"browse_wrapper\"]/div[1]/ul/li[5]/a")
		private WebElement clickBookInFilterCollection;
		// click in Filter media movies
		@FindBy(xpath = "//*[@id=\"browse_wrapper\"]/div[1]/ul/li[3]/a")
		private WebElement clickMoviesInFilterCollection;
		// play any song
		@FindBy(xpath = "//*[@id=\"browse_wrapper\"]/div[5]/div[1]/a")
		private WebElement clickPlayAnyCompositionInCollection;
		// delete any composition 
		@FindBy(xpath = "//*[@id=\"browse_wrapper\"]/div[12]/div[5]/div[3]/div")
		private WebElement clickDeleteAnyCompositionInCollectionPage;	
		// any hover record
		@FindBy(xpath = "//*[@id=\"browse_wrapper\"]/div[12]/div[3]")
		private WebElement hoverImageRecordInCollectionPage;	
		// plus menu on music in collection page
		@FindBy(xpath = "//*[@id=\"browse_wrapper\"]/div[12]/div[5]/div[1]/div/button")
		private WebElement plusmenuOnMusicInCollectionPage;	
		// play latter on plus menu on music in collection page
		@FindBy(xpath = "//*[@id=\"browse_wrapper\"]/div[12]/div[5]/div[1]/div/ul/li/a")
		private WebElement playLaterOnPlusMenuOnMusicInCollectionPage;			
		
		public CollectionPage movetoRecord() {
			new Actions(driver).moveToElement(hoverImageRecordInCollectionPage).perform();
			return this;}
		
		public CollectionPage 	DeleteCompositionInCollectionPage()
		{ clickDeleteAnyCompositionInCollectionPage.click();
		return this;
		}
		public CollectionPage ClickPlusMenuOnMusicInCollectionPage()
		{ plusmenuOnMusicInCollectionPage.click();
		return this;}
		
		public CollectionPage ClickPlayLaterPlusMenuOnMusicInCollectionPage()
		{ playLaterOnPlusMenuOnMusicInCollectionPage.click();
		return this;}
		
		public CollectionPage ClickFilterInCollectionPage()
		   { clickFilterCollection.click();
		 	   return this;}
		
		public CollectionPage ClickFilterBookInCollectionPage()
		{
			clickBookInFilterCollection.click();
		   return this;
		   }
		public CollectionPage ClickFilterMusicInCollectionPage()
		{
			clickMusicInFilterCollection.click();
		   return this;
		   }
		public CollectionPage ClickFilterMoviesInCollectionPage()
			{
				  clickMoviesInFilterCollection.click();
				   return this;
				   }
		
		public CollectionPage PlayFirstCompositionInMusic()
		{ clickPlayAnyCompositionInCollection.click();
		return this;
		}
	
			public CollectionPage CheckOpenPlayer()	{
			try {
	        	if (driver.findElement(By.xpath("//*[@id=\"audio-player_wrapper\"]")).isDisplayed()) {
					System.out.println("COLLECTION PAGE - Music player open and song play in collection page - PASSED");
				   		} } catch (Exception e)
			
			{	System.out.println("COLLECTION PAGE - Music player open and song play in collection page - FAILED");
				ScreenBUGMusicPlayerOpenInCollectionPage();		
				}
			return this;
		}
		

		
		
		
		
		public CollectionPage ensurePageLoaded() {
			super.ensurePageLoaded();
			wait.until(presenceOfElementLocated(By
					.xpath("//*[@id=\"browse_wrapper\"]/h2"))); 
			return this;
		}
}

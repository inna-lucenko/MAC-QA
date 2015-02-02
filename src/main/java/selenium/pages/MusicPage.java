package selenium.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class MusicPage extends AnyPage{
	
	Screenshot scsh = new Screenshot();
	FileWr file;
	String screenDir;
	public MusicPage(selenium.pages.PageManager pages) {
		super(pages);
		}

	
		@FindBy(xpath="//*[@id=\"browse_element_wrapper\"]/div[6]/div/div/a/button") 
		private WebElement playbuttonOverImage;
		
		@FindBy(xpath="//*[@id=\"browse_element_wrapper\"]/div[6]/div/a/img") 
		private WebElement imageMusic;
		
		// select plus menu
		@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[6]/div/div/div/button")
		private WebElement plusMenu;

		// add to QUEUE for plus menu
		@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[6]/div[1]/div/div/ul/li[1]/a")
		private WebElement addToQueueInPlusMenu;
		
		// Read now for plus menu
		@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[6]/div[1]/div/div/ul/li[3]/a")
		private WebElement playNowInPlusMenu;

		// add to collection for plus menu
		@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[6]/div[1]/div/div/ul/li[2]/a")
		private WebElement addToCollectionInPlusMenu;

		// MoreInfo for plus menu

		@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[6]/div[1]/div/div/ul/li[4]/a")
		private WebElement moreInfoInPlusMenu;
		
		@FindBy(xpath = "//div [@class='message']/a")
		private WebElement messageCollection;
		
		
		@FindBy(xpath = "//*[@id=\"related_container\"]/div[1]/div/div/a/button")
		private WebElement buttonplayoverImageAlbummorelike;
		
		// Select  over image in More Like section
		@FindBy(xpath = "//*[@id=\"related_container\"]/div[1]/div/a/img")
		private WebElement overImageAlbum;
		
		// plus menu in More like section		
		@FindBy(xpath = "//*[@id=\"related_container\"]/div[1]/div/div/div/button") 
		private WebElement moreLikePlusMenu; 
		
		// More info on plus menu in More Like section
		@FindBy(xpath = "//*[@id=\"related_container\"]/div[1]/div[1]/div/div/ul/li[4]/a")
		private WebElement moreLikeMoreLikePlusMenu; 
		
		// Play now on plus menu in More Like section
		@FindBy(xpath = "//*[@id=\"related_container\"]/div[2]/div[1]/div/div/ul/li[3]/a")
		private WebElement moreLikePlayNowPlusMenu; 
		
		// Add to collection on plus menu in More Like section
		@FindBy(xpath = "//*[@id=\"related_container\"]/div[1]/div[1]/div/div/ul/li[2]/a")
		private WebElement moreLikeAddAlbumPlusMenu; 
		
		// Add to queue on plus menu in More Like section
		@FindBy(xpath = "//*[@id=\"related_container\"]/div[1]/div[1]/div/div/ul/li[1]/a")
		private WebElement moreLikeAddAlbumToQueuePlusMenu; 
		
		// Click Add collection button in More info page
		@FindBy(xpath = " //*[@id=\"body_container\"]/div/div[1]/button")
		private WebElement buttonAddToCollection;
		
		// Click message Need Help
		@FindBy(xpath = "//*[@id=\"body_container\"]/div/div[1]/a")
		private WebElement messageNeedHelp; 
		
		// Move to CS in game genre
		@FindBy(xpath = "//*[@id=\"games_tab\"]/span") 
		private WebElement moveCSInGame;
		// Move to CS in music genre
		@FindBy(xpath = "//*[@id=\"albums_tab\"]/span") 
		private WebElement moveCSInMusic;
		//select genre in musics CS
		@FindBy(xpath = "/html/body/div[1]/header/nav/ul/li[3]/div/ul[3]/li[1]/a") 
		private WebElement clickGenrePopInMusic;
		// move music in war genre
		@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[1]/div/a/img") 
		private WebElement moveMusicGenrePop;
		// play music in war genre
		@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[1]/div/div/a/button") 
		private WebElement playMusicGenrePop;
		
		
		public MusicPage ClickPlayMusicPop() {
			
			new Actions(driver).moveToElement(moveMusicGenrePop).perform();
			playMusicGenrePop.click();
			return this;
		}
		
		public MusicPage moveCSinMusic() {
			new Actions(driver).moveToElement(moveCSInGame).moveToElement(moveCSInMusic).perform();
			return this;
		}
		
		public MusicPage ClickGenrePop() {
			clickGenrePopInMusic.click();
			return this;
		}
		
		public MusicPage ClickMessageNeedHelp()
		   { messageNeedHelp.click();
		   return this;
		   }	
		
		   public MusicPage ClickButtonAddToCollection()
		   { buttonAddToCollection.click();
		   return this;
		   }
				
		public MusicPage ClickAddToQueueOnPlusMenuInLikeSection()
		   { moreLikeAddAlbumToQueuePlusMenu.click();
		   return this;
		   }
		
		public MusicPage ClickAddToCollectioOnPlusMenuInLikeSection()
		   { moreLikeAddAlbumPlusMenu.click();
		   return this;
		   }
		
		public MusicPage ClickPlayNowOnPlusMenuInLikeSection()
		   { moreLikePlayNowPlusMenu.click();
		   return this;
		   }	
		
		public MusicPage ClickMoreLikeOnPlusMenuInLikeSection() {
			moreLikeMoreLikePlusMenu.click();
			return this;
		}
		
		public MusicPage movetooverImageAlbumtoLikeSection() {
			new Actions(driver).moveToElement(overImageAlbum).perform();
		//	overImageAlbum.click();
			return this;
		}
		public MusicPage PlayAlbumtoLikeSectionOverImage() {
			buttonplayoverImageAlbummorelike.click();
			return this;
		}
		
		
		public MusicPage ClickPlusMenuOverImageInLikeSection()
		   { new Actions(driver).moveToElement(overImageAlbum).perform();
		   moreLikePlusMenu.click();
		   return this;
		   }
		public MusicPage clickAddToQueuePlusMenu() {
			new Actions(driver).moveToElement(addToQueueInPlusMenu).perform();
			addToQueueInPlusMenu.click();
			return this;
		}
		public MusicPage clickAddToCollectionPlusMenu() {
			new Actions(driver).moveToElement(addToCollectionInPlusMenu).perform();
			addToCollectionInPlusMenu.click();
			return this;
		}
		public MusicPage clickMoreInfoPlusMenu() {
			new Actions(driver).moveToElement(moreInfoInPlusMenu).perform();
			moreInfoInPlusMenu.click();
			return this;
		}
		public MusicPage clickPlayNowPlusMenu() {
			playNowInPlusMenu.click();
			return this;
		}
		
		public MusicPage clickOnPlayButton() {
			playbuttonOverImage.click();
			return this;
		}
		
		public MusicPage movetoImagemusic() {
		new Actions(driver)
		.moveToElement(imageMusic)
		.perform();
		return this;
		}
	
		public MusicPage ensurePageLoaded() {
			super.ensurePageLoaded();
			wait.until(presenceOfElementLocated(By.xpath("//*[@id=\"browse_wrapper\"]/h4")));
			return this;
		}
		
		public MusicPage clickPlayPlusMenu() {
			new Actions(driver).moveToElement(plusMenu).perform();
			plusMenu.click();
			return this;
		}
		public MusicPage ClickColection() {
			messageCollection.click();
			return this;
		}
		public MusicPage provkaSegment() {
		try {
        	if (driver.findElement(By.xpath("//*[@id=\"browse_wrapper\"]/h4")).isDisplayed()) {
				System.out.println("MUSIC -content segments - album in genre POP has been played - PASSED");
			   		} } catch (Exception e)
		
		{	System.out.println("MUSIC -content segments - album in genre POP has been played - FAILED");
	     	ScreenBUGSegment();
		 
					
			}
		return this;
		}
		
		public MusicPage provkaPlayMusics() {
		try {
        	if (driver.findElement(By.xpath("//*[@id=\"audio-player_wrapper\"]")).isDisplayed()) {
				System.out.println("MUSICS - Music player opened on button over the image  - PASSED");
			   		} } catch (Exception e)
		
		{	System.out.println("MUSICS - Music player opened on button over the image  - FAILED ");
			ScreenBUGPlayerOpen();		
			}
		return this;
		}
		public MusicPage proverkaPlayMusicOnPlusMenu() {
		try {
        	if (driver.findElement(By.xpath("//*[@id=\"audio-player_wrapper\"]")).isDisplayed()) {
				System.out.println("MUSICS - Play now button on plus menu has been pressed - PASSED");
			   		} } catch (Exception e)
		
		{	System.out.println("MUSICS - Play now button on plus menu has been pressed - FAILED");
		ScreenBUGPlayerOpen();		
			}
		return this;
		}
		public MusicPage provAddCollInPlusMenu() {
		try {
        	if (driver.findElement(By.xpath("//*[@id=\"feedback\"]/div[2]/a")).isDisplayed()) {
				System.out.println("MUSICS - Add to collection button on plus menu has been pressed - PASSED");
			   		} } catch (Exception e)
		
		{	System.out.println("MUSICS - Add to collection button on plus menu has been pressed - FAILED");
					ScreenBUGAddToCollecInPlusMenu();
			}
		return this;
		}
		public MusicPage proverMoreInfoInPlusMenu() {
		try {
        	if (driver.findElement(By.xpath("//*[@id=\"body_container\"]/div/div[1]/button")).isDisplayed()) {
				System.out.println("MUSICS - More Info button on plus menu has been pressed - PASSED");
			   		} } catch (Exception e)
		
		{	System.out.println("MUSICS - More Info button on plus menu has been pressed - FAILED");
					ScreenBUGMoreInfoInPlusMenu();
			}
		return this;
		}
		public MusicPage provAddToQueueInPlusMenu() {
		try {
        	if (driver.findElement(By.xpath("//*[@id=\"feedback\"]/div[1]")).isDisplayed()) {
				System.out.println("MUSICS - Add to queue button on plus menu has been pressed - PASSED");
				
			   		} } catch (Exception e)
		
		{	System.out.println("MUSICS - Add to queue button on plus menu has been pressed - FAILED");
  	        ScreenBUGAddToQueueInPlusMenu();
		}
			
		return this;
		}
		
		
		public MusicPage proverkaPlayAlbubMoreLike() {
		try {
        	if (driver.findElement(By.xpath("//*[@id=\"audio-player_wrapper\"]")).isDisplayed()) {
				System.out.println("MUSICS - Play album over image in More Like sectin has been pressed - PASSED");
			   		} } catch (Exception e)
		
		{	System.out.println("MUSICS - Play album over image in More Like sectin has been pressed - FAILED");
				ScreenBUGMoreLike();	
			}
		return this;
		}
		
		
		public MusicPage proverkaButtonAddToCollection() {
		try {
        	if (driver.findElement(By.xpath("//*[@id=\"feedback\"]/div[2]/a")).isDisplayed()) {
				System.out.println("MUSIC - button Add to collection in more info page has been presed  - PASSED");
		
			   		} 
        	} catch (Exception e)
		
		{	System.out.println("MUSIC - button Add to collection in more info page has been presed  - FAILED");
				ScreenBUGAddCollection();	
			}
		return this;
		}
		
		

		public MusicPage provNeedHelp() {
			try {
	        	if (driver.findElement(By.xpath("//*[@id=\"how-top\"]/h2")).isDisplayed()) {
					System.out.println("MUSICS - Need Help message in More info pages has been pressed - PASSED");
	        	}
			}
					catch (Exception e)
			{	System.out.println("MUSICS - Need Help message in More info pages has been pressed - FAILED");
			ScreenBUGNeedHelp();
			}
			return this;
		        	
	  	}		

}

package selenium.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SoftwarePage extends AnyPage {
	public SoftwarePage(selenium.pages.PageManager pages) {
		super(pages);
		}
	public SoftwarePage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(presenceOfElementLocated(By.xpath("//*[@id=\"browse_wrapper\"]/h4")));
		return this;
	}
	    // download any software on hover image
		@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[3]/div/div/a/button")
		private WebElement downloadSoftwareHoverImage;

		@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[3]/a") 
		private WebElement hoverImageSoftware;

		// select plus menu
		@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[3]/div/div/div") 
		private WebElement plusMenu;

		// Download now for plus menu
		@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[3]/div[1]/div/div/ul/li[2]/a")
		private WebElement downloadNowInPlusMenu;

		// add to collection for plus menu
		@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[3]/div[1]/div/div/ul/li[1]/a")
		private WebElement addToCollectionInPlusMenu;

		// MoreInfo for plus menu
		@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[3]/div[1]/div/div/ul/li[3]/a")
		private WebElement moreInfoInPlusMenu;
		
		// Download any software on for MoreInfo
		@FindBy(xpath = "//*[@id=\"title_download_container\"]")
		private WebElement downloadSoftwareInMoreInfoPage;

		// Click message Need Help
		@FindBy(xpath = "//*[@id=\"body_container\"]/div/div[1]/a")
		private WebElement messageNeedHelp; 

		// Select  hover image in More Like section
		@FindBy(xpath = "//*[@id=\"related_container\"]/div[1]/a") 
		private WebElement overImageSoftwareMoreLike;
		
		// Click download  over image in More Like section
		@FindBy(xpath = "//*[@id=\"related_container\"]/div[1]/div/div/a/button")
		private WebElement moreLikeDownload; 
		
		// add to collection in More info page
		@FindBy(xpath = "//*[@id=\"body_container\"]/div/div[1]/button")
		private WebElement moreInfoAddToCollectionDownload; 
		
		
		// Move to CS in game genre
		@FindBy(xpath = "//*[@id=\"games_tab\"]/span") 
		private WebElement moveCSInGame;
		// Move to CS in software genre
		@FindBy(xpath = "//*[@id=\"software_tab\"]/span") 
		private WebElement moveCSInSoftware;
		//select genre in Software CS
		@FindBy(xpath = "/html/body/div[1]/header/nav/ul/li[5]/div/ul[3]/li[1]/a") 
		private WebElement clickGenreGraphicInSoftware;
		// move Software in graphic genre
		@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[1]/a") 
		private WebElement moveSoftwareGenreGraphic;
		// download Software in graphic genre
		@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[1]/div/div/a/button") 
		private WebElement downLoadSoftwareGenreGraphic;
		
		
		public SoftwarePage ClickDownloadSoftwareGraphic() {
			
			new Actions(driver).moveToElement(moveSoftwareGenreGraphic).perform();
			downLoadSoftwareGenreGraphic.click();
			return this;
		}
		
		public SoftwarePage moveCSinSoftware() {
			new Actions(driver).moveToElement(moveCSInGame).moveToElement(moveCSInSoftware).perform();
			return this;
		}
		
		public SoftwarePage ClickGenreGraphic() {
			clickGenreGraphicInSoftware.click();
			return this;
		}
		
		
		public SoftwarePage ClickAddToCollectionButtonInMoreInfoPage()
		   { moreInfoAddToCollectionDownload.click();
		   return this;
		   }
		
		public SoftwarePage movetooverImageSoftwareToLikeSection() {
			new Actions(driver).moveToElement(overImageSoftwareMoreLike).perform();
			return this;
		}
		public SoftwarePage ClickdownloadSoftwareOverImageInLikeSection()
		   { moreLikeDownload.click();
		   return this;
		   }	
		public SoftwarePage ClickMessageNeedHelp()
		   { messageNeedHelp.click();
		   return this;
		   }	
	   

		public SoftwarePage SelectMoreInfo() {
			moreInfoInPlusMenu.click();
			return this;
		}

		public SoftwarePage DownloadSoftware() {
			downloadSoftwareInMoreInfoPage.click();
			return this;
		}

		public SoftwarePage clicMenuPlayNow() {
			downloadNowInPlusMenu.click();
			return this;
		}

		public SoftwarePage clickPlusMenu() {
			new Actions(driver).moveToElement(plusMenu).perform();
			plusMenu.click();
			return this;
		}

		public SoftwarePage clickOnPlayButton() {
			downloadSoftwareHoverImage.click();
			return this;
		}

		public SoftwarePage movetoImage() {
			new Actions(driver).moveToElement(hoverImageSoftware).perform();
			return this;
		}

	
		public SoftwarePage clickAddToCollection() {
			addToCollectionInPlusMenu.click();
			return this;
		}


}

package selenium.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class GamePage extends AnyPage {
	

	public GamePage(selenium.pages.PageManager pages) {
		super(pages);
		}
	// play html5 game on hover image
	@FindBy(xpath = "//*[@id=\"ios-games-link\"]")
	private WebElement selectIOS;
	
	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[1]/div/div/a/button")
	private WebElement playGameHTML5HoverImage;

	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[1]/div/a/img")
	private WebElement hoverImageGameHTML5;

	// play MAC game on hover image
	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[1]/div/div/a/button")
	private WebElement playGameMacHoverImage;
	
	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[1]/div/a/img") 
	private WebElement hoverPlayMacGame;

	// select plus menu HTML5
	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[53]/div/div/div/button")
	private WebElement plusMenuHTML5;

	// play now for plus menu HTML5
	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[53]/div[1]/div/div/ul/li[2]/a")
	private WebElement playNowInPlusMenuHTML5;
	// add to collection for plus menu HTML5
	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[53]/div[1]/div/div/ul/li[1]/a")
	private WebElement addToCollectionInPlusMenuHTML5;
	// MoreInfo for plus menu HTML5
	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[53]/div[1]/div/div/ul/li[3]/a")
	private WebElement moreInfoInPlusMenuHTML5;
	
	// Play game html5 on for MoreInfo
	@FindBy(xpath = "//*[@id=\"title_download_container\"]")
	private WebElement playGameHTML5InMoreInfoPage;
	// Click message Need Help
	@FindBy(xpath = "//*[@id=\"body_container\"]/div/div[1]/a")
	private WebElement messageNeedHelpHTML5; 
	// Click Add collection button in More info page
	@FindBy(xpath = "//*[@id=\"body_container\"]/div/div[1]/button")  
	private WebElement buttonAddToCollectionHTML5;
	
	
	// select plus menu MAC
	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[12]/div/div/div/button")
	private WebElement plusMenuMAC;

	// play now for plus menu MAC
	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[12]/div[1]/div/div/ul/li[2]/a")
	private WebElement playNowInPlusMenuMAC;
	// add to collection for plus menu MAC
	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[12]/div[1]/div/div/ul/li[1]/a") 
	private WebElement addToCollectionInPlusMenuMAC;
	// MoreInfo for plus menu MAC
	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[12]/div[1]/div/div/ul/li[3]/a")
	private WebElement moreInfoInPlusMenuMAC;
	
	
	// install MAC game in MoreInfoPage
	@FindBy(xpath = "//*[@id=\"download_yummy\"]") 
	private WebElement installPlayMacGameInMoreInfo;
	// Click message Need Help MAC
	@FindBy(xpath = "//*[@id=\"body_container\"]/div[2]/div[1]/a")
	private WebElement messageNeedHelpMAC; 
	// Click Add collection button in More info page MAC
	@FindBy(xpath = "//*[@id=\"body_container\"]/div/div[1]/button") 
	private WebElement buttonAddToCollectionMAC;
	// Reinstall the player button in More info page
	@FindBy(xpath = "//*[@id=\"download_yummy\"]") 
	private WebElement reinstallThePlayer;
	

	
	// Select  over image MAC in More Like section
	@FindBy(xpath = "//*[@id=\"related_container\"]/div[1]/a") 
	private WebElement LikeSectionHoverImageGameMAC;
	// Click play game MAC over image in More Like section
	@FindBy(xpath = "//*[@id=\"related_container\"]/div[1]/div/div/a/button")
	private WebElement moreLikePLayMacGame; 
	
	// Select  over image HTML5 in More Like section 
	@FindBy(xpath = "//*[@id=\"related_container\"]/div[1]/a")
	private WebElement LikeSectionHoverImageGameHTML5; 
	//	Click play game HTML5 over image in More Like section
	@FindBy(xpath = "//*[@id=\"related_container\"]/div[1]/div/div/a/button")
	private WebElement moreLikePlayHTML5; 
	
	
	// Move to CS in game genre
	@FindBy(xpath = "//*[@id=\"games_tab\"]/span") 
	private WebElement moveCSInGame;
	// Move to CS in game genre
	@FindBy(xpath = "//*[@id=\"software_tab\"]/span") 
	private WebElement moveCSInSoftware;
	//select genre in game CS
	@FindBy(xpath = "/html/body/div[1]/header/nav/ul/li[1]/div/ul[1]/li[4]/a") 
	private WebElement clickGenreArcadeInGame;
	// move game in arcade genre
	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[24]/div/a/img") 
	private WebElement moveGameGenreArcade;
	// download game in arcade genre
	@FindBy(xpath = "//*[@id=\"browse_element_wrapper\"]/div[24]/div/div/a/button") 
	private WebElement downLoadGameGenreArcade;
	
	
	public GamePage ClickDownloadGameArcade() {
		
		new Actions(driver).moveToElement(moveGameGenreArcade).perform();
		downLoadGameGenreArcade.click();
		return this;
	}
	
	public GamePage moveCSinGame() {
		new Actions(driver).moveToElement(moveCSInSoftware).moveToElement(moveCSInGame).perform();
		return this;
	}
	
	public GamePage ClickGenreArcade() {
		clickGenreArcadeInGame.click();
		return this;
	}
	
	
		
	public GamePage movetooverImageGametoLikeSectionMAC() {
		new Actions(driver).moveToElement(LikeSectionHoverImageGameMAC).perform();
		return this;
	}
	public GamePage ClickPlayGameOverImageInLikeSection()
	   { moreLikePLayMacGame.click();
	   return this;
	   }	
	public GamePage movetooverImageGametoLikeSectionHTML5() {
		new Actions(driver).moveToElement(LikeSectionHoverImageGameHTML5).perform();
		return this;
	}
	public GamePage ClickPlayGameHTML5OverImageInLikeSection()
	   { moreLikePlayHTML5.click();
	   return this;
	   }	
	
	
	
		public GamePage clickOnPlayButtonHTML5() {
		playGameHTML5HoverImage.click();
		return this;
	}
		
		public GamePage clickOnPlayButtonMAC() {
		playGameMacHoverImage.click();
		return this;
	}
		public GamePage clickIOS() {
		selectIOS.click();
			return this;
		}
		
		public GamePage movetoImageHTML5() {
			new Actions(driver).moveToElement(hoverImageGameHTML5).perform();
			return this;
		}
		
		public GamePage movetoImageMAC() {
			new Actions(driver).moveToElement(hoverPlayMacGame).perform();
			return this;
		}
		
		public GamePage openImageMAC() {
			hoverPlayMacGame.click();
			return this;
		}
		public GamePage openImageHTML5() {
			hoverImageGameHTML5.click();
			return this;
		}
		
		public GamePage clickPlusMenuHTML5() {
		plusMenuHTML5.click();
		return this;
	}	
		
		public GamePage clickPlusMenuMAC() {
		plusMenuMAC.click();
		return this;
	}
		public GamePage clickPlayNowMacInPlusMenu() {
		playNowInPlusMenuMAC.click();
		return this;
		}
		
		public GamePage clickPlayNowHTML5InPlusMenu() {
		playNowInPlusMenuHTML5.click();
		return this;
		}
		public GamePage clickAddToCollecyionMacInPlusMenu() {
		addToCollectionInPlusMenuMAC.click();
		return this;
		}	
		public GamePage clickAddToCollecyionHTML5InPlusMenu() {
		addToCollectionInPlusMenuHTML5.click();
		return this;
		}
		public GamePage clickMoreInfoMacInPlusMenu() {
		moreInfoInPlusMenuMAC.click();
		return this;
		}	
		public GamePage clickMoreInfoHTML5InPlusMenu() {
		moreInfoInPlusMenuHTML5.click();
		return this;
		}	
		
		public GamePage playButtoninMoreInfoHTML5() {
		playGameHTML5InMoreInfoPage.click();
		return this;
		}	
		public GamePage installButtoninMoreInfoMac() {
		installPlayMacGameInMoreInfo.click();
		return this;
		}
		public GamePage clickNeddHelpButtoninMoreInfoMac() {
		messageNeedHelpMAC.click();
		return this;
		}
		public GamePage clickNeddHelpButtoninMoreInfoHTML5() {
		messageNeedHelpHTML5.click();
		return this;
		}
		public GamePage clickAddToCollectionButtoninMoreInfoHTML5() {
		buttonAddToCollectionHTML5.click();
		return this;
		}
		public GamePage clickAddToCollectionButtoninMoreInfoMAC() {
		buttonAddToCollectionMAC.click();
		return this;
		}
		public GamePage clickReinstallButtoninMoreInfoMAC() {
		reinstallThePlayer.click();
		return this;
		}
		
		
	public GamePage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(presenceOfElementLocated(By
				.xpath("//*[@id=\"browse_wrapper\"]/h4")));
		return this;
	}



}


package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selenium.pages.TestBase;

public class GameTest extends TestBase  {
	private WebDriver driver;
	
	
	@BeforeClass
	public void login() {
/* if(app.getUserHelper().isloginIn())
	 return;*/
		app.getUserHelper().loginAs("test4_inna4@jo-games.com", "123123");
		app.getNavigationHelper().openGamePage();

		System.out.println("GAME - Game page open - PASSED");

	}

	@BeforeMethod
	public void mayBeGamePageOpen() {
		if (app.getGameHelper().isGamePage()) {
			return;
		}
		app.getNavigationHelper().openGamePagePlayer();
	}
/*
	@Test
	public void aselectCSGenreArcadeInGame() throws Exception {
				
		app.getGameHelper().selectCSGenreArcadeInGame();
		Thread.sleep(10000);
		System.out
				.println("GAME - content segments - genre Arcade has been pressed - PASSED");
		app.getGameHelper().downloadGenreGame();
		Thread.sleep(10000);
		System.out
				.println("GAME -content segments - game in genre Arcade has been downloaded - PASSED");
	}
	
	
	@Test
	public void playGameHTML5PlayButtonOverTheImage() throws Exception {

		Thread.sleep(5000);
	app.getGameHelper().playAnyGamePlayButtonOverTheImageHTML5();
		Thread.sleep(10000);
		System.out
				.println("GAME - Game HTML5 opened on button over the image  - PASSED");
	}
	
	
	@Test
	public void playAnyGamePlayButtonOverTheImageMAC() throws Exception {
		app.getGameHelper().playAnyGamePlayButtonOverTheImageMAC();
		Thread.sleep(5000);
		System.out
				.println("GAME - Game MAC opened on button over the image  - PASSED");
	}*/


	@Test
	public void selectGameHTML() throws Exception {
		app.getGameHelper().playIos();
		Thread.sleep(5000);
		app.getGameHelper().selectGameHTML();
		Thread.sleep(15000);
		System.out
				.println("GAME - More info page Game HTML5 opened   - PASSED");
	}
@Test
	public void selectGameMAC() throws Exception {
		app.getGameHelper().selectGameMAC();
		Thread.sleep(15000);
		System.out
				.println("GAME - More info page Game MAC opened  - PASSED");
	}	
		
	@Test
	public void AddAnyGameToCollectionPlusMenu() throws Exception {
		app.getGameHelper().AddGameHTML5ToCollectionPlusMenu();
		Thread.sleep(15000);
		System.out
				.println("GAME - Game HTML5 add to collection on plus button  - PASSED");
	}
/*	
	@Test
	public void MortAddGameToCollectionPlusMenu() throws Exception {
		app.getGameHelper().AddGameMACToCollectionPlusMenu();
		Thread.sleep(5000);
		System.out
				.println("GAME - Game MAC add to collection on plus button  - PASSED");
	}

	@Test
	public void  MoreInfoAnyGamePlusMenu() throws Exception {
		app.getGameHelper().MoreInfoHTML5GamePlusMenu();
		Thread.sleep(5000);
		System.out
				.println("GAME - more info page HTML5 game opened on plus button  - PASSED");
	}	
	@Test
	public void  MoreInfoMacGamePlusMenu() throws Exception {
		app.getGameHelper().MoreInfoMACGamePlusMenu();
		Thread.sleep(5000);
		System.out
				.println("GAME - more info page MAC game opened on plus button  - PASSED");
	}
	
	
	@Test
	public void  PlayHTML5GamePlusMenu() throws Exception {
		app.getGameHelper().playGameHTML5NowButtonPlusMenu();
		Thread.sleep(5000);
		System.out
				.println("GAME - play game HTML5 opened on plus button  - PASSED");
	}	

	@Test
	public void  PlayMACGamePlusMenu() throws Exception {
		app.getGameHelper().playGameMACNowButtonPlusMenu();
		Thread.sleep(5000);
		System.out
				.println("GAME - play game MAC opened on plus button  - PASSED");
	}
	
	
	@Test
	public void  PlayAnyGameHTML5ButtonOnMoreInfoPage() throws Exception {
		app.getGameHelper().selectGameHTML();
		Thread.sleep(5000);
		app.getGameHelper().PlayAnyGameHTML5ButtonOnMoreInfoPage();
		Thread.sleep(5000);
		System.out
				.println("GAME - Play game html5 button in more info page has been pressed  - PASSED");
	}
	@Test
	public void  PlayMacGameButtonOnMoreInfoPage() throws Exception {
		app.getGameHelper().selectGameMAC();
		Thread.sleep(5000);
		app.getGameHelper().playMacGameInMoreInfoPage();
		Thread.sleep(5000);
		System.out
				.println("GAME - Play game MAC button in more info page has been pressed   - PASSED");
	}

	@Test 
	public void  clickNeedHelp() throws Exception {
		app.getGameHelper().selectGameHTML();
		Thread.sleep(5000);
		app.getGameHelper().clickNeedHelp();
		Thread.sleep(5000);
		System.out
				.println("GAME - Need help HTML5 on more info page opened  - PASSED");
	}
	
	@Test 
	public void  clickNeedHelpMAC() throws Exception {
		app.getGameHelper().selectGameMAC();
		Thread.sleep(5000);
		app.getGameHelper().clickNeedHelpMAC();
		Thread.sleep(5000);
		System.out
				.println("GAME - Need help MAC on more info page opened  - PASSED");
	}
	@Test 
	public void  clickAddCollectionButtoninMoreInfoPageHTML() throws Exception {
		app.getGameHelper().selectGameHTML();
		Thread.sleep(5000);
		app.getGameHelper().clickAddCollectionButtoninMoreInfoPage();
		Thread.sleep(5000);
		System.out
				.println("GAME - Add to collection button game HTML5 in more info page has been pressed   - PASSED");
	}
	
	@Test 
	public void  clickAddCollectionButtoninMoreInfoPageMAC() throws Exception {
		app.getGameHelper().selectGameMAC();
		Thread.sleep(5000);
		app.getGameHelper().clickAddCollectionButtoninMoreInfoPageMAC();
		Thread.sleep(5000);
		System.out
				.println("GAME - Add to collection button game MAC in more info page has been pressed  - PASSED");
	}

	@Test
	public void  clickReinstall() throws Exception {
		app.getGameHelper().selectGameMAC();
		Thread.sleep(5000);
		app.getGameHelper().reinstalPlayerInMoreInfoPage();
		Thread.sleep(5000);
		System.out
				.println("GAME - Reinstall button game MAC in more info page has been pressed  - PASSED");
	
}
	
	@Test
	public void  clickPlayMoreLikeSection() throws Exception {
		app.getGameHelper().moreLikePlayHTMLGamePlusMenu();
		Thread.sleep(5000);
		System.out
				.println("GAME - Game HTML 5 in more like section on more info page opened  - PASSED");
	
}
	
	@Test
	public void  clickPlayMoreLikeSectionMAC() throws Exception {
		app.getGameHelper().moreLikePlayMACGamePlusMenu();
		Thread.sleep(5000);
		System.out
				.println("GAME - Game MAC in more like section on more info page opened  - PASSED");
	
}*/
}

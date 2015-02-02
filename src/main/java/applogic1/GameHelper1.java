package applogic1;


import selenium.pages.GameHelper;
import applogic.DriverBasedHelper;

	public class GameHelper1 extends DriverBasedHelper implements GameHelper {

		public GameHelper1(ApplicationManager1 manager1) {
			super(manager1.getWebDriver());
		}
		
		@Override
		public void selectGameHTML() {
			pages.gamePage.ensurePageLoaded().movetoImageHTML5().openImageHTML5();
		}

		@Override
		public void playIos() {
		pages.gamePage.clickIOS();
		}
		
		@Override
		public void playAnyGamePlayButtonOverTheImageHTML5() {
		pages.gamePage.clickIOS().movetoImageHTML5().clickOnPlayButtonHTML5();
		}

		@Override
		public void MoreInfoHTML5GamePlusMenu() {
		pages.gamePage.ensurePageLoaded().movetoImageHTML5().clickPlusMenuHTML5().clickMoreInfoHTML5InPlusMenu();			
		}
		@Override
		public void AddGameHTML5ToCollectionPlusMenu() {
		pages.gamePage.ensurePageLoaded().clickIOS().movetoImageHTML5().clickPlusMenuHTML5().clickAddToCollecyionHTML5InPlusMenu();
		}
		@Override
		public void playGameHTML5NowButtonPlusMenu() {
		pages.gamePage.ensurePageLoaded().movetoImageHTML5().clickPlusMenuHTML5().clickPlayNowHTML5InPlusMenu();
		}
		@Override
		public void clickNeedHelp() {
		pages.gamePage.clickNeddHelpButtoninMoreInfoHTML5();
		}		
		@Override
		public void clickAddCollectionButtoninMoreInfoPage() {
		pages.gamePage.clickAddToCollectionButtoninMoreInfoHTML5();	
		}
		@Override
		public void PlayAnyGameHTML5ButtonOnMoreInfoPage() {
		pages.gamePage.playButtoninMoreInfoHTML5();		
		}		
		
	
		@Override
		public void playMacGameInMoreInfoPage() {
		pages.gamePage.installButtoninMoreInfoMac();
				}
		@Override
		public void reinstalPlayerInMoreInfoPage() {
		pages.gamePage.clickReinstallButtoninMoreInfoMAC();
		}
		@Override
		public void selectGameMAC() {
			pages.gamePage.ensurePageLoaded().movetoImageMAC().openImageMAC();
		}

		@Override
		public void playGameMACNowButtonPlusMenu() {
		pages.gamePage.ensurePageLoaded().movetoImageMAC().clickPlusMenuMAC().clickPlayNowMacInPlusMenu();
		}

		@Override
		public void AddGameMACToCollectionPlusMenu() {
		pages.gamePage.ensurePageLoaded().movetoImageMAC().clickPlusMenuMAC().clickAddToCollecyionMacInPlusMenu();
		}
		@Override
		public void MoreInfoMACGamePlusMenu() {
		pages.gamePage.movetoImageMAC().clickPlusMenuMAC().clickMoreInfoMacInPlusMenu();
		}

		@Override
		public void clickNeedHelpMAC() {
		pages.gamePage.clickNeddHelpButtoninMoreInfoMac();
		}

		@Override
		public void clickAddCollectionButtoninMoreInfoPageMAC() {
		pages.gamePage.clickAddToCollectionButtoninMoreInfoMAC();
		}
			@Override
		public void playAnyGamePlayButtonOverTheImageMAC() {
		pages.gamePage.movetoImageMAC().clickOnPlayButtonMAC();
		}	


		@Override
		public void moreLikePlayMACGamePlusMenu() {
		pages.gamePage.movetoImageMAC().openImageMAC().movetooverImageGametoLikeSectionMAC().ClickPlayGameOverImageInLikeSection();
			
		}

		@Override
		public void moreLikePlayHTMLGamePlusMenu() {
			pages.gamePage.ensurePageLoaded().movetoImageHTML5().openImageHTML5().movetooverImageGametoLikeSectionHTML5().ClickPlayGameHTML5OverImageInLikeSection();
			
		}

		@Override
		public boolean isGamePage() {
			return pages.gamePage.waitPageLoaded();
		}

		@Override
		public void selectCSGenreArcadeInGame() {
			pages.gamePage.moveCSinGame()
			.ClickGenreArcade();
		}

		@Override
		public void downloadGenreGame() {
			pages.gamePage.ClickDownloadGameArcade();
			
		}







}

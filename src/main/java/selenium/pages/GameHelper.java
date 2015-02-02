package selenium.pages;

public interface GameHelper {
	void playAnyGamePlayButtonOverTheImageMAC();
	void playAnyGamePlayButtonOverTheImageHTML5();
	
	void selectGameHTML();
	void playIos();
	void selectGameMAC();
	
	void playGameHTML5NowButtonPlusMenu();
	void AddGameHTML5ToCollectionPlusMenu();
	void MoreInfoHTML5GamePlusMenu();

	void PlayAnyGameHTML5ButtonOnMoreInfoPage();
	void clickNeedHelp();
	void clickAddCollectionButtoninMoreInfoPage();
	
	void playGameMACNowButtonPlusMenu();
	void AddGameMACToCollectionPlusMenu();
	void MoreInfoMACGamePlusMenu();
	
	void playMacGameInMoreInfoPage();
	void clickNeedHelpMAC();
	void clickAddCollectionButtoninMoreInfoPageMAC();
	void reinstalPlayerInMoreInfoPage();
	
	void moreLikePlayHTMLGamePlusMenu();
	void moreLikePlayMACGamePlusMenu();
	
	void selectCSGenreArcadeInGame();
	void downloadGenreGame();

	
	boolean isGamePage();
}

package applogic1;


import applogic.DriverBasedHelper;
import applogic.NavigationHelper;

public class NavigationHelper1 extends DriverBasedHelper  implements NavigationHelper {
	
	private String baseUrl;
	public NavigationHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
		this.baseUrl = manager.getBaseUrl();
		manager.getMovieUrl();
	}

	@Override
	public void openMainPage() {
		driver.get(baseUrl);
	}

	@Override
	public void openMyAccountPage() {
		pages.internalPage.ensurePageLoaded().goToMyAccountPage();
	}

	@Override
	public void openMusicPage() {
		pages.internalPage.ensurePageLoaded().goToMusicPage();
		
	}

	@Override
	public void openBookPage() {
		pages.internalPage.ensurePageLoaded().goToBookPage();
		
	}

	@Override
	public void openMoviePage() {
		
		pages.internalPage.ensurePageLoaded().goToMoviePage();
	}
	
	

	@Override
	public void openMoviePageFromMoviePlayer() {
		driver.get("http://members.ayeplay.com/#movies");
		
	}
	@Override
	public void openBookPageFromMoviePlayer() {
		driver.get("http://members.ayeplay.com/#books");
		
	}

	@Override
	public void openMusicPageFromMoviePlayer() {
	 driver.get("http://members.ayeplay.com/#albums");
		
	}

	@Override
	public void openCollectionPage() {
		pages.internalPage.ensurePageLoaded().goToCollectionPage();
		
	}

	@Override
	public void openCollectionPagePlayer() {
		 driver.get("http://members.ayeplay.com/#member/collection");
		
	}

	@Override
	public void openQeuePage() {
		pages.internalPage.ensurePageLoaded().goToQeuePage();
		
	}

	@Override
	public void openMusicQeuePage() {
		driver.get("http://members.ayeplay.com/#member/queue");
		
	}

	@Override
	public void presentSearchButton() {
		driver.get("http://members.ayeplay.com/#search");
		
	}

	@Override
	public void openSoftwarePage() {
		pages.internalPage.ensurePageLoaded().goToSoftwarePage();
		}

	@Override
	public void openSoftwareLoad() {
		driver.get("http://members.ayeplay.com/#software");
		
	}

	@Override
	public void openGamePage() {
		pages.internalPage.ensurePageLoaded().goToGamePage();
		
	}

	@Override
	public void openGamePagePlayer() {
		driver.get("http://members.ayeplay.com/#games");
		
	}
	
}

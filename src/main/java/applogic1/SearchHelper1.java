package applogic1;

import applogic.DriverBasedHelper;
import applogic.SearchHelper;

public class SearchHelper1 extends DriverBasedHelper implements  SearchHelper {

	public SearchHelper1(ApplicationManager1 manager1) {
		super(manager1.getWebDriver());
	}

	@Override
	public void playAnyMovieInSearch() {
		pages.searchPage.ensurePageLoaded()
		.movetoImageInSearhcPage()
		.clickPlusMenuInSearchPage()
		.playNowMoviePlusMenuInSearchPage();
		
	}

	@Override
	public void clickButtonSearch() {
		pages.searchPage.ClickSearchButton();
		
	}

	@Override
	public void putAnyInfoIntoSearchField(String search) {
		
			pages.searchPage.ensurePageLoaded()
			.clearSearchField()
			.setSearchField(search);
			
	}

	@Override
	public void playAnyMusicInSearch() {
		pages.searchPage.ensurePageLoaded()
		.movetoImageMusicInSearhcPage()
		.clickPlusMenuInSearchPageMusic()
		.playNowMusicPlusMenuInSearchPage();
		
	}

	@Override
	public void AddToColectionMovieInSearchPage() {
		pages.searchPage.ensurePageLoaded()
		.movetoImageInSearhcPage()
		.clickPlusMenuInSearchPage()
		.AddToCollectionInPlusMenuInSearchPage();
		
	}

	@Override
	public void MoreInfoMovieInSearchPage() {
		pages.searchPage.ensurePageLoaded()
		.movetoImageInSearhcPage()
		.clickPlusMenuInSearchPage()
		.MoreInfoMoviePlusMenuInSearchPage();
		
	}

	@Override
	public void AddToColectionMusicInSearchPage() {
		pages.searchPage.ensurePageLoaded()
		.movetoImageMusicInSearhcPage()
		.clickPlusMenuInSearchPageMusic()
		.AddToCollectionMusicInPlusMenuInSearchPage();
		
	}

	@Override
	public void MoreInfoMusicInSearchPage() {
		pages.searchPage.ensurePageLoaded()
		.movetoImageMusicInSearhcPage()
		.clickPlusMenuInSearchPageMusic()
		.MoreInfoMusicPlusMenuInSearchPage();
		
	}

	@Override
	public void AddToQueueMusicInSearchPage() {
		pages.searchPage.ensurePageLoaded()
		.movetoImageMusicInSearhcPage()
		.clickPlusMenuInSearchPageMusic()
		.AddToQueueMusicInPlusMenuInSearchPage();
		
	}

	@Override
	public void readAnyBookInSearch() {
		pages.searchPage.ensurePageLoaded()
		.movetoImageBookInSearhcPage()
		.clickPlusMenuInSearchPageBook()
		.readNowBookPlusMenuInSearchPage();
		
	}

	@Override
	public void AddToColectionBookInSearchPage() {
		pages.searchPage.ensurePageLoaded()
		.movetoImageBookInSearhcPage()
		.clickPlusMenuInSearchPageBook()
		.AddToCollectionBookInPlusMenuInSearchPage();
		
	}

	@Override
	public void MoreInfoBookInSearchPage() {
		pages.searchPage.ensurePageLoaded()
		.movetoImageBookInSearhcPage()
		.clickPlusMenuInSearchPageBook()
		.MoreInfoBookPlusMenuInSearchPage();
		
	}

	@Override
	public void clickOverImageMovie() {
		pages.searchPage.ensurePageLoaded()
		.clickOverImageMovieInSearchPage();
		}

	@Override
	public void clickOverImageMusic() {
		pages.searchPage.ensurePageLoaded()
		.clickOverImageMusicInSearchPage();
		
	}

	@Override
	public void clickOverImageBok() {
		pages.searchPage.ensurePageLoaded()
		.clickOverImageBookInSearchPage();
		
	}

	@Override
	public void checkMoreInfoMovieOpen() {
		pages.searchPage.clickCheckMoreInfoMovieOpen();
		
	}

	@Override
	public void checkMovieOpen() {
		pages.searchPage.clickCheckMovieOpen();
		
	}

	@Override
	public void checkAddMovieToCollection() {
		pages.searchPage.clickCheckAddMovieToCollection();
		
	}

	@Override
	public void checkMoreInfoMusicOpen() {
		pages.searchPage.clickCheckMoreInfoMusicOpen();
		
	}

	@Override
	public void checkMusicPlay() {
		pages.searchPage.clickcheckMusicPlay();
		
	}

	@Override
	public void checkAddMusicToCollection() {
		pages.searchPage.clickCheckAddMusicToCollection();
		
	}

	@Override
	public void checkAddMusicToQueue() {
		pages.searchPage.clickcheckAddMusicToQueue();
		
	}

	@Override
	public void checkMoreInfoBookOpen() {
		pages.searchPage.clickCheckMoreInfoBookOpen();
		
	}

	@Override
	public void checkBookOpen() {
		pages.searchPage.clickCheckBookOpen();
		
	}

	@Override
	public void checkAddBookToCollection() {
		pages.searchPage.clickCheckAddBookToCollection();
		
	}
		




}

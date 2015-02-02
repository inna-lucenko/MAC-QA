package applogic1;

import applogic.DriverBasedHelper;
import applogic.BookHelper;

public class BookHelper1 extends DriverBasedHelper implements BookHelper {

	public BookHelper1(ApplicationManager1 manager1) {
		super(manager1.getWebDriver());
	}

	@Override
	public void playAnyBookPlayButtonOverTheImage() {
		pages.bookPage.ensurePageLoaded().movetoImage().clickOnPlayButton();
	}

	@Override
	public void playAnyBookNowButtonPlusMenu() {
		pages.bookPage.ensurePageLoaded().movetoImage().clickPlayPlusMenu();

	}

	@Override
	public void AddAnyBookToCollection() {
		pages.bookPage.clickAddToCollection();

	}

	public void clickPlayNow() {
		pages.bookPage.clicMenuPlayNow();
	}

	@Override
	public void PlayAnyBookFromCollection() {
		pages.bookPage.ClicColection();

	}

	@Override
	public void PlayAnyBokOnMoreInfoPage() {
		pages.bookPage.ReedBooks();
	//	pages.bookPage.ClickBackButton();
	 
	}

	@Override
	public boolean isBookPage() {
		return pages.bookPage.waitPageLoaded();
	}

	@Override
	public void clickMoreInfo() {
		pages.bookPage.SelectMoreInfo();

	}

	@Override
	public void clickNeedHelp() {
		   
		pages.bookPage.ClickMessageNeedHelp();
	}

	@Override
	public void clickAddCollectionButtoninMoreInfoPage() {
		pages.bookPage.ClickButtonAddToCollection();
		
	}

	@Override
	public void moreLikePLusButton() {
		pages.bookPage.movetooverImageBooktoLikeSection()
		.ClickPlusMenuOverImageInLikeSection();
		
	}

	@Override
	public void moreLikeReadBookOverImage() {
		pages.bookPage.movetooverImageBooktoLikeSection()
		.ClickReadBookOverImageInLikeSection();
		
	}

	@Override
	public void moreLikeReadBookPlusMenu() {
		pages.bookPage.ClickReadNowOnPlusMenuInLikeSection();
		
	}

	@Override
	public void moreLikeAddPlusMenu() {
		pages.bookPage.ClickAddToCollectioOnPlusMenuInLikeSection();
		
	}

	@Override
	public void moreLikeMoreLikeInPlusButton() {
		pages.bookPage.ClickMoreLikeOnPlusMenuInLikeSection();
	}

	@Override
	public void selectCSGenreMysteryInBook() {
		pages.bookPage.moveCSinBook()
		.ClickGenreMystery();
		
	}

	@Override
	public void readBookMystery() {
		pages.bookPage.ClickReadBookMystery();
		
	}

	@Override
	public void proverkaOpenBook() {
		pages.bookPage.proverkaBookopen();
		
	}

	@Override
	public void proverkaSegment() {
	pages.bookPage.proverkaSegmentBookopen();
		
	}

	@Override
	public void provMoreLikePlusMenuReadBook() {
		pages.bookPage.proverkaMoreLikePlusMenuReadBook();
		
	}

	@Override
	public void provMoreLikePlusMenuAddToColl() {
		pages.bookPage.proverkaMoreLikePlusMenuAddToColl();
		
	}

	@Override
	public void proverkaOverImageOpenBook() {
		pages.bookPage.proverkaOverImageOpenBook();
		
	}

	@Override
	public void provPlusMenuReadBook() {
		pages.bookPage.proverkaPlusMenuReadBook();
		
	}

	@Override
	public void provPlusMenuAddToColl() {
		pages.bookPage.proverkaPlusMenuAddToColl();
		
	}

	@Override
	public void provPlusMenuMoreInfo() {
		pages.bookPage.proverkaPlusMenuMoreInfo();
		
	}

	@Override
	public void provMessageAddToColl() {
		pages.bookPage.proverkaMessageAddToColl();
		
	}

	@Override
	public void provNeedHelp() {
		pages.bookPage.proverkaNeedHelp();
		
	}

}

package applogic1;

import applogic.DriverBasedHelper;
import applogic.SoftwareHelper;

public class SoftwareHelper1 extends DriverBasedHelper implements SoftwareHelper{

	public SoftwareHelper1(ApplicationManager1 manager1) {
		super(manager1.getWebDriver());
	}

	@Override
	public void downloadAnySoftwarePlayButtonOverTheImage() {
		pages.softwarePage.ensurePageLoaded()
		.movetoImage()
		.clickOnPlayButton();
		
	}

	@Override
	public void downloadNowAnySoftwareButtonPlusMenu() {
		pages.softwarePage.ensurePageLoaded()
		.movetoImage()
		.clickPlusMenu()
		.clicMenuPlayNow();
	}

	@Override
	public void AddAnySoftwareToCollectionInPlusMenu() {
		pages.softwarePage.ensurePageLoaded()
		.movetoImage()
		.clickPlusMenu()
		.clickAddToCollection();
	}

	@Override
	public void moreLikePLusButton() {
		pages.softwarePage.ensurePageLoaded()
		.movetoImage()
		.clickPlusMenu()
		.SelectMoreInfo();
		
	}

	@Override
	public boolean isSoftwarePage() {
		return pages.bookPage.waitPageLoaded();
		
	}

	@Override
	public void clickDownloadNowinMoreInfoSection() {
		pages.softwarePage.DownloadSoftware();
	
	}

	@Override
	public void clickNeedHelp() {
		pages.softwarePage.ClickMessageNeedHelp();
		
	}

	@Override
	public void moreLikeDownloadSoftwareOverImage() {
		pages.softwarePage.movetooverImageSoftwareToLikeSection()
		.ClickdownloadSoftwareOverImageInLikeSection();
		
	}

	@Override
	public void moreInfoAddToCollectionInMoreInfoPage() {
		pages.softwarePage.ClickAddToCollectionButtonInMoreInfoPage();
		
	}

	@Override
	public void selectCSGenreGraphicInSoftware() {
		pages.softwarePage.moveCSinSoftware()
		.ClickGenreGraphic();
		
		
	}

	@Override
	public void downloadGenreSoftware() {
		pages.softwarePage.ClickDownloadSoftwareGraphic();
		
	}

	
}

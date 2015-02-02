package applogic1;

import applogic.DriverBasedHelper;
import applogic.MusicHelper;


public class MusicHelper1 extends DriverBasedHelper implements MusicHelper{

	public MusicHelper1(ApplicationManager1 manager1) {
		super(manager1.getWebDriver());
	}

	@Override
	public void playAnyAlbumByUsingThePlayButtonOverTheImage() {
	pages.musicPage.ensurePageLoaded()
	.movetoImagemusic()
	.clickOnPlayButton();
	}

	@Override
	public void playAnyAlbumByUsingThePlayNowButtonPlusMenu() {
		pages.musicPage
		.movetoImagemusic()
		.clickPlayPlusMenu();		
	}

	@Override
	public void AddAnyAlbumToQueue() {
		pages.musicPage.clickAddToQueuePlusMenu();
		
	}

	@Override
	public void AddAnyAlbumToCollection() {
		pages.musicPage.clickAddToCollectionPlusMenu();
		
	}

	@Override
	public void PlayAnyAlbumFromCollection() {
		pages.musicPage.ClickColection();

		}
		

	@Override
	public boolean isMusikPage() {
		return pages.musicPage.waitPageLoaded();
	}

	@Override
	public void PlayNowInPlusMenu() {
	pages.musicPage.clickPlayNowPlusMenu();
		
	}
	
	@Override
	public void MoreInfoInPlusMenu() {
		pages.musicPage.clickMoreInfoPlusMenu();
		
	}

	@Override
	public void moreLikePlayMenuPlusMenu() {
		pages.musicPage.ClickPlayNowOnPlusMenuInLikeSection();
	}

	@Override
	public void moreLikeAddToCollectionPlusMenu() {
		pages.musicPage.ClickAddToCollectioOnPlusMenuInLikeSection();
		
	}
@Override
	public void moreLikeAddToQueuePlusMenu() {
	pages.musicPage.ClickAddToQueueOnPlusMenuInLikeSection();
		
	}

	@Override
	public void moreLikeMoreLikeInPlusButton() {
		pages.musicPage.movetooverImageAlbumtoLikeSection()
		.ClickMoreLikeOnPlusMenuInLikeSection();
		
	}

	@Override
	public void moreLikePLusButton() {
		pages.musicPage.movetooverImageAlbumtoLikeSection()
		.ClickPlusMenuOverImageInLikeSection();
		
	}

	@Override
	public void  MoreLikeSectionPlayAlbomNow(){
		pages.musicPage.movetooverImageAlbumtoLikeSection().PlayAlbumtoLikeSectionOverImage();
		
		
	}

	@Override
	public void clickAddCollectionButtoninMoreInfoPage() {
		pages.musicPage.ClickButtonAddToCollection();
			
		}

	@Override
	public void clickNeedHelp() {
		pages.musicPage.ClickMessageNeedHelp();
		
	}
	
	@Override
	public void selectCSGenrePopInMusic() {
		pages.musicPage.moveCSinMusic()
		.ClickGenrePop();
		
	}	
		
	
	@Override
	public void playMusicPop() {
		pages.musicPage.ClickPlayMusicPop();
		
		
	}

	@Override
	public void proverkaSegment() {
		pages.musicPage.provkaSegment();
		
	}

	@Override
	public void proverkaPlayMusic() {
		pages.musicPage.provkaPlayMusics();
		
	}

	@Override
	public void provPlayMusicOnPlusMenu() {
		pages.musicPage.proverkaPlayMusicOnPlusMenu();
		
	}

	@Override
	public void proverkaAddCollInPlusMenu() {
		pages.musicPage.provAddCollInPlusMenu();
		
	}

	@Override
	public void proverkaMoreInfoInPlusMenu() {
		pages.musicPage.proverMoreInfoInPlusMenu();
		
	}

	@Override
	public void proverkaAddToQueueInPlusMenu() {
		pages.musicPage.provAddToQueueInPlusMenu();
		
	}

	@Override
	public void provPlayAlbubMoreLike() {
		pages.musicPage.proverkaPlayAlbubMoreLike();
		
	}

	@Override
	public void provButtonAddToCollection() {
		pages.musicPage.proverkaButtonAddToCollection();
		
	}

	@Override
	public void proverkaNeedHelp()  {
		pages.musicPage.provNeedHelp();
		
	}
	
	
/*	@Override
	public void skreenshot() throws Exception {
		pages.musicPage.skreen();
		
	}*/
			
	}

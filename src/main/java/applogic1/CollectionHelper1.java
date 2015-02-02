package applogic1;

import applogic.CollectionHelper;
import applogic.DriverBasedHelper;

public class CollectionHelper1 extends DriverBasedHelper implements CollectionHelper{

	public CollectionHelper1(ApplicationManager1 manager1) {
		super(manager1.getWebDriver());
	}

	@Override
	public boolean isCollectionPage() {
		return pages.collectionPage.waitPageLoaded();
		}

	

	@Override
	public void playFirstComposition() {
		pages.collectionPage.movetoRecord()
		.PlayFirstCompositionInMusic();
		}

	@Override
	public void filterMediaInCollectionPage() {
		pages.collectionPage.ClickFilterInCollectionPage();

	}

	@Override
	public void MusicFilterMediaInCollectionPage() {
		pages.collectionPage.ClickFilterMusicInCollectionPage();
		
	}

	@Override
	public void BookFilterMediaInCollectionPage() {
		pages.collectionPage.ClickFilterBookInCollectionPage();
		
	}

	@Override
	public void MoviesFilterMediaInCollectionPage() {
		pages.collectionPage.ClickFilterMoviesInCollectionPage();
		
	}

	@Override
	public void DeleteAnyCompositionInCollectionPage() {
		pages.collectionPage.movetoRecord()
		.DeleteCompositionInCollectionPage();
		
	}

	@Override
	public void PlayLaterInPlusMenuInCollectionPage() {
		pages.collectionPage.movetoRecord()
		.ClickPlusMenuOnMusicInCollectionPage()
		.ClickPlayLaterPlusMenuOnMusicInCollectionPage();
		
	}

	@Override
	public void CheckOpenPlayerInCollection() {
		pages.collectionPage.CheckOpenPlayer();	
		
	}
	
	

}

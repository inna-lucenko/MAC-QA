package applogic1;

import applogic.DriverBasedHelper;
import applogic.QueueHelper;

public class QueueHelper1 extends DriverBasedHelper implements QueueHelper{

	public QueueHelper1(ApplicationManager1 manager1) {
		super(manager1.getWebDriver());
	}

	

	@Override
	public void PlayLaterInPlusMenuInCollectionPage() {
		pages.queuePage.movetoRecord()
		.clickPlusMenuOnMusicInQueuePage()
		.clickPlayLaterPlusMenuOnMusicInQueuePage();
		
	}

	@Override
	public boolean isQeuePage() {
		return pages.queuePage.waitPageLoaded();
	}

	@Override
	public void playFirstCompositioninQeuePage() {
		pages.queuePage.movetoRecord()
		.PlayFirstCompositionInMusic();
		
	}

	@Override
	public void DeleteCompositionInQeuePage() {
		pages.queuePage.movetoRecord()
		.DeleteAnyCompositionInQeue();
	}



	@Override
	public void CheckOpenPlayerInQueue() {
		pages.queuePage.checkOpenPlayerInQueuePage();
		
	}
}
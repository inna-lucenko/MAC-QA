package selenium;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selenium.pages.TestBase;

public class PlayMusicTest extends TestBase {
	
	@BeforeClass
	public void login (){
		/* if(app.getUserHelper().isloginIn())
			 return;*/
		app.getUserHelper().loginAs("test4_inna4@jo-games.com", "123123");
		app.getNavigationHelper().openMusicPage();
	 
	  
		System.out.println("MUSIC_PAGE - Music page opened - PASSED");
		   
		}
	@BeforeMethod
	public void mayBeMusicPageOpen() {
		if (app.getMusicHelper().isMusikPage()) {
			return;
		}
		app.getNavigationHelper().openMusicPageFromMoviePlayer();
	}
/*	@Listeners({ ScreenShooter.class})
	{
		java ScreenShooter.captureSuccessfulTests = true;	
	}*/
	
	@Test
	public void selectCSGenrePopInMusic() throws Exception {
				
		app.getMusicHelper().selectCSGenrePopInMusic();
		Thread.sleep(10000);
		System.out
				.println("MUSIC - content segments - genre POP has been pressed - PASSED");
		app.getMusicHelper().playMusicPop();
		Thread.sleep(10000);
		app.getMusicHelper().proverkaSegment();
	}
	
	
@Test
	public void playAnyAlbumByUsingThePlayButtonOverTheImage() throws Exception {
		app.getMusicHelper().playAnyAlbumByUsingThePlayButtonOverTheImage();
		Thread.sleep(10000);
		app.getMusicHelper().proverkaPlayMusic();
		}
	
	@Test
	public void playAnyAlbumByUsingThePlayNowButtonPlusMenu() throws Exception {
		app.getMusicHelper().playAnyAlbumByUsingThePlayNowButtonPlusMenu();
		Thread.sleep(5000);
		app.getMusicHelper().PlayNowInPlusMenu();
		Thread.sleep(5000);
		app.getMusicHelper().provPlayMusicOnPlusMenu();
	}
	@Test
	public void AddAnyAlbumToCollection() throws Exception {
		app.getMusicHelper().playAnyAlbumByUsingThePlayNowButtonPlusMenu();
		Thread.sleep(5000);
		System.out.println("MUSICS - Plus button has been pressed - PASSED");
		app.getMusicHelper().AddAnyAlbumToCollection();
		Thread.sleep(5000);
		app.getMusicHelper().proverkaAddCollInPlusMenu();
	}
	@Test
	public void MoreInfoInPlusMenu() throws Exception {
		app.getMusicHelper().playAnyAlbumByUsingThePlayNowButtonPlusMenu();
		Thread.sleep(5000);
		app.getMusicHelper().MoreInfoInPlusMenu();
		Thread.sleep(5000);
		app.getMusicHelper().proverkaMoreInfoInPlusMenu();
	}
	
@Test
	public void AddAnyAlbumToQueue() throws Exception {
		app.getMusicHelper().playAnyAlbumByUsingThePlayNowButtonPlusMenu();
		Thread.sleep(5000);
		app.getMusicHelper().AddAnyAlbumToQueue();
		Thread.sleep(5000);
		app.getMusicHelper().proverkaAddToQueueInPlusMenu();
	    Thread.sleep(5000);
//	    app.getMusicHelper().skreenshot();
}

	@Test
	public void PlayAnyAlbumFromCollection() throws Exception {
		app.getMusicHelper().playAnyAlbumByUsingThePlayNowButtonPlusMenu();
		Thread.sleep(5000);
		app.getMusicHelper().AddAnyAlbumToCollection();
		Thread.sleep(5000);
		System.out
				.println("MUSICS  - Add to collection button on plus menu has been pressed - PASSED");
		app.getMusicHelper().PlayAnyAlbumFromCollection();
		Thread.sleep(5000);
		System.out
				.println("MUSICS  - Message Colection has been selected - PASSED");
	}
	@Test
	public void MoreLikeSectionPlayAlbomNow() throws Exception {
		app.getMusicHelper().playAnyAlbumByUsingThePlayNowButtonPlusMenu();
		Thread.sleep(5000);
		app.getMusicHelper().MoreInfoInPlusMenu();
		Thread.sleep(5000);
		app.getMusicHelper().MoreLikeSectionPlayAlbomNow();
		Thread.sleep(5000);
		app.getMusicHelper().provPlayAlbubMoreLike();
	}
/*
	@Test
	public void moreLikePlayAlbumPlusMenu() throws Exception {
		app.getMusicHelper().playAnyAlbumByUsingThePlayNowButtonPlusMenu();
		Thread.sleep(5000);
		app.getMusicHelper().MoreInfoInPlusMenu();
		Thread.sleep(5000);
		app.getMusicHelper().moreLikePLusButton();
		Thread.sleep(5000);
		app.getMusicHelper().moreLikeMoreLikeInPlusButton();
		;
		Thread.sleep(5000);
		System.out
				.println("MUSICS - Play album on plus menu in More Like sectin has been pressed - PASSED");
	}
	@Test
	public void moreLikePlusMenu() throws Exception {
		app.getMusicHelper().playAnyAlbumByUsingThePlayNowButtonPlusMenu();
		Thread.sleep(5000);
		app.getMusicHelper().MoreInfoInPlusMenu();
		Thread.sleep(5000);
		app.getMusicHelper().moreLikePLusButton();
		Thread.sleep(5000);
		app.getMusicHelper().moreLikeAddToCollectionPlusMenu();
		Thread.sleep(5000);
		System.out
				.println("MUSICS - Add to collection on plus menu in More Like sectin has been pressed - PASSED");
	}
	@Test
	public void moreLikeAddToQueuePlusMenu() throws Exception {
		app.getMusicHelper().playAnyAlbumByUsingThePlayNowButtonPlusMenu();
		Thread.sleep(5000);
		app.getMusicHelper().MoreInfoInPlusMenu();
		Thread.sleep(5000);
		app.getMusicHelper().moreLikePLusButton();
		Thread.sleep(5000);
		app.getMusicHelper().moreLikeAddToQueuePlusMenu();
		Thread.sleep(5000);
		System.out
				.println("MUSICS - Add to queue on plus menu in More Like sectin has been pressed - PASSED");
	}

	@Test
	public void moreLikeMoreLikeInPlusButton() throws Exception {
		app.getMusicHelper().playAnyAlbumByUsingThePlayNowButtonPlusMenu();
		Thread.sleep(5000);
		app.getMusicHelper().MoreInfoInPlusMenu();
		Thread.sleep(5000);
		app.getMusicHelper().moreLikePLusButton();
		Thread.sleep(5000);
		app.getMusicHelper().moreLikeMoreLikeInPlusButton();
		Thread.sleep(5000);
		System.out
				.println("MUSICS - More Like on plus menu in More Like sectin has been pressed - PASSED");
	}
	
*/
	
	@Test
	public void clickAddCollectionButtoninMoreInfoPage() throws Exception {
		app.getMusicHelper().playAnyAlbumByUsingThePlayNowButtonPlusMenu();
		Thread.sleep(5000);
		app.getMusicHelper().MoreInfoInPlusMenu();
		Thread.sleep(5000);
		//System.out.println("MUSICS - More info button on plus menu has been pressed - PASSED");
		app.getMusicHelper().clickAddCollectionButtoninMoreInfoPage();
		Thread.sleep(5000);
		app.getMusicHelper().provButtonAddToCollection();

	}

	@Test
	public void clickNeedHelp() throws Exception {
		app.getMusicHelper().playAnyAlbumByUsingThePlayNowButtonPlusMenu();
		Thread.sleep(5000);
		app.getMusicHelper().MoreInfoInPlusMenu();
		Thread.sleep(5000);
		app.getMusicHelper().clickNeedHelp();
		Thread.sleep(5000);
	//	screenshot("my");
		app.getMusicHelper().proverkaNeedHelp();
	//	System.out.println("MUSICS - Need Help message in More info pages has been pressed - PASSED");
		Thread.sleep(5000);
	}


	
}

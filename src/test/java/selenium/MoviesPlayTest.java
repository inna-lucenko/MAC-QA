package selenium;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import selenium.pages.TestBase;

public class MoviesPlayTest extends TestBase {
		@BeforeClass
	public void login() {
		/* if(app.getUserHelper().isloginIn())
			 return;*/
		app.getUserHelper().loginAs("test4_inna4@jo-games.com", "123123");
		app.getNavigationHelper().openMoviePage();
		System.out.println("MOVIES - Movies page opened - PASSED");
	}

	@BeforeMethod
	public void mayBeMoviePageOpen() {
		if (app.getMoviesHelper().isMoviePage()) {
			return;
		}
		app.getNavigationHelper().openMoviePageFromMoviePlayer();

	}

	@Test
	public void AaaselectCSGenreComedyInMovies() throws Exception {
		app.getMoviesHelper().selectCSGenreComedyInMovies();
		Thread.sleep(10000);
		System.out
				.println("MOVIES - Comedy has been pressed - PASSED");
		app.getMoviesHelper().playMovieComedy();
		Thread.sleep(20000);
		app.getMoviesHelper().proverka();
		Thread.sleep(5000);
		}
	
	

/*	@Test
	public void selectCSGenreWarInMovies() throws Exception {
				
		app.getMoviesHelper().selectCSGenreWarInMovies();
		Thread.sleep(10000);
		System.out
				.println("MOVIES - content segments - genre WAR has been pressed - PASSED");
		app.getMoviesHelper().playMovieWar();
		Thread.sleep(10000);
		System.out
				.println("MOVIES -content segments - movie in genre WAR has been played - PASSED");
		app.getMoviesHelper().proverka();
		Thread.sleep(5000);
	}*/
/*	
@Test
	public void moreLikePlayMovieOverImage() throws Exception {
		app.getMoviesHelper().playAnyMoviesButtonPlusMenu();
		Thread.sleep(10000);
		app.getMoviesHelper().clickMoreInfo();
		Thread.sleep(5000);
		app.getMoviesHelper().moreLikePlayMovieOverImage();
		Thread.sleep(10000);
		app.getMoviesHelper().proverkaMoreLike();
		Thread.sleep(5000);
	}

	@Test
	public void moreLikePlayMoviePlusMenu() throws Exception {
		app.getMoviesHelper().playAnyMoviesButtonPlusMenu();
		Thread.sleep(10000);
		app.getMoviesHelper().clickMoreInfo();
		Thread.sleep(5000);
		app.getMoviesHelper().moreLikePLusButton();
		Thread.sleep(10000);
		app.getMoviesHelper().moreLikePlayMoviePlusMenu();
		Thread.sleep(10000);
		app.getMoviesHelper().provPlusMenuMoreLike();
		
	
	}

	@Test
	public void moreLikeAddPlusMenu() throws Exception {
		app.getMoviesHelper().playAnyMoviesButtonPlusMenu();
		Thread.sleep(10000);
		app.getMoviesHelper().clickMoreInfo();
		Thread.sleep(5000);
		app.getMoviesHelper().moreLikePLusButton();
		Thread.sleep(5000);
		app.getMoviesHelper().moreLikeAddPlusMenu();
		Thread.sleep(10000);
		app.getMoviesHelper().proverkaAddToCollection();
		
		
	}

	@Test
	public void moreLikeMoreLikeInPlusButton() throws Exception {
		app.getMoviesHelper().playAnyMoviesButtonPlusMenu();
		Thread.sleep(10000);
		app.getMoviesHelper().clickMoreInfo();
		Thread.sleep(5000);
		app.getMoviesHelper().moreLikePLusButton();
		Thread.sleep(10000);
		app.getMoviesHelper().moreLikeMoreLikeInPlusButton();
		Thread.sleep(10000);
		System.out
				.println("MOVIES  - More Like on plus menu in More Like sectin has been pressed - PASSED");
	}

	@Test
	public void ClickBackButton() throws Exception {
		app.getMoviesHelper().playAnyMoviesOverTheImage();
		Thread.sleep(15000);
		System.out
				.println("MOVIES - Movie player is opened on button over the image - PASSED");
		app.getMoviesHelper().ClickBackButton();
		Thread.sleep(5000);
		System.out.println("MOVIES - Back button has been pressed - PASSED");
	}

	@Test
	public void playAnyMoviesButtonPlusMenu() throws Exception {
		app.getMoviesHelper().playAnyMoviesButtonPlusMenu();
		Thread.sleep(5000);
		System.out.println("MOVIES - Plus button has been pressed - PASSED");
		app.getMoviesHelper().clickPlayNow();
		Thread.sleep(5000);
		app.getMoviesHelper().proverkaPlayOnPlusMenu();
	}*/
/*
	@Test
	public void AddMoviesToCollection() throws Exception {
		app.getMoviesHelper().playAnyMoviesButtonPlusMenu();
		Thread.sleep(5000);
		app.getMoviesHelper().clickAddColection();
		Thread.sleep(5000);
		System.out
		.println("MOVIES - Add to collection button in more info page has been pressed - PASSED");
		
	}
*/
	@Test
	public void MoreInfoPageOpen() throws Exception {
		app.getMoviesHelper().playAnyMoviesButtonPlusMenu();
		Thread.sleep(5000);
		app.getMoviesHelper().clickMoreInfo();
		Thread.sleep(5000);
		System.out
				.println("MOVIES - More info button on plus menu has been pressed - PASSED");
		app.getMoviesHelper().PlayAnyMoviesOnMoreInfoPage();
		Thread.sleep(5000);
		System.out.println("MOVIES - Watch button has been pressed - PASSED");
	}
/*
	@Test
	public void playAnyMoviesOverTheImage() throws Exception {
		app.getMoviesHelper().playAnyMoviesOverTheImage();
		Thread.sleep(5000);
		System.out
				.println("MOVIES - Movie played on button over the image  - PASSED");
	}

	@Test
	public void playAnyMoviesFromCollection() throws Exception {
		app.getMoviesHelper().playAnyMoviesButtonPlusMenu();
		Thread.sleep(15000);
		app.getMoviesHelper().clickAddColection();
		Thread.sleep(5000);
		System.out
				.println("MOVIES - Add to collection button on plus menu has been pressed - PASSED");
		app.getMoviesHelper().PlayAnyMoviesFromCollection();
		Thread.sleep(15000);
		System.out
				.println("MOVIES - Message Colection has been selected - PASSED");

	}

@Test
	public void clickAddCollectionButtoninMoreInfoPage() throws Exception {
		app.getMoviesHelper().playAnyMoviesButtonPlusMenu();
		Thread.sleep(5000);
		app.getMoviesHelper().clickMoreInfo();
		Thread.sleep(5000);
		System.out
				.println("MOVIES - More info button on plus menu has been pressed - PASSED");
		app.getMoviesHelper().clickAddCollectionButtoninMoreInfoPage();
		Thread.sleep(5000);
		System.out
				.println("MOVIES - Add to collection button in More info pages has been pressed - PASSED");

	}

	@Test
	public void clickNeedHelp() throws Exception {
		app.getMoviesHelper().playAnyMoviesButtonPlusMenu();
		Thread.sleep(5000);
		app.getMoviesHelper().clickMoreInfo();
		Thread.sleep(5000);
		app.getMoviesHelper().clickNeedHelp();
		Thread.sleep(5000);
		System.out
				.println("MOVIES  - Need Help message in More info pages has been pressed - PASSED");

	}
*/
}

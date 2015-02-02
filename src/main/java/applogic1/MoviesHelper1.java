package applogic1;

import applogic.MoviesHelper;
import applogic.DriverBasedHelper;

public class MoviesHelper1 extends DriverBasedHelper implements MoviesHelper {

	public MoviesHelper1(ApplicationManager1 manager1) {
		super(manager1.getWebDriver());
	}

	@Override
	public void playAnyMoviesOverTheImage() {
		pages.moviePage.ensurePageLoaded().movetoImage().clickOnmoviesplay();
	}

	@Override
	public void playAnyMoviesButtonPlusMenu() {
		pages.moviePage.ensurePageLoaded().movetoImage().clickPlusMenu();
	}

	@Override
	public void clickPlayNow() {
		pages.moviePage.clicMenuPlayNow();
	}

	@Override
	public void clickAddColection() {
		pages.moviePage.clickAddToCollection();
	}

	@Override
	public void clickMoreInfo() {
		pages.moviePage.clickMenuMoreInfo();
	}

	@Override
	public void PlayAnyMoviesFromCollection() {
		pages.moviePage.ClicColectionMovies();
	}

	@Override
	public void PlayAnyMoviesOnMoreInfoPage() {
		pages.moviePage.WatchMovies();
	}

	@Override
	public void ClickBackButton() {
		pages.moviePage.clickback();
	}

	@Override
	public boolean isMoviePage() {
		return pages.moviePage.waitPageLoaded();
	}

	@Override
	public void clickNeedHelp() {
		pages.moviePage.ClickMessageNeedHelp();

	}

	@Override
	public void clickAddCollectionButtoninMoreInfoPage() {
		pages.moviePage.ClickButtonAddToCollection();

	}

	@Override
	public void moreLikePLusButton() {
		pages.moviePage.movetooverImageMovietoLikeSection()
				.ClickPlusMenuOverImageInLikeSection();
	}

	@Override
	public void moreLikePlayMovieOverImage() {
		pages.moviePage.movetooverImageMovietoLikeSection()
				.ClickPlayMovieOverImageInLikeSection();

	}

	@Override
	public void moreLikePlayMoviePlusMenu() {
		pages.moviePage.ClickReadNowOnPlusMenuInLikeSection();

	}

	@Override
	public void moreLikeAddPlusMenu() {
		pages.moviePage.ClickAddToCollectioOnPlusMenuInLikeSection();

	}

	@Override
	public void moreLikeMoreLikeInPlusButton() {
		pages.moviePage.ClickMoreLikeOnPlusMenuInLikeSection();

	}

	@Override
	public void selectCSGenreComedyInMovies() {
		pages.moviePage.moveCSinMovie()
		.ClickGenreComedy();
		
	}	
		
	
	@Override
	public void selectCSGenreWarInMovies() {
		pages.moviePage.moveCSinMovie()
		.ClickGenreWar();
		
	}

	@Override
	public void playMovieComedy() {
		pages.moviePage.ClickPlayMovieComedy();
		
		
	}

	@Override
	public void playMovieWar() {
		pages.moviePage.ClickPlayWar();
		
	}

	@Override
	public void proverka() {
		pages.moviePage.Proverka();
		
	}

	@Override
	public void proverkaMoreLike() {
		pages.moviePage.ProverkaMoreLikeSection();
		
	}

	@Override
	public void provPlusMenuMoreLike() {
		pages.moviePage.ProverkaPlusMenuMoreLike();
		
	}
	
	@Override
	public void proverkaAddToCollection() {
		pages.moviePage.ProverkaAddTo();
		
	}

	@Override
	public void proverkaPlayOnPlusMenu() {
		pages.moviePage.ProverkaPlayOnPlus();
		
	}

	@Override
	public void provAddToPlusMenu() {
		pages.moviePage.ProverkaAddOnPlus();
		
	}
}

package applogic;

public interface SearchHelper {
	void clickOverImageMovie();
	void playAnyMovieInSearch();
	void AddToColectionMovieInSearchPage();
	void MoreInfoMovieInSearchPage();
	
	void clickOverImageMusic();
	void playAnyMusicInSearch();
    void AddToColectionMusicInSearchPage();
	void MoreInfoMusicInSearchPage();
	void AddToQueueMusicInSearchPage();

	void clickOverImageBok();
	void readAnyBookInSearch();
	void AddToColectionBookInSearchPage();
	void MoreInfoBookInSearchPage();

	void clickButtonSearch();
	void putAnyInfoIntoSearchField(String search);
	
	void checkMoreInfoMovieOpen();
	void checkMovieOpen();
	void checkAddMovieToCollection();
	
	void checkMoreInfoMusicOpen();
	void checkMusicPlay();
	void checkAddMusicToCollection();
	void checkAddMusicToQueue();
	
	void checkMoreInfoBookOpen();
	void checkBookOpen();
	void checkAddBookToCollection();

}

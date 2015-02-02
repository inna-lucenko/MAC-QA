package applogic;

import selenium.pages.GameHelper;


public interface ApplicationManager {
	
	UserHelper getUserHelper();
    NavigationHelper getNavigationHelper();
    MusicHelper getMusicHelper();
    BookHelper getBookHelper();
    MoviesHelper getMoviesHelper();
    GameHelper getGameHelper();
    QueueHelper getQueueHelper();
    void stop();
    SearchHelper getSearchHelper();
    SoftwareHelper getSoftwareHelper();
	


}

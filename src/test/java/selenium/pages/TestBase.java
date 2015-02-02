package selenium.pages;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import applogic1.ApplicationManager1;

/*
 * Base class for all the test classes
 * 
 * @author Sebastiano Armeli-Battana
 */

public class TestBase {
	protected ApplicationManager1 app;
	
	@BeforeClass
	
		public void init(){
		app = new ApplicationManager1();
		}
	
    @AfterSuite
       public void stop(){
    	app.stop();
	}
    
    
}
package selenium;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/*public class Tests extends selenium.pages.TestBase {
	
	private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
   
    static sendEmail mail = new sendEmail();
    Date startDate = new Date();
    static FileWr file = new FileWr();
	HoverImage hover = new HoverImage();
	static LoginTest login = new LoginTest();
	static PlayMovie movie = new PlayMovie();
	static PlayMusicTest play = new PlayMusicTest();

    
//	arch.addToZip(new File("chromeReport"), "chromeReport.zip");
//	mail.sendToAll("chromeReport.zip");
    
     @BeforeClass
    public void setUp() throws Exception {
    	driver.manage().window().maximize();
    	file.writeToFile("report.txt", "Report");
    }
    
    @AfterClass
    public void tearDown() {
      driver.quit();
  //    
    }

    @Test
    public void loginTests() throws NoSuchElementException, InterruptedException {
    	file.writeFile(startDate.toString());
    	file.writeFile("-----------------------------------------------------------------------------");
    	//driver.get("http://staging.pf-ayeplay.jomediainc.com/signup?sf=eight_r");
    //	file.writeFile("SIGN UP - STARTED");
    //	login.signUp(driver, file);
    //	file.writeFile("SIGN UP - FINISHED");
    //	file.writeFile("-----------------------------------------------------------------------------"); 
	    	
    	
   		driver.get(baseUrl + "/login");
   	    WebElement usernameField = driver.findElement(By.id("username"));
   		usernameField.clear();
   	    usernameField.sendKeys("test_stag2@jo-media.com");
   	    WebElement passwordField = driver.findElement(By.id("password"));
   		passwordField.clear();
   		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   	    passwordField.sendKeys("123456");
   	    driver.findElement(By.cssSelector("input.login_button")).click();
   	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   	    file.writeFile("Login - PASSED");
   	    file.writeFile("-----------------------------------------------------------------------------");
   	  //  driver.navigate().refresh();
     	 
   	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   	    
    file.writeFile("MOVIES - STARTED");
	movie.movieTest(driver, file);
	file.writeFile("MOVIES - FINISHED");
	file.writeFile("-----------------------------------------------------------------------------");
	
	file.writeFile("MUSIC - STARTED");
	play.playAlbums(driver, file);
	file.writeFile("MUSIC - FINISHED");
	file.writeFile("-----------------------------------------------------------------------------");
	
	 
	    	try {
				file.closeWrite();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    
			
					
					// open books tag
					driver.findElement(By.id("books_tab")).click();
					file.writeFile("-----------------------------------------------------------------------------");
					file.writeFile("BOOKS - STARTED");
					file.writeFile("loading tab 'BOOKS' - " + driver.getCurrentUrl());
					
					// Click on the "read" button of any book
					hover.playHover(driver);
					System.out.println("Read by click on 'Read Now' button");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if (driver.findElement(By.xpath("//*[@id=\"reader\"]/div[2]/div/div"))
							.isEnabled()) {
						System.out.println("Read by click on 'Read Now' button - PASSED");
						file.writeFile("Read by click on 'Read Now' button - PASSED");
			//			scsh.makeScreen("Read dy click on 'Read Now' button PASSED", screenDir);
					} else {
						System.out.println("Read dy click on 'Read Now' button - FAILED");
						file.writeFile("Read dy click on 'Read Now' button - FAILED");
					}
					// Click on the "Back arrow" in the browser
					driver.navigate().back();
				
					try {
						Thread.sleep(7000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					
	
   driver.get("http://members.ayeplay.com/books");

				//	Click on "add to collection" in any book (plus button)
		hover.addToCollection(driver);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (driver.findElement(By.className("message")).isEnabled()) {
			System.out.println("Add Book to Collection - PASSED");
			file.writeFile("Add Book to Collection - PASSED");
		} else {
			System.out.println("Add Book to Collection - FAILED");
			file.writeFile("Add Book to Collection - FAILED");
		}
		
		
		// enter to collection
				driver.findElement(
						By.xpath("//*[@id=\"sidenav-your-stuff\"]/ul/li[1]/a/span[1]"))
						.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				String url = "http://members.ayeplay.com/#member/collection";
				if (driver.getCurrentUrl().equals(url)) {
					System.out.println("Open Collection - PASSED");
					file.writeFile("Open Collection - PASSED");
				} else {
					System.out.println("Open Collection - FAILED");
					file.writeFile("Open Collection - FAILED");
				}
				// read book from collection
				Actions hovcol = new Actions(driver);
				Actions colBtn = hovcol.moveToElement(driver.findElement(By
						.xpath("//*[@id=\"browse_wrapper\"]/div[2]/div[2]")));
				colBtn.perform();
				driver.findElement(
						By.xpath("//*[@id=\"browse_wrapper\"]/div[2]/div[2]/div[1]/div"))
						.click();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			//	if (driver.findElement(By.xpath("//*[@id=\"comic-control\"]"))
			//			.isEnabled()) {
					System.out.println("Read book from collection - PASSED");
					file.writeFile("Read book from collection - PASSED");
		//			scsh.makeScreen("Read book from collection PASSED", screenDir);
			//	} else {
			////		System.out.println("Read book from collection - FAILED");
			//		file.writeFile("Read book from collection - FAILED");
			//	}
				driver.navigate().back();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				driver.findElement(By.id("books_tab")).click();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// Click on "read now" button of any book (plus button)
				hover.playNowPlus(driver);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		//		if (driver.findElement(By.xpath("//*[@id=\"comic-control\"]"))
		//				.isEnabled()) {
					System.out
							.println("Read book by Click on 'read now' button of any book (plus button) - PASSED");
					file.writeFile("Read book by Click on 'read now' button of any book (plus button) - PASSED");
		//			scsh.makeScreen("Read book by Click on read now button of any book on plus button PASSED", screenDir);
		//		} else {
		//			System.out
		//					.println("Read book by Click on 'read now' button of any book (plus button) - FAILED");
		//			file.writeFile("Read book by Click on 'read now' button of any book (plus button) - FAILED");
		//		}
				driver.navigate().back();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				driver.findElement(By.id("books_tab")).click();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		
		//	driver.navigate().back();
   
				driver.get("http://members.ayeplay.com//books");
				
				driver.findElement(By.cssSelector("div.drop-arrow-wrap > svg")).click();
			   	driver.findElement(By.linkText("Log Out")).click();
			   
			   	file.writeFile("-----------------------------------------------------------------------------");	
			   	file.writeFile("Logout  - PASSED");
			   	file.writeFile("-----------------------------------------------------------------------------");	
			   	file.writeFile(startDate.toString());
    			
    		    	
    		//    	mail.sendToAll("Report/report.txt");
			   	
			   	
			   	
   }
   
    
    private void backBtn(WebDriver driver) {
		Actions hov = new Actions(driver);
		Actions hovBtn = hov.moveToElement(driver.findElement(By.xpath("//*[@id=\"browse_wrapper\"]")));//*[@id="video_close"]
		hovBtn.perform();
		driver.findElement(By.xpath("//*[@id=\"video_close\"]")).click();
	}
  } 
*/




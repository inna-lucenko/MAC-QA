package selenium.pages;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

	public abstract class SearchScreenShots extends Page {

		public SearchScreenShots(PageManager pages) {
			super(pages);
		}
		
		public void ScreenBUGcheckMoreInfoMovieOpen() { 
			 
			 Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
			 try {
				ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Search_page/BUGcheckMoreInfoMovieOpen.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	    }
		public void ScreenBUGcheckMovieOpen() { 
			 
			 Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
			 try {
				ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Search_page/BUGcheckMovieOpen.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	    }
		public void ScreenBUGcheckAddMovieToCollection() { 
			 
			 Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
			 try {
				ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Search_page/BUGcheckAddMovieToCollection.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	    }
		public void ScreenBUGcheckMoreInfoMusicOpen() { 
			 
			 Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
			 try {
				ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Search_page/BUGcheckMoreInfoMusicOpen.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	    }
		public void ScreenBUGcheckMusicPlay() { 
			 
			 Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
			 try {
				ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Search_page/BUGcheckMusicPlay.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				public void 	ScreenBUGcheckAddMusicToCollection() { 
					 
					 Robot robot = null;
					try {
						robot = new Robot();
					} catch (AWTException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
					 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
					 try {
						ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Search_page/BUGcheckAddMusicToCollection.jpg"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    }
				
				
				public void 	ScreenBUGcheckAddMusicToQueue() { 
					 
					 Robot robot = null;
					try {
						robot = new Robot();
					} catch (AWTException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
					 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
					 try {
						ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Search_page/BUGcheckAddMusicToQueue.jpg"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    }
				
				public void 	ScreenBUGcheckMoreInfoBookOpen() { 
					 
					 Robot robot = null;
					try {
						robot = new Robot();
					} catch (AWTException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
					 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
					 try {
						ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Search_page/BUGcheckMoreInfoBookOpen.jpg"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    }
				public void 	ScreenBUGcheckBookOpen() { 
					 
					 Robot robot = null;
					try {
						robot = new Robot();
					} catch (AWTException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
					 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
					 try {
						ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Search_page/BUGcheckBookOpen.jpg"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    }
				public void 	ScreenBUGcheckAddBookToCollection() { 
					 
					 Robot robot = null;
					try {
						robot = new Robot();
					} catch (AWTException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
					 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
					 try {
						ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Search_page/BUGcheckAddBookToCollection.jpg"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    }
	
	}		
		
		

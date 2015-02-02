package selenium.pages;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

	public abstract class MoviesScreenAnyPage extends Page {

		public MoviesScreenAnyPage(PageManager pages) {
			super(pages);
		}
		
		public void ScreenBUGMoviePlayerOpeninMoreLikeSection() { 
			 
			 Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
			 try {
				ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Movies_page/MoviePlayerOpeninMoreLikeSection.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	    }
		public void ScreenBUGSegment() { 
			 
			 Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
			 try {
				ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Movies_page/bugSegmentInMoviePage.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	    }
		public void ScreenBUGPlayNowInPlusMenu() { 
			 
			 Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
			 try {
				ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Movies_page/PlayNowInPlusMenu.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	    }
		public void ScreenBUGAddToCollectionPlusMenuMoreLikeSection() { 
			 
			 Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
			 try {
				ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Movies_page/AddToCollectionPlusMenuMoreLikeSection.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	    }
		public void ScreenBUGPlayNowInPlusMenuONMoreLike() { 
			 
			 Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
			 try {
				ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Movies_page/PlayNowInPlusMenuONMoreLike.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				public void 	ScreenBUGAddToCollecInPlusMenu() { 
					 
					 Robot robot = null;
					try {
						robot = new Robot();
					} catch (AWTException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
					 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
					 try {
						ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Movies_page/bugAddTOCollectionInPlusMenu.jpg"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    }
	
	}		
		
		

package selenium.pages;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

	public abstract class BookScreen extends Page {

		public BookScreen(PageManager pages) {
			super(pages);
		}
		
		public void ScreenBUGBookOpen() { 
			 
			 Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
			 try {
				ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Book_page/bugBookNotOpen.jpg"));
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
				ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Book_page/bugSegmentInBookPage.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	    }
		public void ScreenBUGReadNowInPlusMenu() { 
			 
			 Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
			 try {
				ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Book_page/bugReadNowInPlusMenu.jpg"));
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
				ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Book_page/bugAddToCollectionPlusMenuMoreLikeSection.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	    }
		public void ScreenBUGReadNowInPlusMenuONMoreLike() { 
			 
			 Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
			 try {
				ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Book_page/bugReadNowInPlusMenuONMoreLike.jpg"));
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
						ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Book_page/bugAddTOCollectionInPlusMenu.jpg"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    }
				
				
				public void 	ScreenBUGMoreInfoInPlusMenu() { 
					 
					 Robot robot = null;
					try {
						robot = new Robot();
					} catch (AWTException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
					 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
					 try {
						ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Book_page/bugMoreInfoInPlusMenu.jpg"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    }
				
				public void 	ScreenBUGMessageAddToCollection() { 
					 
					 Robot robot = null;
					try {
						robot = new Robot();
					} catch (AWTException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
					 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
					 try {
						ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Book_page/bugMessageAddToCollection.jpg"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    }
				public void 	ScreenBUGNeedHelp() { 
					 
					 Robot robot = null;
					try {
						robot = new Robot();
					} catch (AWTException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
					 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
					 try {
						ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Book_page/bugNeedHelp.jpg"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    }
	
	}		
		
		

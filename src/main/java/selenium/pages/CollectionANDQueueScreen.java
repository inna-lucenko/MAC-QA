package selenium.pages;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

	public abstract class CollectionANDQueueScreen extends Page {

		public CollectionANDQueueScreen(PageManager pages) {
			super(pages);
		}
		
		public void ScreenBUGMusicPlayerOpenInCollectionPage() { 
			 
			 Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
			 try {
				ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Collection_page/MusicPlayerIsNotOpen.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	    }
		
		public void ScreenBUGMusicPlayerOpenInQueuePage() { 
			 
			 Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
			 try {
				ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Queue_page/MusicPlayerIsNotOpen.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	    }
		
		
	}
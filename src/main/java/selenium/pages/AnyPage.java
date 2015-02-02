package selenium.pages;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

	public abstract class AnyPage extends Page {

		public AnyPage(PageManager pages) {
			super(pages);
		}
		
		public void ScreenBUGNeedHelp() { 
			 
			 Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
			 try {
				ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Music_page/bugneedhelp.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	    }
		public void ScreenBUGAddCollection() { 
			 
			 Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
			 try {
				ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Music_page/bugAddToCollection.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	    }
		public void ScreenBUGPlayerOpen() { 
			 
			 Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
			 try {
				ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Music_page/bugOpenenPlayer.jpg"));
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
				ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Music_page/bugSegment.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	    }
		public void ScreenBUGMoreInfoInPlusMenu() { 
			 
			 Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
			 try {
				ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Music_page/bugOpenMoreInfo.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	    }
		public void ScreenBUGAddToQueueInPlusMenu() { 
			 
			 Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
			 try {
				ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Music_page/bugAddToQueueInPlusMenu.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	    }
		public void ScreenBUGMoreLike() { 
			 
			 Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
			 try {
				ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/BUG/Music_page/bugOpenMoreLikeSection.jpg"));
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
						ImageIO.write(screenShot, "JPG", new File("/users/Jomedia/Documents/Music_page/BUG/bugAddTOCollectionInPlusMenu.jpg"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    }
	
	}		
		
		
/*		public void writetextNedHelp(String[] args)
		{
			 
			    File fwp = new File("/users/Jomedia/Documents/test.txt");
			    try {
			        FileWriter fw = new FileWriter(fwp);
			        fw.write("NeedHelp\r\n");
				    fw.close(); 
			    } catch (IOException e) {
			        // TODO Auto-generated catch block
			        e.printStackTrace();
			    }

			}
		
		public void writetextAddCollection(String[] args)
		{
			 
			    File fwp = new File("/users/Jomedia/Documents/test.txt");
			    try {
			        FileWriter fw = new FileWriter(fwp);
			        fw.write("Add to collection\r\n");
				    fw.close(); 
			    } catch (IOException e) {
			    
			        e.printStackTrace();
			    }

			}
		}
*/
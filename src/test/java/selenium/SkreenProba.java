package selenium;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;


public class SkreenProba {

	public static BufferedImage getScreenComponent(Component c)
	{   
	    BufferedImage image = null;
	    try
	    {
	        image = new Robot().createScreenCapture
	        (
	            new Rectangle
	            (
	                c.getLocationOnScreen().x,
	                c.getLocationOnScreen().y,
	                c.getWidth(),
	                c.getHeight()
	            )
	        );
	    } catch(Exception e) {}  
	    return image;
	}
}

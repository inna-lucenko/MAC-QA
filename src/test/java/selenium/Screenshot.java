package selenium;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Screenshot {

	public void makeScreen(String name, String screenDir) {
		try {
			Robot robot;
			robot = new Robot();
			BufferedImage screenShot = robot.createScreenCapture(new Rectangle(
					Toolkit.getDefaultToolkit().getScreenSize()));
			File file = new File(new File(screenDir), name + ".png");
			ImageIO.write(screenShot, "png", file);
		} catch (IOException e) {
		} catch (AWTException e) {

		}
	}

		

	
	}


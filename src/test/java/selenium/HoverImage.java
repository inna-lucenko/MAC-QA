package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverImage {
	// click button Play hovering image
	public void playHover(WebDriver driver) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(250, 0)");
		Actions hover = new Actions(driver);
		Actions hoverBtn = hover
				.moveToElement(
						driver.findElement(By
								.xpath("//*[@id=\"browse_wrapper\"]/div[1]/div[3]/a")))
				.moveToElement(
						driver.findElement(By
								.xpath("//*[@id=\"browse_wrapper\"]/div[1]/div[3]/div/div/a/button")))
								.click();
	
		hoverBtn.perform();
	//	driver.findElement(
		//		By.xpath("//*[@id=\"browse_element_wrapper\"]/div[3]/div/div[2]/a/span"))
		//		.click();
	}

	// Click Add to queue button in plus menu
	public void addToQueue(WebDriver driver) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(250, 0)");
		Actions hover = new Actions(driver);
		Actions hoverBtn = hover.moveToElement(driver.findElement(By
				.xpath("//*[@id=\"browse_wrapper\"]/div[1]/div[3]/a")));
		hoverBtn.perform();
		// click plus button
		driver.findElement(
				By.xpath("//*[@id=\"browse_wrapper\"]/div[1]/div[3]/div/div/div/button"))
				.click();
		// move to menu
		hoverBtn = hover
				.moveToElement(driver.findElement(By
						.xpath("//*[@id=\"browse_element_wrapper\"]/div[1]/div/div[1]/div")));
		hoverBtn.build().perform();
		// click add to queue button
		driver.findElement(
				By.xpath("//*[@id=\"browse_wrapper\"]/div[1]/div[3]/div[1]/div/div/ul/li[1]/a"))
				.click();
	}

	// click add to collection button in plus menu
	public void addToCollectionMus(WebDriver driver) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(250, 0)");
		Actions hover = new Actions(driver);
		Actions hoverBtn = hover.moveToElement(driver.findElement(By
				.xpath("//*[@id=\"browse_element_wrapper\"]/div[3]"))) 
		// click plus button
				
		.moveToElement(driver.findElement(
				By.xpath("//*[@id=\"browse_element_wrapper\"]/div[3]/div/div/div/button")))
				.click();
					
				 
		hoverBtn.perform();
		
		// move to menu
	/*hoverBtn = hover
				.moveToElement(driver.findElement(By
						.xpath("//*[@id=\"browse_element_wrapper\"]/div[1]/div/div[1]/div")));
		hoverBtn.build().perform();*/
		// click add to collection button
		driver.findElement(
				By.xpath("//*[@id=\"browse_wrapper\"]/div[1]/div[5]/div[1]/div/div/ul/li[1]/a"))
				.click();
	}

	public void addToCollection(WebDriver driver) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(250, 0)");
		Actions hover = new Actions(driver);
		Actions hoverBtn = hover.moveToElement(driver.findElement(By
				.xpath("//*[@id=\"browse_element_wrapper\"]/div[2]/a"))); 
		hoverBtn.perform();
		// click plus button
		driver.findElement(
				By.xpath("//*[@id=\"browse_element_wrapper\"]/div[2]/div/div/div/button"))
				.click();
		// move to menu
		hoverBtn = hover
				.moveToElement(driver.findElement(By
						.xpath("//*[@id=\"browse_element_wrapper\"]/div[3]/div/div[1]/div")));
		hoverBtn.build().perform();
		// click add to collection button
		driver.findElement(
				By.xpath("//*[@id=\"browse_element_wrapper\"]/div[2]/div[1]/div/div/ul/li[1]/a"))
				.click();
	}

	// click play now in plus menu
	public void playNowPlus(WebDriver driver) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(250, 0)");
		Actions hover = new Actions(driver);
		Actions hoverBtn = hover.moveToElement(driver.findElement(By
				.xpath("//*[@id=\"browse_element_wrapper\"]/div[2]/a")));
		hoverBtn.perform();
		// click plus button
		driver.findElement(
				By.xpath("//*[@id=\"browse_element_wrapper\"]/div[2]/div/div/div/button"))
				.click();
		// move to menu
		hoverBtn = hover
				.moveToElement(driver.findElement(By
						.xpath("//*[@id=\"browse_element_wrapper\"]/div[1]/div/div[1]/div")));
		hoverBtn.build().perform();
		// click play now button
		driver.findElement(
				By.xpath("//*[@id=\"browse_element_wrapper\"]/div[2]/div[1]/div/div/ul/li[2]/a"))
				.click();
	}

	// click more info in plus menu
	public void moreInfo(WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(250, 0)");
		Actions hover = new Actions(driver);
		Actions hoverBtn = hover.moveToElement(driver.findElement(By
				.xpath("*[@id=\"browse_element_wrapper\"]/div[2]/a")));
		hoverBtn.perform();
		// click plus button
		driver.findElement(
				By.xpath("//*[@id=\"browse_element_wrapper\"]/div[2]/div/div/div/button"))
				.click();
		// move to menu
		hoverBtn = hover
				.moveToElement(driver.findElement(By
						.xpath("//*[@id=\"browse_element_wrapper\"]/div[2]/div/div[1]/div")));
		hoverBtn.build().perform();
		// click play now button
		driver.findElement(
				By.xpath("//*[@id=\"browse_element_wrapper\"]/div[13]/div[1]/div/div/ul/li[4]/a"))
				.click();

	}

	public void moreLike(WebDriver driver) {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(250, 0)");
		Actions hover = new Actions(driver);
		Actions hoverBtn = hover.moveToElement(driver.findElement(By
				.xpath("//*[@id=\"related_container\"]/div/div[2]/a")));
		hoverBtn.perform();
		driver.findElement(
				By.xpath("//*[@id=\"related_container\"]/div/div[2]/div/div/button"))
				.click();
	}

	// play from collection
	public void fromColl(WebDriver driver) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(250, 0)");
		Actions hovcol = new Actions(driver);
		Actions colBtn = hovcol.moveToElement(driver.findElement(By
				.xpath("//*[@id=\"browse_wrapper\"]/div[2]/div[2]")));
		colBtn.perform();
		driver.findElement(
		// *[@id="browse_wrapper"]/div[2]/div[2]/div[1]/div
		// *[@id="browse_wrapper"]/div[2]/div[7]/div[1]/div
				By.xpath("//*[@id=\"browse_wrapper\"]/div[2]/div[2]/div[1]/div"))
				.click();
	}

	// play now from because section
	public void becauseSect(WebDriver driver) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(250, 0)");
		Actions hovbec = new Actions(driver);
		Actions becBtn = hovbec.moveToElement(driver.findElement(By
				.xpath("//*[@id=\"browse_wrapper\"]/div[1]/div[2]/a")));
		becBtn.perform();
		driver.findElement(
				By.xpath("//*[@id=\"browse_wrapper\"]/div[1]/div[2]/div/div/button"))
				.click();
	}

	// filter in collection
	public void filterMusColl(WebDriver driver) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(
				By.xpath("//*[@id=\"browse_wrapper\"]/div[2]/div[1]/span"))
				.click();
		driver.findElement(
				By.xpath("//*[@id=\"browse_wrapper\"]/div[2]/div[1]/ul/li[4]/a"))
				.click();

	}

	// verify does element on page
	public boolean doesElementExist(WebDriver driver, By elem) {

		if (driver.findElements(elem).size() > 0) {
			return true;

		} else {

			return false;

		}

	}

}

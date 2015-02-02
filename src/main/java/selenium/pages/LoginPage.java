package selenium.pages;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class LoginPage extends AnyPage{

		public LoginPage(selenium.pages.PageManager pages) {
			super(pages);
		}

		@FindBy(name = "username")
		private WebElement usernameField;
			
		@FindBy(name = "password")
		private WebElement passwordField;
		
		@FindBy(className = "login_button")
		private WebElement login_button;
		
		
		public LoginPage clearUsernameField() {
		    usernameField.clear();
		    return this;
		  } 
		
		public LoginPage setUsernameField(String text) {
		    usernameField.sendKeys(text);
		    return this;
		  }

		 public LoginPage clearPasswordField() {
			    passwordField.clear();
			    return this;
			  }
		
		  public LoginPage setPasswordField(String text) {
		    passwordField.sendKeys(text);
		    return this;
		  }

		  public void clickSubmitButton() {
		    login_button.click();
		  }
		
		  public LoginPage ensurePageLoaded() {
			    super.ensurePageLoaded();
			    wait.until(presenceOfElementLocated(By.id("rememberMe")));
			    return this;
			  }
		

}

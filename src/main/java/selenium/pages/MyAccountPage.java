package selenium.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MyAccountPage extends AnyPage {

	public MyAccountPage(selenium.pages.PageManager pages) {
		super(pages);
	}
	@FindBy(xpath="//*[@id=\"ma_modal\"]/div/div[2]/button")
	private WebElement no;
/*	@FindBy(xpath="//*[@id=\"ma_modal\"]/div/div[2]/button") 
	private WebElement noy;*/
	//			E-mail
	
	@FindBy(id="user-email")
	private WebElement userEmail;
	
		@FindBy(id="username")
		private WebElement NewUserEmail;
	
		@FindBy(id="conf-user")
		private WebElement ConfirmNewUserEmail; 
		
		@FindBy(xpath=".//*[@id='udpate-ccn']/fieldset[3]/input")
		private WebElement saveNewUserEmail;
		
		@FindBy(xpath=".//*[@id='update-user']/fieldset[4]/input")
		private WebElement cancelNewUserEmail;
		
				
		
	//    			Password
		
	@FindBy(xpath=".//*[@id='account-password']/span")
	private WebElement userPassword;
	
		@FindBy(id="old-pass")
		private WebElement OldUserPassword; 
	
		@FindBy(id="new-pass")
		private WebElement NewUserPassword; 
	
		@FindBy(id="conf-pass")
		private WebElement ConfirmNewUserPassword; 
		
		@FindBy(xpath=".//*[@id='update-user']/fieldset[4]/input")
		private WebElement saveNewUserPassword;
		
		@FindBy(xpath=".//*[@id='update-pass']/fieldset[5]/input")
		private WebElement cancelNewUserPassword;
	
	//  		Language	 
		
	@FindBy(xpath=".//*[@id='toggle-lng']/span") 
	private WebElement language;    
		
		@FindBy(id="lang")
		private WebElement selectLanguage; 
		
		@FindBy(xpath=".//*[@id='lng']/fieldset[2]/input")
		private WebElement saveLanguage;
		
		@FindBy(xpath=".//*[@id='lng']/fieldset[3]/input")
		private WebElement cancelLanguage;
		
	//			Method payment 	
		
	@FindBy(xpath=".//*[@id='acc-payment-method']/span")
	private WebElement paymentMethod;
	
		@FindBy(id="first-name")
		private WebElement firstNamePayment;
		
		@FindBy(id="last-name")
		private WebElement lastNamePayment;
		
		@FindBy(id="ccn")
		private WebElement creditCardPayment;
		
		@FindBy(id="month")
		private WebElement monthPayment;
		
		@FindBy(id="year")
		private WebElement yearPayment;
		
		@FindBy(id="cvv2_code")
		private WebElement codeCreditCardPayment;
		
		@FindBy(xpath=".//*[@id='udpate-ccn']/fieldset[6]/input")
		private WebElement savePaymentMethod;
		
		@FindBy(xpath=".//*[@id='udpate-ccn']/fieldset[7]/input")
		private WebElement cancelPaymentMethod;
	
				
		public MyAccountPage clickNo() {
			no.click();
			return null;
		}
		
	/*	public MyPaswordPage clickNoy() {
			noy.click();
			return null;
		}*/
			
			
		// Email
		
		public MyAccountPage clickUserEmail() {
			userEmail.click();
				return this;
			}
		
		public MyAccountPage setNewUserEmail(String text) {
			NewUserEmail.sendKeys(text);
			    return this;
			}
		
		public MyAccountPage setConfirmNewUserEmail(String text) {
			ConfirmNewUserEmail.sendKeys(text);
			    return this;
			}
		
		public MyAccountPage clickSaveNewUserEmail() {
			saveNewUserEmail.click();
				return this;
			}
		public MyAccountPage clickCancelNewUserEmail() {
			cancelNewUserEmail.click();
				return this;
			}
		
		// Password
		
		public MyAccountPage clickUserPassword() {
			userPassword.click();
				return this;
			}
		
		public MyAccountPage setOldUserPassword(String text) {
			OldUserPassword.sendKeys(text);
			    return this;
			}
		
		public MyAccountPage setNewUserPassword(String text) {
			NewUserPassword.sendKeys(text);
			    return this;
			}
		
		public MyAccountPage setConfirmNewPassword(String text) {
			ConfirmNewUserPassword.sendKeys(text);
			    return this;
			}
		
		public MyAccountPage clickSaveNewUserPassword() {
			saveNewUserPassword.click();
				return this;
			}
		public MyAccountPage clickCancelNewUserPassword() {
			cancelNewUserPassword.click();
				return this;
		}
		
		//Language
		
		public MyAccountPage clickLanguage() {
			language.click();
				return this;
		}
		
		public MyAccountPage selectLanguage() {
			Select languages = new Select(selectLanguage);
			languages.selectByVisibleText("Italiano");
			return this;
		}
		
		public MyAccountPage clickSaveLanguage() {
			saveLanguage.click();
				return this;
		}
		
		public MyAccountPage clickCancelLanguage() {
			cancelLanguage.click();
				return this;
		}
		
		
		            			
			
		//Method payment
			
		public MyAccountPage clickMethodPayyment() {
			paymentMethod.click();
				return this;
			}
				
		public MyAccountPage setFirstName(String text) {
			firstNamePayment.sendKeys(text);
			    return this;
			}
		
		public MyAccountPage setLastName(String text) {
			lastNamePayment.sendKeys(text);
			    return this;
			}
		
		public MyAccountPage setCreditCard(String text) {
			creditCardPayment.sendKeys(text);
			    return this;
			}
				
		public MyAccountPage selectMonth(String text) {
			Select languages = new Select(monthPayment);
			languages.selectByVisibleText(text);
			return this;
		}
		
		public MyAccountPage selectYear(String text) {
			Select languages = new Select(yearPayment);
			languages.selectByVisibleText(text);
			return this;
		}
				
		public MyAccountPage setCodeCreditCardPayment(String text) {
			codeCreditCardPayment.sendKeys(text);
			    return this;
			}
				
		public MyAccountPage clickSaveMethodPayyment() {
			savePaymentMethod.click();
				return this;
			}
		
		public MyAccountPage clickCancelMethodPayyment() {
			cancelPaymentMethod.click();
				return this;
			}
				
		public MyAccountPage ensurePageLoaded() {
			super.ensurePageLoaded();
			wait.until(presenceOfElementLocated(By.id("account-membership")));
			return this;
		}
		
	
}

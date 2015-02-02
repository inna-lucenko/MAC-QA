package applogic1;

import applogic.DriverBasedHelper;
import applogic.UserHelper;




public class UserHelper1 extends DriverBasedHelper implements UserHelper {
	public UserHelper1(ApplicationManager1 manager1) {
		super(manager1.getWebDriver());
		
	}
	
	
	@Override
	public boolean isloginIn()	{
	return pages.internalPage.waitPageLoaded();
	
	}
	
	@Override
	public void loginAs(String name,String password){
		pages.loginPage.ensurePageLoaded()
		.clearUsernameField()
		.setUsernameField(name)
		.clearPasswordField()
		.setPasswordField(password)
		.clickSubmitButton();
		
	}
	@Override
	public void logout(){
		pages.internalPage.ensurePageLoaded()
		.clickAccountIcon()
		.clickRightogButton();
	}

	@Override
	public void changeEmail(String email) {
		pages.myAccountPage.ensurePageLoaded()
		.clickUserEmail()
		.setNewUserEmail(email)
		.setConfirmNewUserEmail(email)
		.clickCancelNewUserEmail()
		.clickNo();
		
	//	Alert alert = driver.switchTo().alert();
		//alert.accept();
	}

	@Override
	public void changePassword(String oldPassword, String newPassword) {
		pages.myAccountPage.ensurePageLoaded()
		.clickUserPassword()
		.setOldUserPassword(oldPassword)
		.setNewUserPassword(newPassword)
		.setConfirmNewPassword(newPassword)
		.clickCancelNewUserPassword();	
	//	.clickNoy();
	}

	@Override
	public void changeLanguage() {
		pages.myAccountPage.ensurePageLoaded()
		.clickLanguage()
		.selectLanguage()
		.clickSaveLanguage();		
	}

	@Override
	public void changeMethodPayment(String firstName, String lastName,
			String creditCard, String month, String year, String codeCreditCard) {
		pages.myAccountPage.ensurePageLoaded()
		.clickMethodPayyment()
		.setFirstName(firstName)
		.setLastName(lastName)
		.setCreditCard(creditCard)
		.selectMonth(month)
		.selectYear(year)
		.setCodeCreditCardPayment(codeCreditCard)
		.clickSaveMethodPayyment();		
	}


}

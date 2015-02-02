package applogic;

public  interface UserHelper {
void loginAs(String name, String password);
void logout();
void changeEmail(String email);
void changePassword(String oldPassword, String newPassword);
void changeLanguage();
void changeMethodPayment(String firstName, String lastName, String creditCard, String month, String year, String codeCreditCard);
boolean isloginIn();



}

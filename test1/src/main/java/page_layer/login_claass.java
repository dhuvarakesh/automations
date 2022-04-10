package page_layer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class login_claass {
WebDriver driver;

 public login_claass(WebDriver driver) {
 this.driver = driver;
 }

 // Using FindBy for locating elements
 @FindBy(how = How.XPATH, using = "//div[@class='IiD88i _351hSN']//input[@type='text']")
 WebElement emailTextBox;

 @FindBy(how = How.XPATH, using ="//input[@type='password']")
 WebElement passwordTextBox;

 @FindBy(how = How.XPATH, using ="//div[@class='_1D1L_j']//button[@type='submit']")
 WebElement loginButton;

 // Defining all the user actions (Methods)

 // This method is to set Email in the email text box
 public void setEmail(String strEmail) {
 emailTextBox.sendKeys(strEmail);
 }

 // This method is to set Password in the password text box
 public void setPassword(String strPassword) {
 passwordTextBox.sendKeys(strPassword);
 }

 // This method is to click on Next Button
 public void clickLoginButton() {
 loginButton.click();
 }
}

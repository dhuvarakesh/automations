package test_layer;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import base_layer.Url_page;
import page_layer.login_claass;
public class Test_class extends Url_page {

 @Test
 public void init() throws Exception {

login_claass loginpage =PageFactory.initElements(driver,login_claass.class);

 loginpage.setEmail("abc@gmail.com");
 loginpage.setPassword("abcdef");
 loginpage.clickLoginButton();
 }
}
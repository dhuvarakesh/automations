package selinium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dhuvarakesh\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.amazon.in/");
	     //window handle
	     String WindowHandle= driver.getWindowHandle();
	     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung s21 ultra");
	     driver.findElement(By.id("nav-search-submit-button")).click();
	     driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	     Set<String> WindowHandles=driver.getWindowHandles();
	     List<String>list=new ArrayList<String>(WindowHandles);
	     driver.switchTo().window(list.get(1));
	     WebElement buy=driver.findElement(By.id("buy-now-button"));
	     buy.click();
	    driver.findElement(By.id("ap_email")).sendKeys("massgokul202@gmail.com");
	    driver.findElement(By.id("continue")).click();
	    driver.findElement(By.id("ap_password")).sendKeys("gokul#07"); 
	    driver.findElement(By.id("signInSubmit")).click();
	    driver.findElement(By.id("continue")).click();
		   //  
	    // cicking the sign in page
	    // driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	     //again clcik login page
	    // driver.findElement(By.id("createAccountSubmit")).click();
	     //creating account
	     //driver.findElement(By.id("ap_customer_name")).sendKeys("dhuvarakesh");
	   // driver.findElement(By.id("ap_phone_number")).sendKeys("9840574720");
	    // driver.findElement(By.id("ap_email")).sendKeys("dhuvarakeshfocr7@gmail.com");
	    // driver.findElement(By.id("ap_password")).sendKeys("1234567899"); 
	   //  driver.findElement(By.id("continue")).click(); 
	     //window handle
	    
	     
	     
	}

}

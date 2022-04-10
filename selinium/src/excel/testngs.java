package excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testngs {
	WebDriver driver;
	@Before method
	public void enter()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dhuvarakesh\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	    driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    }
	
	@afterMethod
	public void end()
	{
		driver.close();
	}
	
@test
public void login()

{
	 driver.findElement(By.name("lastname")).sendKeys("thiyagu");
     driver.findElement(By.name("firstname")).sendKeys("saranya");
     driver.findElement(By.name("reg_email__")).sendKeys("9840574720");
     driver.findElement(By.id("password_step_input")).sendKeys("pssword");
	
	}

}

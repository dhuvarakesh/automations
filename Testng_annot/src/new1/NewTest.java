package new1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\dhuvarakesh\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	     //driver.findElement(By.id("u_0_2_9Q")).click();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.findElement(By.linkText("Create New Account")).click();
	     driver.findElement(By.name("lastname")).sendKeys("thiyagu");
	     driver.findElement(By.name("firstname")).sendKeys("saranya");
	     driver.findElement(By.name("reg_email__")).sendKeys("9840574720");
	     driver.findElement(By.id("password_step_input")).sendKeys("pssword");
	     //clicking the check gender box
	     driver.findElement(By.xpath("//input[@value='2']")).click();
	    // driver.findElement(By.id("day"));
	     Select se=new Select(driver.findElement(By.id("day")));
	     se.selectByValue("14");
	     //driver.findElement(By.id("Month"));
	     driver.findElement(By.name("birthday_month"));
	     //month selection
	     Select se1=new Select(driver.findElement(By.id("month")));
	     se1.selectByValue("3");
	     //year selection
	     Select se2=new Select(driver.findElement(By.name("birthday_year")));
	     se2.selectByValue("2015");
	     //timeout
	     //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     //signin button
	     driver.findElement(By.name("websubmit")).click();
	     //window handler
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}

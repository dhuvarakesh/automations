package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dhuvarakesh\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.flipkart.com/");
	     driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9150738655");
	     //driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("1234567");
	     driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/a/span")).click();
	     //one time verification
	     driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("4");
	     driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("6");
	      driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/div/form/div/div[3]/input")).sendKeys("2");
	      driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/div/form/div/div[4]/input")).sendKeys("2");
	      driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/div/form/div/div[5]/input")).sendKeys("9");
	      driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/div/form/div/div[6]/input")).sendKeys("9");
	     

	}

}

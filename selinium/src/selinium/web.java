package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver","C:\\Users\\dhuvarakesh\\Downloads\\chromedriver_win32\\chromedriver.exe" );
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.flipkart.com/");
     driver.findElement(By.className("_1_3W1N")).click();
     driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("dhyvarakeshfocr7@gmail.com");
     
	}

}

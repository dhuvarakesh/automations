package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prabuanna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dhuvarakesh\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://prabhurajfitness.com/");
	    // driver.findElement(By.xpath("(\"woocommerce-loop-product__title")).click();
	    // driver.findElement(By.xpath("//*[@id=\"post-1305\"]/div/div/div/section[4]/div/div/div/div[3]/div/div/div/ul/li[1]/div[2]/a/h2")).click();
	     //selecting the context
	     driver.findElement(By.className("woocommerce-loop-product__title")).click();
	     // description
	     driver.findElement( By.id("comment")).sendKeys("i like this profile and it was awesome");
	     //name
	     driver.findElement( By.id("author")).sendKeys("dhuvarakesh");
	     //email
	     driver.findElement( By.id("email")).sendKeys("dhuvarakeshfocr7@gmail.com");
	     driver.findElement(By.id("wp-comment-cookies-consent")).click();
	     driver.findElement(By.id("submit")).click();
	     driver.findElement(By.className("star4")).click();
	     
	     
	}

}

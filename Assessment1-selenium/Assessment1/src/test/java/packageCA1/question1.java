package packageCA1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class question1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.navigate().to("https://www.amazon.in/Apple-iPhone-14-512GB-Purple/dp/B0BDJYHP2H/ref=sr_1_1_sspa?keywords=iphone+14&qid=1681288324&sprefix=iphon%2Caps%2C587&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
		driver.manage().window().maximize();
		WebElement addtocart=driver.findElement(By.id("add-to-cart-button"));
		addtocart.click();
		Thread.sleep(5000);
		WebElement cartbutton=driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input"));
		cartbutton.click();
		Thread.sleep(5000);
		WebElement proceedtobuy=driver.findElement(By.name("proceedToRetailCheckout"));
		proceedtobuy.click();
		System.out.print("Sucessfully placed order");
		
		
	     	
	}

}

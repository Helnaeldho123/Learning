package fb1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class eg {
	WebDriver d;
 @BeforeTest
   public void launchBrowser() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\chromedriver2\\chromedriver.exe");
		d=new ChromeDriver();
		d.navigate().to("http://www.facebook.com");
		d.manage().window().maximize();
		
	}
 @Test(priority = 0)
 public void headerCheck() throws InterruptedException {
	String s=d.getTitle();
	System.out.println(s);
	Assert.assertEquals(s,"Facebook – log in or sign up");
	//System.out.println(s.equals(""));
}
@Test(priority = 1)
 public void signUp() throws InterruptedException {
	//Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
}
@Test(priority = 2)
 public void detailsAdding() throws InterruptedException {
	//Thread.sleep(1000);
	d.findElement(By.name("firstname")).sendKeys("Helna");
	//Thread.sleep(1000);
	d.findElement(By.name("lastname")).sendKeys("Eldho");
}

}

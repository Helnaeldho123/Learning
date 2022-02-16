package fb1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fbpg {
	
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
	d.findElement(By.name("reg_email__")).sendKeys("helnaeldho99@gmail.com");
	//Thread.sleep(1000);
	d.findElement(By.name("reg_email_confirmation__")).sendKeys("helnaeldho99@gmail.com");
	//Thread.sleep(1000);
	d.findElement(By.id("password_step_input")).sendKeys("helna@123");
	
}
@Test(priority = 3)
public void dayDropDown() throws InterruptedException {
	//Thread.sleep(1000);
	Select osselect = new Select(d.findElement(By.id("day")));
	//Thread.sleep(2000);
	osselect.selectByValue("25");
	Select select2 = new Select(d.findElement(By.id("year")));
	//Thread.sleep(2000);
	select2.selectByValue("1999");
	
}
@Test(priority = 4)
public void Radiobutton() throws InterruptedException {
	//Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/input")).click();
}
@Test(priority = 5)
public void closingPopup() throws InterruptedException {
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/img")).click();
}
 
}

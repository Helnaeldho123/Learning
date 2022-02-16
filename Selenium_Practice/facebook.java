package works;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\chromedriver2\\chromedriver.exe");
		WebDriver d = (WebDriver) new ChromeDriver();
		d.navigate().to("https://www.facebook.com/");
		
		d.manage().window().maximize();
		System.out.println("Naviagated to homepage");
		d.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("helna99@gmail.com");
		d.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123*helna");
		d.findElement(By.name("login")).click();
	}
	

}

package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class pratice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\chromedriver2\\chromedriver.exe");
		WebDriver d = (WebDriver) new ChromeDriver();
		d.navigate().to("https://www.urbanladder.com/");
		
		d.manage().window().maximize();
		System.out.println("Naviagated to homepage");
	

	  d.findElement(By.xpath("//*[@id='header']/div[1]/div/section[3]/ul/li[2]/span")).click();
	 
	  //d.findElement(By.linkText("Log In")).click();
	 
	  d.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[2]/div[3]/form/div/input")).sendKeys("abc19111@gmail.com");
	 
	  d.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[2]/div[3]/form/div/div/div/input")).sendKeys("Fk#mM!wGS9jvx4Z");
	  
	  d.findElement(By.id("ul_site_login")).click();
	  System.out.println("Login succesfull");
        
       
		
		//d.findElement(By.xpath("//*[@id=\"spree_user_email\"]/html/body/div[4]/div/div[1]/div/div[2]/div[2]/form/input[3]")).click();
        //d.findElement(By.id("spree_user_email")).sendKeys("Group_4_Alpha");
		
	}
}

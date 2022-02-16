package Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pratice2 {
	static WebDriver driver;
	static String baseUrl = "https://www.urbanladder.com/";
	static String path = "C:\\Users\\pc\\Downloads\\chromedriver2\\chromedriver.exe";

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver",path);
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		System.out.println("Naviagated to homepage");



		

		System.out.println("Navigating to prayer units in storage module");
		driver.navigate().to("https://www.urbanladder.com/prayer-units?src=g_topnav_storage_living-storage_prayer-units");
		System.out.println("Close pop up");
		driver.findElement(By.xpath("//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]")).click();
		Thread.sleep(3000);


		driver.findElement(By.xpath("//*[@id=\"filters_availability_In_Stock_Only\"]")).click();
		System.out.println("Checkboxing now");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"filters-form\"]/div[1]/div/div/ul/li/div[1]")).click();
		Thread.sleep(2000);
		System.out.println("Price filtering now");
		driver.findElement(By.xpath("//*[@id=\"price_limit_4899-17919\"]")).click();
		Thread.sleep(2000);

		System.out.println("Clicking radio button");
		driver.findElement(By.xpath("//*[@id=\"price_limit_17920-30939\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("price_limit_30940-43959")).click();


	}

}


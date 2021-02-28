import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//open the internet heroku link
		driver.get("http://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[26]/a")).click();
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

	
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-1000)");
		
		String exptext = "Infinite Scroll";
		String acttext = driver.findElement(By.cssSelector("#content > div > h3")).getText();
		
		Assert.assertEquals(acttext, exptext);
		
		System.out.println("INFINITE SCROLL ASSERT");
		
		driver.quit();
		
		
		
		
		

	}

}

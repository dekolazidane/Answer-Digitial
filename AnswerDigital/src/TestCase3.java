import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCase3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//open the internet heroku link
		
		
		driver.get("http://the-internet.herokuapp.com/");
		
		//Scenario 1
		
		//click on form key press 
		driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[31]/a")).click();
		
		//send key A
		driver.findElement(By.xpath("//*[@id=\'target\']")).sendKeys("A");
		
		String keyA = driver.findElement(By.xpath("//*[@id=\'result\']")).getText();
		String expectedA = "You entered: A";
		Assert.assertEquals(keyA, expectedA);
		System.out.println(keyA);
		Thread.sleep(500);
		
		//send key A
		driver.findElement(By.xpath("//*[@id=\'target\']")).sendKeys("B");
				
		String keyB = driver.findElement(By.xpath("//*[@id=\'result\']")).getText();
		String expectedB = "You entered: B";
		Assert.assertEquals(keyB, expectedB);
		System.out.println(keyB);
		Thread.sleep(500);
		
		
		//send key C
		driver.findElement(By.xpath("//*[@id=\'target\']")).sendKeys("C");
				
		String keyC = driver.findElement(By.xpath("//*[@id=\'result\']")).getText();
		String expectedC = "You entered: C";
		Assert.assertEquals(keyC, expectedC);
		System.out.println(keyC);
		Thread.sleep(500);
		
		
		//send key D
		driver.findElement(By.xpath("//*[@id=\'target\']")).sendKeys("D");
				
		String keyD = driver.findElement(By.xpath("//*[@id=\'result\']")).getText();
		String expectedD = "You entered: D";
		Assert.assertEquals(keyD, expectedD);
		System.out.println(keyD);
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		
		

	}

}

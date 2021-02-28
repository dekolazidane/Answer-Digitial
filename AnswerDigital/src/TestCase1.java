import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//open the internet heroku link
		driver.get("http://the-internet.herokuapp.com/");
		
		//click on form auth
		driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[21]/a")).click();
		
		//enter username in username input box
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("tomsmith");
				
		//enter wrong password in password box
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("adekola");
				
		//click login
		driver.findElement(By.xpath("//*[@id=\'login\']/button/i")).click();
		
		Thread.sleep(500);
				
		String strNew = driver.findElement(By.xpath("//*[@id=\'flash\']")).getText();
		
		String strNew1= strNew.replace("×", "");
		
		String actpasserrmsg = strNew1.replace("\n", "");
		
		
		
		String exppasserrmsg = "Your password is invalid!";
		Assert.assertEquals(actpasserrmsg, exppasserrmsg);
		
		System.out.println("FAILED PASSWORD PASS");
		
		
		Thread.sleep(500);
		
		
		//Scenario 2
		
		//enter wrong username in username input box
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("adekola");
						
		//enter password in password box
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("SuperSecretPassword!");
						
		//click login
		driver.findElement(By.xpath("//*[@id=\'login\']/button/i")).click();
				
		Thread.sleep(500);
						
		
		
		String strNew2 = driver.findElement(By.xpath("//*[@id=\'flash\']")).getText();
		
		String strNew3= strNew2.replace("×", "");
		
		String actusererrmsg = strNew3.replace("\n", "");
		
		
		
		String expusererrmsg = "Your username is invalid!";
		Assert.assertEquals(actusererrmsg, expusererrmsg);
		
		System.out.println("FAILED USERNAME PASS");
		
				
				
		
		
		
		//enter username in username input box
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("tomsmith");
				
		//enter password in password box
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("SuperSecretPassword!");
				
		//click login
		driver.findElement(By.xpath("//*[@id=\'login\']/button/i")).click();
				
				
		//logout
				
		driver.findElement(By.xpath("//*[@id=\'content\']/div/a")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		System.out.println("LOGIN LOGOUT PASSED");
				
		
		

	}

}

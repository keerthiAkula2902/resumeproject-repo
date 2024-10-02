import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test10 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//	driver.get("https://itr-qa.icc.solutions.iqvia.com/IQVIA-ITR-CM-QA-Integration/User/Login");
		driver.get("https://itr-qa.icc.solutions.iqvia.com/IQVIA-ITR-CM-QA-Upgrade/User/Login");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("mui-1")).sendKeys("navin100");
		driver.findElement(By.id("mui-3")).sendKeys("@Letstr!1umph");
		//driver.findElement(By.cssSelector("button[type='submit']")).click();
		
	//	String s=driver.findElement(By.cssSelector("h2.remove-texttransform")).getText();
	//	System.out.println(s);
		//closes only current highlighted window
	//	driver.close();
		//closes all tabs opened by selenium
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.id("mui-5")).sendKeys("keerthia@gmail.com");
	//	driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[contains(@type,'sub')]")).click();
	//	driver.findElement(By.cssSelector("button[type*='sub']")).click();
	//	Thread.sleep(8000);

		driver.findElement(By.xpath("//div[@class='jss189 jss190']/button[contains(text(),'Close')]")).click();
		
		//driver.findElement(By.xpath("//button[@xpath='1']")).click();
	//	driver.quit();
		
	}

}

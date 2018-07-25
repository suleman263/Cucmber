package Smoke_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class smoke_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32_v2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/V1/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr143413");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("zygUrag");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("shaik");
		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("01012013");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")).sendKeys("test");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Telanagana");
		driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys("500038");
		driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("9874563210");
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("asdf.fd12@gmail.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
	}

}

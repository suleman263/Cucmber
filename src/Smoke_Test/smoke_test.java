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
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("abc");
	}

}

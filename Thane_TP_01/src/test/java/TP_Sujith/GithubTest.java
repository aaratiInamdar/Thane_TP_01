package TP_Sujith;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GithubTest {
	
	@Test
	
	public void nameTest() {
		
		System.out.println("Sujith1011");
	}
	
	@Test
	public void googleThalaTest() {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.className("gLFyf")).sendKeys("Thala");
		driver.findElement(By.className("gLFyf")).submit();
		driver.close();
	}
}

package assessment1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class UiBank {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://uibank.uipath.com/register-account");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("Thiya");
		driver.findElement(By.xpath("//select[@id='title']")).click();
		driver.findElement(By.xpath("//option[text()='Ms']")).click();
		driver.findElement(By.id("middleName")).sendKeys("J");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Thiya");
		driver.findElement(By.name("gender")).click();
		driver.findElement(By.xpath("//option[text()='Female']")).click();
		driver.findElement(By.id("employmentStatus")).click();
		driver.findElement(By.xpath("//option[text()='Full-time']")).click();
		driver.findElement(By.id("age")).sendKeys("01/01/00");
		driver.findElement(By.id("maritalStatus")).click();
		driver.findElement(By.xpath("//option[text()='Single']")).click();
		driver.findElement(By.id("numberOfDependents")).sendKeys("5");
		driver.findElement(By.id("username")).sendKeys("userName");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("password")).sendKeys("passWord");
		Thread.sleep(2000);
		driver.close();
		
		
	}

}

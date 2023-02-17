package assessment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	
		public static void main(String[] args) throws InterruptedException {
			EdgeDriver driver=new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Priya");
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("selvi");
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9876543210");
			driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("025");
			WebElement ele=driver.findElement(By.id("day"));
			Select selectdate=new Select(ele);
			selectdate.selectByValue("3");
			WebElement elementWebElement=driver.findElement(By.id("month"));
			Select selectmonth=new Select(elementWebElement);
			selectmonth.selectByVisibleText("May");
			WebElement element=driver.findElement(By.id("year"));
			Select selectyear=new Select(element);
			selectyear.selectByIndex(23);
			Thread.sleep(2000);
			driver.close();
			
	}

}

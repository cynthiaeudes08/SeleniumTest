package assessment1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class TamilMatrimony {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//select[@id='REGISTERED_BY']")).click();
		driver.findElement(By.xpath("//option[text()='Myself']")).click();
		driver.findElement(By.id("NAME")).sendKeys("Thiya");
		driver.findElement(By.id("DOBDAY")).click();
		driver.findElement(By.xpath("//option[text()='1']")).click();
		driver.findElement(By.id("DOBMONTH")).click();
		driver.findElement(By.xpath("//option[text()='Jan']")).click();
		driver.findElement(By.id("DOBYEAR")).click();
		driver.findElement(By.xpath("//option[text()='2000']")).click();
		driver.findElement(By.id("RELIGION")).click();
		driver.findElement(By.xpath("//option[text()='Christian - Catholic']")).click();
		driver.findElement(By.id("MOTHERTONGUE")).click();
		driver.findElement(By.xpath("//option[text()='Tamil']")).click();
		driver.findElement(By.id("COUNTRY")).click();
		driver.findElement(By.xpath("//option[text()='India']")).click();
		driver.findElement(By.id("MOBILENO")).sendKeys("9876543210");
		driver.findElement(By.id("EMAIL")).sendKeys("abcde@gmail.com");
		Thread.sleep(2000);
		driver.close();
		
		
				
	}

}

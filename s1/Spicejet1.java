package s1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejet1 {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver","D:\\sumit\\WebDriver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		// hit url spicejet link
		driver.get("https://www.spicejet.com/");
		
		driver.manage().window().maximize();
		
		
		// From
		driver.findElement(By.xpath("//div[contains(text(),'From')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'From')]")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//div[contains(text(),'BOM')]")).click();
		
		
		// To
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(text(),'To')])[1]")).sendKeys("Goa");
		driver.findElement(By.xpath("//div[contains(text(),'GOI')]")).click();
				
		
		
		// Calender
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[contains(text(),'Departure Date')]")).click();
	
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41'])[39]")).click();
		
		
		// Passangers Adulsts Select Count
                  driver.findElement(By.xpath("//div[contains(text(),'Passengers')]")).click();

		for(int i=0;i<2;i++)
		{
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
			
		}
		
	     driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[5]/div[1]/div[1]/div[1]/div[2]/div[2]/*[1]")).click();
		Thread.sleep(3000);
	     // Check Radio Button
		System.out.println(driver.findElement(By.xpath("(//div[contains(text(),'Senior Citizen')])[2]")).isSelected());
		driver.findElement(By.xpath("(//div[contains(text(),'Senior Citizen')])[2]")).isSelected();
		driver.findElement(By.xpath("(//div[contains(text(),'Senior Citizen')])[2]")).click();
		 
		System.out.println(driver.findElement(By.xpath("(//div[contains(text(),'Senior Citizen')])[2]")).isSelected());
		
		driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-15d164r r-1otgn73']")).size();
	    
		System.out.println(driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-15d164r r-1otgn73']")).size());
		
		
		
		
		driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[7]/div[2]/div[1]")).click();
	
	}
		
}



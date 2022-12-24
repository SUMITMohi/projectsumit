package s1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xyz {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\sumit\\WebDriver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		// hit url spicejet link
		driver.get("https://www.spicejet.com/");
		
		 driver.findElement(By.xpath("//div[contains(text(),'Passengers')]")).click();
	     Thread.sleep(3000);
	     
	     int i=0;
	     while(i<1)
	     {
	    	 driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
	    	 i++;
	     }
	     driver.findElement(By.xpath("//div[contains(text(),'Passengers')]")).click();

	}

}

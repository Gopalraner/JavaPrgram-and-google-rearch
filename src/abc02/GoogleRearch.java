package abc02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleRearch {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement serchebox = driver.findElement(By.name("q"));
		serchebox.sendKeys("testing");
		Thread.sleep(2000);
		//first method-01
//	WebElement list=driver.findElement(By.xpath("//ul[@role='listbox']//li/descendant::b[text()=' course']"));
//
//	list.click();
//	
	//Method 02
	
	List <WebElement> list =driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
	Thread.sleep(2000);
	System.out.println(list.size());
	for (int i=0; i<list.size(); i++)
		{System.out.println(list.get(i).getText());
		if (list.get(i).getText().contains("testing course"))
		{ list.get(i).click();
		break;
				}
		}
	    
			
		}
}

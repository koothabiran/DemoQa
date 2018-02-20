package demoo;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class qa2 {
	 public static WebDriver driver;
	 public static Dimension size;
	  static String URL="http://demoqa.com/";
	    
	  
	 @Test (priority=1)
	  public void Function() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Varun\\workspace\\Exceldemoqa\\drivers\\chromedriver.exe");
		  ChromeOptions options = new ChromeOptions();
		  	 options.addArguments("--start-maximized");
		  	 driver = new ChromeDriver( options );
		  	 Thread.sleep(2000);
		  	 driver.get(URL);
	  }
	  @Test (priority=2)
	  public void Registration() throws InterruptedException, IOException
	  {
		
//		  JavascriptExecutor jse = (JavascriptExecutor) driver;
//		    jse.executeScript("window.scrollBy(1156, 694)", "");
		  
		  
		//click on Registration button  
		driver.findElement(By.xpath("html/body/div[1]/div/div[2]/aside[1]/div[2]/div/ul/li")).click();  
		Thread.sleep(3000);
		
		//write the first name
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[3]/form/ul/li[1]/div[1]/input")).sendKeys("Testing");
		Thread.sleep(3000);
		
		//click on single 
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[3]/form/ul/li[2]/div/div/input[1]")).click();
		Thread.sleep(2000);
		
		//click on hobby
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[3]/form/ul/li[3]/div/div/input[3]")).click();
		Thread.sleep(2000);
		  
		//click on country
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[3]/form/ul/li[4]/div/select")).click();
		Thread.sleep(2000);
		
		//select country
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[3]/form/ul/li[4]/div/select/option[81]")).click();
		Thread.sleep(2000);
		
		
	   //click on date of birth
	   //click on month
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[3]/form/ul/li[5]/div/div/div[1]/select")).click();
		Thread.sleep(2000);
		 
		//select month
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[3]/form/ul/li[5]/div/div/div[1]/select/option[9]")).click();  
		Thread.sleep(2000);
		
		 //click on date
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[3]/form/ul/li[5]/div/div/div[2]/select")).click();  
		Thread.sleep(2000);
		
		//select date
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[3]/form/ul/li[5]/div/div/div[2]/select/option[11]")).click();  
		Thread.sleep(2000);
		  
		//click on year
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[3]/form/ul/li[5]/div/div/div[3]/select")).click();  
		Thread.sleep(2000);
		  
		//select year
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[3]/form/ul/li[5]/div/div/div[3]/select/option[24]")).click();  
		Thread.sleep(2000);
		  
		//click on phone number
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[3]/form/ul/li[6]/div/input")).sendKeys("9536463366");  
		Thread.sleep(2000);
		  
		//click on choose file button
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[3]/form/ul/li[9]/div/input")).click();
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("D:\\script.exe");
		Thread.sleep(2000);
		
	  }
		@Test (priority=3)
		public void interaction () throws InterruptedException
		{
		//click on draggable button
			driver.findElement(By.xpath("html/body/div[1]/div/div[2]/aside[2]/div[2]/div/ul/li[1]/a")).click();
			Thread.sleep(2000);
			
			//Default functionality
			 //Locate element which you wants to drag.
			  WebElement dragElementFrom = driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div/div[1]/div/div"));
			  Thread.sleep(3000);
			
			  //To drag and drop element by 100 pixel offset In horizontal direction X.
			  new Actions(driver).dragAndDropBy(dragElementFrom, 200, 200).build() .perform();
			  Thread.sleep(5000);
			  
			
			
			//click on constraint movement
			driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div/ul/li[2]/a")).click();
			Thread.sleep(2000);
			
			WebElement element = driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div/div[2]/div/div[1]/p")); 
			Thread.sleep(3000);
			WebElement target = driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div/div[2]/div/div[3]/div[1]"));
			(new Actions(driver)).dragAndDrop(element, target).perform();
	        Thread.sleep(3000); 
			
			//click on draggable and sortable
			driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div/ul/li[5]/a")).click();
			Thread.sleep(2000);
			

			WebElement element0 = driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div/div[5]/div/ul[2]/li[1]")); 
			Thread.sleep(5000);
			 new Actions(driver).dragAndDropBy(element0, 30, 70).build() .perform();
			  Thread.sleep(5000);
		    
			
		//click on droppable button	
		driver.findElement(By.xpath("html/body/div[1]/div/div[2]/aside[2]/div[2]/div/ul/li[2]/a")).click();
		
		WebElement element1 = driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[1]/div/div[1]")); 
		Thread.sleep(2000);
		WebElement target1 = driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[1]/div/div[2]"));
		(new Actions(driver)).dragAndDrop(element1, target1).perform();

			
		//click on resizable button
		driver.findElement(By.xpath("html/body/div[1]/div/div[2]/aside[2]/div[2]/div/ul/li[3]/a")).click();
		Thread.sleep(2000);
		
		// Resizable code	
	     WebElement resizeable = driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[1]/div/div/div[3]"));

	     Actions action = new Actions(driver);
		Action resize = action.clickAndHold(resizeable).moveByOffset(150, 100).release().build();
	    resize.perform();	
		Thread.sleep(3000);	
	     
	     //click on Animate button
	     driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/ul/li[2]/a")).click();
	     Thread.sleep(4000);
	   
	     WebElement resize1 = driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[2]/div/div/div[3]"));

	     Actions action1 = new Actions(driver);
		Action animate = action.clickAndHold(resize1).moveByOffset(100, 200).release().build();

	     animate.perform();	

	     //click on selectable button
	     driver.findElement(By.xpath("html/body/div[1]/div/div[2]/aside[2]/div[2]/div/ul/li[4]/a")).click();
	     Thread.sleep(2000);
	     
	     driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[1]/div/ol/li[1]")).click();
	     Thread.sleep(2000);
	     
	     //clcik on sortable button
	     driver.findElement(By.xpath("html/body/div[1]/div/div[2]/aside[2]/div[2]/div/ul/li[5]/a")).click();
	     Thread.sleep(2000);
	     
	     WebElement sorting = driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[1]/div/ul/li[1]"));
		  Thread.sleep(3000);
	     
		  new Actions(driver).dragAndDropBy(sorting, 0, 100).build() .perform();
		  Thread.sleep(5000);
		  
		  
		  //click on connect list button
		  driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/ul/li[2]/a")).click();
		  Thread.sleep(3000);
		  
		  WebElement sorting1 = driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[2]/div/ul[1]/li[3]"));
		  Thread.sleep(3000);
	     
		  new Actions(driver).dragAndDropBy(sorting1, 100, 0).build() .perform();
		  Thread.sleep(5000);
		  
		  //click on portlets
		  driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/ul/li[4]/a")).click();
		  Thread.sleep(3000);
		  
		  //click on + button
		  driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[4]/div/div[1]/div[1]/div[1]/span")).click();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[4]/div/div[2]/div/div[1]/span")).click();
		  Thread.sleep(3000);
		   
		  
	      }
		
		@Test (priority=4)
		public void widget () throws InterruptedException
		{
		
		//click on Accordion button	
		driver.findElement(By.xpath("html/body/div[1]/div/div[2]/aside[3]/div[2]/div/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		//click on section2 button
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[1]/div/div/h3[2]")).click();
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[1]/div/div/div[2]/p"));
	    ((JavascriptExecutor) driver).executeScript(
	            "arguments[0].scrollIntoView();", element);
		
		//driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[1]/div/div/div[2]")).click();
		Thread.sleep(3000);
		
		//click on menu button
		driver.findElement(By.xpath("html/body/div[1]/div/div[2]/aside[3]/div[2]/div/ul/li[4]/a")).click();
		Thread.sleep(2000);
		
		//click on menu with submenu button
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/ul/li[2]/a")).click();
		Thread.sleep(4000);
		
		//mouse hover code
		 //xpath the parent
		 WebElement getmenu= driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[2]/div/div/ul/li[1]/a"));
		 Actions act = new Actions(driver);
		 act.moveToElement(getmenu).perform();

		 Thread.sleep(5000);
		 //xpath the child
		 WebElement clickElement= driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[2]/div/div/ul/li[1]/ul/li[1]/a"));
		 act.moveToElement(clickElement).click().perform();

		
		//click on slider button
		 driver.findElement(By.xpath("html/body/div[1]/div/div[2]/aside[3]/div[2]/div/ul/li[5]/a")).click();
		 Thread.sleep(3000);
		 
		 WebElement slider = driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div/div/span"));
		  Thread.sleep(3000);
	    
		  new Actions(driver).dragAndDropBy(slider, 300, 0).build() .perform();
		  Thread.sleep(5000);
		 
		}
		 
		@Test (priority=5)
		public void frameswindows () throws InterruptedException
		{
		 driver.findElement(By.xpath("html/body/div[1]/div/div[2]/aside[4]/div[2]/div/ul/li/a")).click();
		 Thread.sleep(2000);
		 
		 //click on new browser tab
		 driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[1]/div/p/a")).click();
		 Thread.sleep(2000);
		
		 //This script helps you to switch over from a Parent window to a Child window and back control to Parent window
		 
		 String parentWindow = driver.getWindowHandle();
		 Set<String> handles =  driver.getWindowHandles();
		    for(String windowHandle  : handles)
		        {
		        if(!windowHandle.equals(parentWindow))
		           {
		           driver.switchTo().window(windowHandle);
		         // <!--Perform your operation here for new window-->
		          driver.close(); //closing child window
		          driver.switchTo().window(parentWindow); //cntrl to parent window
		           }
		        }
		 
		 
		 
		 
		 //click on open seperate window
		 driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/ul/li[2]/a")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[2]/div/p/a")).click();
		 Thread.sleep(2000);
		 
		 //click on frameset button
		 
		 driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/ul/li[3]/a")).click();
		 Thread.sleep(2000);
		 
		 
		 driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[3]/div/p/a")).click();
		 Thread.sleep(2000);
		 
		 
		 
		 
		}

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }


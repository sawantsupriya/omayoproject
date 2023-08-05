package omayoproject;

import java.util.BitSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Omayoseleniumproject {

	

	public static void main(String[] args) throws InterruptedException {
		Select s;
     System.setProperty("webdriver.chrome.driver", "/home/manoj/Desktop/Automation folder/Browser extension/chromedriver");
		Thread.sleep(2000);
		WebDriver driver = new ChromeDriver();
		
		//Maximize 
		driver.manage().window().maximize();
		
		//URL
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		//home
		driver.findElement(By.id("home")).click();
		Thread.sleep(2000);
		
		//Blogs
		//driver.findElement(By.xpath("//*[@id=\"blogsmenu\"]")).click();
		//Thread.sleep(2000);
		
		
		//navigate back to home page
		//driver.navigate().back();
		
		//hyperlink
		driver.findElement(By.id("selenium143")).click();
		Thread.sleep(2000);
		
		String Mainwindow=driver.getWindowHandle();;
		//to handle all new open window 
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		
		while(i1.hasNext()) {
			String ChildWindow=i1.next();
			if(!Mainwindow.equalsIgnoreCase(ChildWindow))
			{
				//switching to child window 
				driver.switchTo().window(ChildWindow);
		
		//closing child window
		driver.close();
			}
		}
		//switching to parent window  i.e main window
	    driver.switchTo().window(Mainwindow);
	    Thread.sleep(2000);
	    
	    //multi selection box
	    driver.findElement(By.id("multiselect1")).click();
	    Thread.sleep(2000);
	   
	    //old Letters - dropdown
	    s= new Select(driver.findElement(By.id("drop1")));
	    s.selectByValue("def");
	    Thread.sleep(2000);
	    
	    //page one 
	    driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/div/div/div/div[1]/h3")).click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    Thread.sleep(2000);
	    
	    //posts (atom)
	    driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[4]/div/a")).click();
	    Thread.sleep(2000);
	    String MainWindow1=driver.getWindowHandle();
	    //To handle all new opened window 
	    Set<String> s2=driver.getWindowHandles();
	    Iterator<String> i2=s2.iterator();
	    
	    while(i1.hasNext()) {
	    	String ChildWindow=i2.next();
	    	if(!MainWindow1.equalsIgnoreCase(ChildWindow))
	    	{
	    		//switching to child window
	    		driver.switchTo().window(ChildWindow);
	    		
	    		//closing the child window
	    		driver.close();
	    	}
	    }
	    //switching to parent window i.e main window
	    driver.switchTo().window(MainWindow1);
	    Thread.sleep(2000);
	    
	    //Text area field
	    driver.findElement(By.id("ta1")).sendKeys("This is  a sample text in page one ");
	    Thread.sleep(2000);
	    
	    //search this blog 
	    //driver.findElement(By.id("q")).sendKeys("Selenium143");
	   // Thread.sleep(2000);
	    
	    //scroll
	    //step1:create object of javascriptexecutor
	    JavascriptExecutor js= (JavascriptExecutor)driver;
	    Thread.sleep(2000);
	    
	    //scrolling by pixel
	    js.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(2000);
	    
	    //selenium143
	   // driver.findElement(By.id("link1")).click();
	    //Thread.sleep(2000);
	    
	    //Text box with pre loaded text
	    driver.findElement(By.name("fname")).clear();
	    driver.findElement(By.name("fname")).sendKeys("supriya");
	    Thread.sleep(2000);
	    
	    //selenium tutorial
	    driver.findElement(By.id("link2")).click();
	    Thread.sleep(2000);
	    driver.navigate().back();		
	    Thread.sleep(2000);		
	    		
	    //enabled button
	    driver.findElement(By.id("but2")).click();
	    Thread.sleep(2000);
	    
	    //Button with same attribute value
	    driver.findElement(By.name("samename")).click();
	    Thread.sleep(2000);
	    
	    //text area field two
	    driver.findElement(By.xpath("//*[@id=\"HTML11\"]/div[1]/textarea")).sendKeys("this is text area which display cat is plying");
	    Thread.sleep(2000);
	    
	    //Radio option 
	   driver.findElement(By.id("radio1")).click();
	   Thread.sleep(2000);
	    
	    //Aleart demo
	   driver.findElement(By.id("alert1")).click();
	    Thread.sleep(2000);
	    
	    //simple aleart
	    driver.switchTo().alert().accept();
	    Thread.sleep(2000);
	    
	   // By default seleted cheak box option
	    driver.findElement(By.id("checkbox2")).click();
	    Thread.sleep(2000);
	    
	  // Read only text box
	    driver.findElement(By.id("rotb")).click();
	    Thread.sleep(2000);
	    
	    //Get prompt
	    driver.findElement(By.id("prompt")).click();
	    Thread.sleep(2000);
	   Alert alert=driver.switchTo().alert();
	   Thread.sleep(2000);
	   alert.sendKeys("supriya");
	   Thread.sleep(2000);
	   alert.accept();
	   Thread.sleep(2000);
	   
	   //Conforming dialog
	   driver.findElement(By.id("confirm")).click();
	   Thread.sleep(2000);
	    driver.switchTo().alert().dismiss();
	    Thread.sleep(2000);
	    
	    //HTML form
	    //login
	    driver.findElement(By.xpath("//*[@id=\"HTML31\"]/div[1]/form/input[1]")).sendKeys("supriya");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"HTML31\"]/div[1]/form/input[2]")).sendKeys("gadkar");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"HTML31\"]/div[1]/form/button")).click();
	    Thread.sleep(2000);
	    
	    //Locate using Name attribute
	    driver.findElement(By.name("textboxn")).sendKeys("prompt");
	    Thread.sleep(2000);
	    
	    //Other sites to practice Automation
	    driver.findElement(By.xpath("//*[@id=\"LinkList1\"]/div/ul/li[1]/a")).click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    Thread.sleep(2000);
	    
	    //having same name and same attribute values
	    driver.findElement(By.id("sa")).click();
		Thread.sleep(2000);
		
		//Locate using class
		 driver.findElement(By.xpath("//*[@id=\"HTML24\"]/div[1]/input")).sendKeys("class");
		 Thread.sleep(2000);
		
		//element having same class name of above field
		 driver.findElement(By.xpath("//*[@id=\"HTML28\"]/div[1]/input")).sendKeys("class");
		 Thread.sleep(2000);
		 
		 //select a vehicle
		 driver.findElement(By.name("vehicle")).click();
		 Thread.sleep(2000);
		 
		 //Display for time and disappear
		 driver.findElement(By.id("alert2")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		//PopUp Window
		driver.findElement(By.xpath("//*[@id=\"HTML37\"]/div[1]/p/a")).click();
		 Thread.sleep(2000);
		 String MainWindow2=driver.getWindowHandle();
		 
		 //To handle all new opened window 
		 Set<String> s3=driver.getWindowHandles();
		 Iterator<String> i3=s3.iterator();
		 
		  while(i1.hasNext()) {
			 String ChildWindow=i3.next();
			  if(!Mainwindow.equalsIgnoreCase(ChildWindow))
			  {
				  //switching to childwindow
				  driver.switchTo().window(ChildWindow);
				  
				  //closing the child window 
				  driver.close();
			  }
		  }
		 //switching to parent window  i.e main window 
		 driver.switchTo().window(MainWindow2);
		 Thread.sleep(2000);
		 
		//Time enable button
		 driver.findElement(By.id("timerButton")).click();
		 Thread.sleep(2000);
		driver.switchTo().alert().accept();
		 Thread.sleep(2000);
		 
		 //Disable enable button 
		 driver.findElement(By.xpath("//*[@id=\"HTML44\"]/h2")).click();
		 Thread.sleep(2000);
		
		//try it button
		 driver.findElement(By.xpath("//*[@id=\"HTML44\"]/div[1]/button[2]")).click();
		 Thread.sleep(2000);
	     
	    //Double click here button
		 Actions a=new Actions(driver);
		 WebElement ele=driver.findElement(By.xpath("//*[@id=\"HTML46\"]/div[1]/button"));
	    a.doubleClick(ele).perform();
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	    Thread.sleep(2000);
	    
	    //cheak this button
	    driver.findElement(By.xpath("//*[@id=\"HTML47\"]/div[1]/button\n"));
	    Thread.sleep(2000);		 
	    		
	    
	   //cheak mr. button
	    driver.findElement(By.xpath("//*[@id=\"HTML47\"]/div[1]/button[1]")).click();
	    Thread.sleep(2000);	
	 
	    //simple login page 
	    driver.findElement(By.xpath("//*[@id=\"HTML42\"]/div[1]/form/input[1]")).sendKeys("Abc");
	    Thread.sleep(2000);
	    
	    //password
	    driver.findElement(By.xpath("//*[@id=\"HTML42\"]/div[1]/form/input[2]")).sendKeys("gadkar");
	    Thread.sleep(2000);
	    
	    //login button
	    driver.findElement(By.xpath("//*[@id=\"HTML42\"]/div[1]/form/input[3]")).click();
	    Thread.sleep(2000);	
	    driver.switchTo().alert().accept();		
	    Thread.sleep(2000);	
	    
	    //Cancel button
	    driver.findElement(By.xpath("//*[@id=\"HTML42\"]/div[1]/form/input[4]")).click();
	    Thread.sleep(2000);	
	    
	    //close 
	    driver.close();
	    
	    
	    
	    
	    		
	    		
	    	}
	    
		
	}



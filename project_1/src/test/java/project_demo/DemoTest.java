package project_demo;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.castcast.crm.generic.fileutlity.FileUtility;

import Base_Repository.BaseClass;

public class DemoTest extends BaseClass{
	
	 @Test
	 public void demo1Test() throws IOException {
		 
		 FileUtility fis=new FileUtility();
		 
		 
		 String url=System.getProperty("url",fis.getDataFromPropertiesFile("Url"));
		 String name=System.getProperty("name" ,fis.getDataFromPropertiesFile("username"));
		 String password=System.getProperty("pwd" ,fis.getDataFromPropertiesFile("password"));
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get(url);
		 driver.findElement(By.name("user_name")).sendKeys(name);
		 driver.findElement(By.name("user_password")).sendKeys(password);
		 
		 System.out.println(url+" "+name+" "+password);
		 System.out.println(1);
		 Assert.assertEquals("hai", "hai");
		 System.out.println(2);
	 }
	 
	 @Test
	 public void demo2Test() {
		 System.out.println(3);
		 Assert.assertEquals("hai", "hai");
		 System.out.println(4);
	 }
	 
	 @Test
	 public void demo3Test() {
		 System.out.println(5);
		 System.out.println(6);
	 }

}

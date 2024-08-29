package project_demo;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.castcast.crm.generic.fileutlity.FileUtility;

import Base_Repository.BaseClass;

public class Demo1Test extends BaseClass{
	
	 @Test
	 public void demo1Test() throws IOException {
		 
		 FileUtility fis=new FileUtility();

		 String url=System.getProperty("url",fis.getDataFromPropertiesFile("Url"));
		 String name=System.getProperty("name" ,fis.getDataFromPropertiesFile("username"));
		 String password=System.getProperty("pwd" ,fis.getDataFromPropertiesFile("password"));
		 
		 System.out.println(url);
		 System.out.println(name);
		 System.out.println(password);
		 
		 System.out.println(10);
		 Assert.assertEquals("hai", "hai");
		 System.out.println(20);
	 }
	 
	 @Test
	 public void demo2Test() {
		 System.out.println(30);
		 Assert.assertEquals("hai", "hai");
		 System.out.println(40);
	 }
	 
	 @Test
	 public void demo3Test() {
		 System.out.println(50);
		 System.out.println(60);
	 }

}

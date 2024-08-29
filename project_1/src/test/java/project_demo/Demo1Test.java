package project_demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base_Repository.BaseClass;

public class Demo1Test extends BaseClass{
	
	 @Test
	 public void demo1Test() {
		 
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

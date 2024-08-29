package project_demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2Test {
	
	 @Test
	 public void demo1Test() {
		 
		 System.out.println(100);
		 Assert.assertEquals("hai", "hai");
		 System.out.println(200);
	 }
	 
	 @Test
	 public void demo2Test() {
		 System.out.println(300);
		 Assert.assertEquals("hai", "hai");
		 System.out.println(400);
	 }
	 
	 @Test
	 public void demo3Test() {
		 System.out.println(500);
		 System.out.println(600);
	 }

}

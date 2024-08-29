package Base_Repository;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
  
	
	@BeforeSuite
	public void configBS() {
		System.out.println("BS");
	}
	
	@BeforeMethod
	public void configBM() {
		System.out.println("BM");
	}
	
	@AfterSuite
	public void configAS() {
		System.out.println("AS");
	}
	
	@AfterMethod
	public void configAM() {
		System.out.println("AM");
	}
}

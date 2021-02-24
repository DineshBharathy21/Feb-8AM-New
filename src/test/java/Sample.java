
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Sample {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class");

	}
	@AfterClass
	public static void afterClass() {
		System.out.println("After class");

		
	}
	@Before
	public void before() {
		System.out.println("Before");

	}
	@After
	public void after() {
		System.out.println("After");

	}
	@Test
	public void tc0() {
		System.out.println("Test");

	}
	
	
	
	
	
}

/*import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;*/

public class Testlogic2 {

	//@BeforeClass
	public static void setUpBeforeClass() throws Exception {
      System.out.println("Before");
	}

	//@AfterClass
	public static void tearDownAfterClass() throws Exception {
   System.out.println("After All");
	 }

	//@Before
	public void setUp() throws Exception {
	  
		 System.out.println("After Each");
	}

	//@After
	public void tearDown() throws Exception {
	System.out.println("After Each ");
		 
	}

	//@Test
	public void test() {
		
		 int a[]= {1,3,4};
		 int b[]= {1,3,4};
      //   assertArrayEquals(a,b);
		  //fail("Not yet implemented");
	}

}

package generatelottotest;

import static org.junit.Assert.*;
import generatelotto.*;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class createLottoTest extends TestCase {

	
	private static createLotto crt = new createLotto();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		 crt =null;
		 
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMain() {
		boolean check= true;
		if(crt.getRandomGenerator()== null){
			
		}
		
		System.out.println(check);
		//if it is false then it passes
		assertFalse("here",!check);
		//fail("Not yet implemented");
	}

	@Test
	public void testCreateIt() {
		fail("Not yet implemented");
	}



}

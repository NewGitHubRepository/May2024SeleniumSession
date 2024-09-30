package myTests;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGFeatures {

	
	@BeforeSuite
	public void connectWithDB() {
	System.out.println("BS-connectWithDB ");
	}
	
	@Test
	public void searchTest() {
		System.out.println("searchTest");
	}
}

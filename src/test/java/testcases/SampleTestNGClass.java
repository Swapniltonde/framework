package testcases;

import org.testng.annotations.Test;

import pageobjects.HomePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SampleTestNGClass extends HomePage {
	
	
  @Test(dataProvider = "dp")
  public void verifyCheckBoxWorking(Integer n, String s) {
  
	  System.out.println("In TEST annotation");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("In @BeforeMethod annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("In @AfterMethod annotation");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("In @@BeforeClass annotation");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("In @AfterClass annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("@BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("@AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("@BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("@AfterSuite");
  }
  

}

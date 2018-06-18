package helper;

import org.openqa.selenium.WebElement;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static void verifyFormAuthWithBlankCredentials() {
		
		SeleniumClass sc = new SeleniumClass();
    	WebElement elem;
		sc.launchApplication("chrome", "https://the-internet.herokuapp.com/");
    	
		elem = sc.identifyElement("linktext", "Form Authentication");
    	sc.performAction(elem, "click", null);
    	
    	elem = sc.identifyElement("xpath", "//button");
    	sc.performAction(elem, "click", null);
    	
    	elem = sc.identifyElement("id", "flash");
    	
    	String actualText = sc.performAction(elem, "gettext", null);
    	String expectedText = "Your username is invalid";
    	System.out.println(actualText);
    	sc.compareValues(actualText.split("!")[0], expectedText);
    	
    	sc.closeApplication(true);		
	}
	
	public static void verifyFormAuthWithBlankCredentialswithwrongcredentials() {
		
		SeleniumClass sc = new SeleniumClass();
    	WebElement elem1;
		sc.launchApplication("chrome", "https://the-internet.herokuapp.com/");
    	
		elem1 = sc.identifyElement("linktext", "Form Authentication");
    	sc.performAction(elem1, "click", null);
    	
    	 elem1 =  sc.identifyElement("id", "username");    	
    	sc.performAction(elem1, "settext", "xyz123");
    	
    	 elem1 =  sc.identifyElement("id", "password");     	
     	sc.performAction(elem1, "settext", "xyz123");
     	
     	elem1 = sc.identifyElement("xpath", "//button");
    	sc.performAction(elem1, "click", null);
     	
    	elem1 = sc.identifyElement("id", "flash");
    	String actualText = sc.performAction(elem1, "gettext", null);
    	String expectedText = "Your username is invalid";
    	
    	sc.compareValues(actualText.split("!")[0], expectedText);
    	
    	sc.closeApplication(true);	
     	
    	
    	
    	//sc.identifyElement(type, address)
    	
    	//elem = sc.identifyElement("xpath", "//button");
    //	sc.performAction(elem, "click", null);
    	
    	/*elem = sc.identifyElement("id", "flash");
    	
    	String actualText = sc.performAction(elem, "gettext", null);
    	String expectedText = "Your username is invalid";
    	System.out.println(actualText);
    	sc.compareValues(actualText.split("!")[0], expectedText);
    	
    	sc.closeApplication(true);		*/
	}
	
    public static void main( String[] args )
    {
    	
    	//verifyFormAuthWithBlankCredentials();
    	verifyFormAuthWithBlankCredentialswithwrongcredentials();
    	
       // System.out.println( "Hello World!" );
    	/*ListExample le = new ListExample();
    	le.addElementsToArraylist();
    	le.addElementsToLinkedList();
    	le.addElementsToVector();
    	le.display();*/
    	/*
    	 SetExample exe1 = new SetExample();
    	    exe1.addElementsToHashSet();
    	    exe1.display();
    	    exe1.addElementsToLinkedHashSet();
    	    exe1.display();
    	    exe1.addElementsToTreeSet();
    	    exe1.display();
    	    exe1.display();*/
    	
    	//IOOperations io = new IOOperations();
    	//io.writeData();
    	/*Base io = new Base();
    	io.writeExcel();
    	io.readExcel();
    	*/
    	
    }
    
  //  SetExample exe1 = new SetExample();
    //exe1.
    
 
}

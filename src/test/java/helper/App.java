package helper;

import org.openqa.selenium.WebElement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SeleniumClass sc = new SeleniumClass();
    	sc.launchApplication("chrome", "http://fb.com");
    	WebElement el = sc.identifyElement("id", "");
    	sc.performAction(el, "click", null);
    	
    	
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
    	Base io = new Base();
    	io.writeExcel();
    	io.readExcel();
    	
    	
    }
    
  //  SetExample exe1 = new SetExample();
    //exe1.
 
}

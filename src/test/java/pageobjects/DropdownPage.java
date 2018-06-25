package pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import helper.SeleniumClass;

public class DropdownPage extends SeleniumClass {
   String xpathHeader = "//h3";
   String cssDropdown ="select#dropdown";
  
   public Select getDropdown() {
	   Select sel = (Select) this.performAction(this.identifyElement("css", cssDropdown), "dropdown", null);
	   return sel;
   }
   
   public List<String> getDropdownValues() {
	   
	   Select sel = this.getDropdown();
	   List<String> ddValues = new ArrayList<String>();
	   List<WebElement> elements = sel.getOptions();
	   for(WebElement elem: elements) {
		   ddValues.add(elem.getText());
	   }
	   return ddValues;	   
	   
   }
   
   public int getValuesCount() {
	   Select sel = this.getDropdown();	   
	   return sel.getOptions().size();
   }
   
   
}

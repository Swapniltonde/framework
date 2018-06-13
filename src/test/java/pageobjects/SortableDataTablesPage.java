package pageobjects;

public class SortableDataTablesPage {
	
	String XpathHeader = "//h3";
	String XpathDataTableText="/html/body/div[2]//div[@class='example']/p[1]";
	String XpathExample1="//h4[contains(text(),'Example 2')]";
	String XpathExample2="//h4[contains(text(),'Example 1')]";
	String XpathExample1Text="/html/body/div[2]//div[@class='example']/p[2]";
	String XpathTableC1="/html/body/div[2]//table[@id='table1']//span[contains(text(),'Last Name')]";
	String XpathTableC2="/html/body/div[2]//table[@id='table1']//span[contains(text(),'First Name')]";
	String XpathTableC3="/html/body/div[2]//table[@id='table1']//span[contains(text(),'Email')]";
	String XpathTableC4="/html/body/div[2]//table[@id='table1']//span[contains(text(),'Due')]";
	String XpathTableC5="/html/body/div[2]//table[@id='table1']//span[contains(text(),'Web Site')]";
	String XpathTableC6="/html/body/div[2]//table[@id='table1']//span[contains(text(),'Action')]";

	String XpathTableR1C1="/html/body/div[2]//table[@id='table1']//td[contains(text(),'Smith')]";
	String XpathTableR1C2="/html/body/div[2]//table[@id='table1']//td[contains(text(),'John')]";
	String XpathTableR1C3="/html/body/div[2]//table[@id='table1']//td[contains(text(),'jsmith@gmail.com')]";

}

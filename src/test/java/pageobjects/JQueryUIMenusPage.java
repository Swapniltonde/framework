package pageobjects;

public class JQueryUIMenusPage 
{
	String xpathHeader ="//h3";
	
	String xpathLinkText = "//a[contains(text(),'JQuery')]";
	
	String xpathContinuePara1 = "//p[contains(text(),'are')]";
	String xpathContinuePara2 = "//p[contains(text(),'Another')]";
	
	String xpathListMenu1 = "//a[contains(text(),'Disabled')]";
	String xpathListMenu2 = "//a[contains(text(),'Enabled')]";
	
	String xpathListSubMenu1 = "//a[contains(text(),'Downloads')]";
	String xpathListSubMenu2 = "//a[contains(text(),'Back')]";
	
	String NestedListSubMenu1 = "//a[contains(text(),'PDF')]";
	String NestedListSubMenu2 = "//a[contains(text(),'CSV')]";
	String NestedListSubMenu3 = "//a[contains(text(),'Excel')]";
}

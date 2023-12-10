package Utils;

import org.openqa.selenium.WebDriver;

import PageObject.Flightpage;
import PageObject.PageObjectManager;


public class DeepInjection {
	public WebDriver driver;
	public String landingpagename;
	public PageObjectManager pageobjectmanager;
	public Testbase testbase;
	public GenericUtils genericutils;
	public Flightpage flightpage;
	public DeepInjection()
	{
		testbase=new Testbase();
		pageobjectmanager=new PageObjectManager(testbase.webdrivermanager());
		genericutils=new GenericUtils(testbase.webdrivermanager());
	}
}

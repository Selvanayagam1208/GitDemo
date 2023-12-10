package Utils;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericUtils {
	public WebDriver driver;
	public WebDriverWait wait;
	static Select select;
	public DeepInjection di;
	
	public GenericUtils(WebDriver driver)
	{
		//this.di=di;
		this.driver=driver;
		//this.driver=di.testbase.webdrivermanager();
	}
	
	public void maximize()
	{
		driver.manage().window().maximize();

	}
	public String gettitle()
	{
		String title=driver.getTitle();
		return title;
	}
	public void implictwait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void switchTowindow()
	{
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> iterator = s1.iterator();
		String parentwindow=iterator.next();
		String childwindow = iterator.next();
		driver.switchTo().window(childwindow);
	}
	
}

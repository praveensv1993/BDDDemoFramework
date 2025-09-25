package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	WebDriver driver;
	public GenericUtils(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void switchToChildWindow()
	{
		Set<String> st=driver.getWindowHandles();
		Iterator<String> it = st.iterator();
		String parent=it.next();
		String child = it.next();
		driver.switchTo().window(child);
	}

}

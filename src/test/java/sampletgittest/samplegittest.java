package sampletgittest;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.steadystate.css.util.Output;

public class samplegittest {
	
	@Test
	public void login test()
	{
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com");
		File src=((TakesScreenshot) wd).getScreenshotAs(Output.FILE);
		
		FileUtils.copyFile(src, new File("C:\\workspace1\\Samplegittest\\screenshot"));
		
	}

}

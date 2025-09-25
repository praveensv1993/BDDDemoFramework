package stepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {
	TestContextSetup testContextSetup; //=new TestContextSetup();
	WebDriver driver;
	//testcontextSetup.
	public Hooks(TestContextSetup testContextSetup) throws IOException
	{
		
		this.testContextSetup=testContextSetup;
	}
	@After
	public void AfterScenario() throws IOException
	{
		testContextSetup.driver.quit();
	}
	@AfterStep
	public void addScreenshot(Scenario scenario) throws IOException
	{
			File sourcePath=((TakesScreenshot)testContextSetup.driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent=FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(fileContent, "image/png", scenario.toString());
	}

}

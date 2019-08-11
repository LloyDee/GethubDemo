package testrunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import initializer.Init;

public class TestRunner extends Init {
	@Parameters("myURL")
	@BeforeClass //(priority = 0)
	public void openURL(String URL) {
		gitBase.openBrowser(URL);
	}
	@Test
	public void logInToJW() {
		gitBase.click(tag.logInTab);
		gitBase.switchTabs(0);
	}
	//@AfterClass 
	public void closeURL() {
		gitBase.closeBrowser();
	}
}

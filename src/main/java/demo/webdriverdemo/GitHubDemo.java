package demo.webdriverdemo;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GitHubDemo {
	public WebDriver driver = new ChromeDriver();

	public void openBrowser(String URL) {
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}

	public void click(By by) {
		driver.findElement(by).click();
	}

	public void switchTabs(int toTab) {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(toTab));
	}

	public void closeBrowser() {
		driver.quit();
	}
}

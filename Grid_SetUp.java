import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid_SetUp {
	public static WebDriver driver;

	public static void main(String[]  args) throws MalformedURLException, InterruptedException{

 		String URL = "https://www.DemoQA.com";
 		String Node = "http://selenium-hub:4444/grid/console";
 		DesiredCapabilities cap = DesiredCapabilities.chrome();

 		driver = new RemoteWebDriver(new URL(Node), cap);

 		driver.navigate().to(URL);
 		Thread.sleep(5000);
 		driver.quit();
 	}		
}

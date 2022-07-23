import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser extends Connection{
    public static WebDriver driver;

    public WebDriver OpenBrowser(String Browser, String url, String path) {
        if(Browser.equals("Chrome")){

            System.setProperty("webdriver.chrome.driver", path+ "/binary/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
            return driver;
        }
        else if (Browser.equals("Firefox")) {

            System.setProperty("webdriver.gecko.driver", path+ "/binary/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get(url);

            return driver;
        }

        return null;
    }



}

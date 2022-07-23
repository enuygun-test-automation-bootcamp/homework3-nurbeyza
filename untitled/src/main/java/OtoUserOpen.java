import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.nio.file.Path;
import java.nio.file.Paths;

public class OtoUserOpen {
    public static void main(String[] args) throws InterruptedException {

        Path resourceDirectory = Paths.get("untitled", "src","main", "resources");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();
        System.setProperty("webdriver.chrome.driver", absolutePath + "/binary/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=C:\\Users\\nuroz\\AppData\\Local\\Google\\Chrome\\User Data");
        options.addArguments("--start-maximized");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");
        driver.quit();
    }



}

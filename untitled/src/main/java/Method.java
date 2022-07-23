import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Method {

    public void openLoginPage(WebDriver driver){
        driver.findElement(By.id("ctx-LoginBtn")).click();
        driver.findElement(By.id("ctx-LoginBtn")).click();
    }
    public void openSignup(WebDriver driver) {
       driver.findElement(By.id("ctx-RegisterBtn")).click();
       driver.findElement(By.id("ctx-RegisterBtn")).click();
    }
}

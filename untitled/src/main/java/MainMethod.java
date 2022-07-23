import org.openqa.selenium.WebDriver;

public class MainMethod {
    public static void main(String[] args) {

        Browser browser=new Browser();

        Method method=new Method();
        method.openLoginPage(browser.OpenBrowser("Chrome", browser.url(),browser.path()));
        method.openLoginPage( browser.OpenBrowser("Firefox",browser.url(),browser.path()));
        method.openSignup(browser.OpenBrowser("Chrome", browser.url(),browser.path()));
        method.openSignup( browser.OpenBrowser("Firefox",browser.url(),browser.path()));
    }

}
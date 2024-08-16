package pages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    String element1 = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]";
    String element2 = "//h2[contains(text(),'New User Signup!')]";


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void navigatePage() {
        this.navigatePageLogin("https://www.automationexercise.com/");
    }

    public void clicPageLogin() {
        this.clickElement(element1);
    }

    public void textoValidar() {
        this.textValidate(element2);
    }

    public void closesBrowser() {
        this.closeBrowser();
    }

}

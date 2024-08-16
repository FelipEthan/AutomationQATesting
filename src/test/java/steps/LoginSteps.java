package steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.LoginPage;

public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;

    public LoginSteps() {
        this.driver = BasePage.initDriver();
        this.loginPage = new LoginPage(driver);
    }
    @Given("I am on the automation page")
    public void navigatePage(){
        this.loginPage.navigatePage();
        this.loginPage.clicPageLogin();
        this.loginPage.textoValidar();
        this.loginPage.closesBrowser();
    }
}


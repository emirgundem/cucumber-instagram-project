package StepDefiniton;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

    WebDriver driver;
    LoginPage login;
    @Given("browser is open")
    public void browser_is_open() {
        System.out.println("Inside Step : Browser is open");
        System.setProperty("webdriver.chrome.driver","src/test/java/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @And("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("Inside Step : user is on login page");
        driver.navigate().to("https://www.instagram.com/");
        String title =  driver.getTitle();
        System.out.println(title);
    }

    @When("^user enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password) throws InterruptedException {
        System.out.println("Inside Step : user enters username and password");
        login = new LoginPage(driver);
        login.enterUsername(username);
        login.enterPassword(password);
        Thread.sleep(2000);
    }
    @And("user clicks on login")
    public void user_clicks_on_login() {
        System.out.println("Inside Step : user clicks on login");
        login.clickLoginButton();
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() throws InterruptedException {
        System.out.println("Inside Step : user is navigated to the home page");
        Thread.sleep(8000);
        driver.close();
        driver.quit();
    }
}

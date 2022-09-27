package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    private By ınputUsername = By.xpath("//input[@name='username']");
    private By ınputPassword = By.xpath("//input[@name='password']");
    private By loginButton = By.xpath("//button[contains(@type,'submit')]//div[1]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(ınputUsername).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(ınputPassword).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
}
